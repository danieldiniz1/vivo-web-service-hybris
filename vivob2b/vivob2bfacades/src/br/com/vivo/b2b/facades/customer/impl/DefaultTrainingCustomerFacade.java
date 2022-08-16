package br.com.vivo.b2b.facades.customer.impl;

import br.com.vivo.b2b.core.service.TrainingCustomerService;
import br.com.vivo.b2b.facades.customer.TrainingCustomerFacade;
import br.com.vivo.b2b.facades.dto.TraninigCustomerResponseDTO;
import br.com.vivo.b2b.facades.populators.TrainingCustomerPopulator;
import de.hybris.platform.core.model.user.CustomerModel;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class DefaultTrainingCustomerFacade implements TrainingCustomerFacade {

    private static final Logger LOGGER = Logger.getLogger(DefaultTrainingCustomerFacade.class);

    private TrainingCustomerService trainingCustomerService;

    private TrainingCustomerPopulator trainingCustomerPopulator;

    @Override
    public List<TraninigCustomerResponseDTO> getAllCustomers() {
        LOGGER.info("Facade iniciou o trabalho de busca de customers");
        List<CustomerModel> allCustomers = trainingCustomerService.getAllCustomers();
        List<TraninigCustomerResponseDTO> listCustomers = new ArrayList<>();
        TraninigCustomerResponseDTO responseDTO = new TraninigCustomerResponseDTO();

        allCustomers.forEach(c -> {
//            LOGGER.info("Facade converteu o customer: " + c.getName());
            LOGGER.info("ResponseDTO antes populate: " + responseDTO.getName());
            listCustomers.forEach(i -> LOGGER.info("Lista de customer inicial: " + i.getName()));
            trainingCustomerPopulator.populate(c,responseDTO);
            LOGGER.info("ResponseDTO DEPOIS populate: " + responseDTO.getName());

            listCustomers.add(responseDTO);
            listCustomers.forEach(i -> LOGGER.info("Lista de customer após ser adicionado novo customer: " + i.getName()));
        });
        return listCustomers;
    }

    @Override
    public TraninigCustomerResponseDTO buscarClientePorId(String customerId) {
        LOGGER.info("Facade iniciou o projeto para buscar o cliente por id");

        TraninigCustomerResponseDTO traninigCustomerResponseDTO = new TraninigCustomerResponseDTO();
        trainingCustomerPopulator.populate(trainingCustomerService.buscarClientePorId(customerId),traninigCustomerResponseDTO);

        return traninigCustomerResponseDTO;
    }


    public TrainingCustomerService getTrainingCustomerService() {
        return trainingCustomerService;
    }

    public void setTrainingCustomerService(TrainingCustomerService trainingCustomerService) {
        this.trainingCustomerService = trainingCustomerService;
    }

    public TrainingCustomerPopulator getTrainingCustomerPopulator() {
        return trainingCustomerPopulator;
    }

    public void setTrainingCustomerPopulator(TrainingCustomerPopulator trainingCustomerPopulator) {
        this.trainingCustomerPopulator = trainingCustomerPopulator;
    }
}
