package br.com.vivo.b2b.facades.customer.impl;

import br.com.vivo.b2b.core.service.TrainingCustomerService;
import br.com.vivo.b2b.facades.customer.TrainingCustomerFacade;
import br.com.vivo.b2b.facades.dto.TraninigCustomerResponseDTO;
import br.com.vivo.b2b.facades.form.TrainingCustomerRequestForm;
import br.com.vivo.b2b.facades.populators.TrainingCustomerPopulator;
import br.com.vivo.b2b.facades.populators.TrainingCustomerReversePopulator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class DefaultTrainingCustomerFacade implements TrainingCustomerFacade {

    private static final Logger LOGGER = Logger.getLogger(DefaultTrainingCustomerFacade.class);

    private TrainingCustomerService trainingCustomerService;

    private TrainingCustomerPopulator trainingCustomerPopulator;

    private ModelService modelService;

    private TrainingCustomerReversePopulator trainingCustomerReversePopulator;

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
        convertModelToDTO(trainingCustomerService.buscarClientePorId(customerId), traninigCustomerResponseDTO);

        return traninigCustomerResponseDTO;
    }

    private void convertModelToDTO(CustomerModel customerModel, TraninigCustomerResponseDTO traninigCustomerResponseDTO) {
        trainingCustomerPopulator.populate(customerModel, traninigCustomerResponseDTO);
    }

    @Override
    public TraninigCustomerResponseDTO cadastrarNovoCliente(TrainingCustomerRequestForm customerForm) {
        trainingCustomerService.cadastrarNovoCliente(convertFormToModel(customerForm));
        return buscarClientePorId(customerForm.getId());
    }

    @Override
    public void deletarClientePorId(String customerId) {
        trainingCustomerService.deletarClientePorId(customerId);
    }

    @Override
    public void atualizarCustomer(TrainingCustomerRequestForm form) {
        trainingCustomerService.atualizarCliente(form.getId(), form.getCpf());
    }

    private CustomerModel convertFormToModel(TrainingCustomerRequestForm customerForm) {
        CustomerModel customer = modelService.create(CustomerModel.class);
        trainingCustomerReversePopulator.populate(customerForm,customer);
        return customer;
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

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public TrainingCustomerReversePopulator getTrainingCustomerReversePopulator() {
        return trainingCustomerReversePopulator;
    }

    public void setTrainingCustomerReversePopulator(TrainingCustomerReversePopulator trainingCustomerReversePopulator) {
        this.trainingCustomerReversePopulator = trainingCustomerReversePopulator;
    }
}
