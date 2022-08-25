package br.com.vivo.b2b.facades.trainigcustomerdata.impl;

import br.com.vivo.b2b.core.service.TrainingCustomerService;
import br.com.vivo.b2b.facades.trainigcustomerdata.TrainingCustomerDataFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.apache.log4j.Logger;

public class DefaultTrainingCustomerData implements TrainingCustomerDataFacade {

    private static final Logger LOGGER = Logger.getLogger(DefaultTrainingCustomerData.class);
    private TrainingCustomerService trainingCustomerService;

    private Converter<CustomerModel, CustomerData> trainingConverter;

    @Override
    public CustomerData buscarClientePorId(String customerId) {
        LOGGER.info("Facade foi invocado e começou o trabalho para buscar o cliente de id: " + customerId);
        CustomerModel customerModel = trainingCustomerService.buscarClientePorId(customerId);
        LOGGER.info("nome do customer que retornou da chamada do service: " + customerModel.getName());
        CustomerData customerDataConvertido = trainingConverter.convert(customerModel);
        LOGGER.info("nome do Customer que retornou após ser convertido em dada: " + customerDataConvertido.getName());
        return customerDataConvertido;
    }

    public TrainingCustomerService getTrainingCustomerService() {
        return trainingCustomerService;
    }

    public void setTrainingCustomerService(TrainingCustomerService trainingCustomerService) {
        this.trainingCustomerService = trainingCustomerService;
    }

    public Converter<CustomerModel, CustomerData> getTrainingConverter() {
        return trainingConverter;
    }

    public void setTrainingConverter(Converter<CustomerModel, CustomerData> trainingConverter) {
        this.trainingConverter = trainingConverter;
    }
}
