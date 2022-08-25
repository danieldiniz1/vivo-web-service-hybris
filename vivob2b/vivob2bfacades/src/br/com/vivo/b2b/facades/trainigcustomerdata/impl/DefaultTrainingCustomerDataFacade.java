package br.com.vivo.b2b.facades.trainigcustomerdata.impl;

import br.com.vivo.b2b.core.service.TrainingCustomerService;
import br.com.vivo.b2b.facades.trainigcustomerdata.TrainingCustomerDataFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.apache.log4j.Logger;

public class DefaultTrainingCustomerDataFacade implements TrainingCustomerDataFacade {

    private static final Logger LOGGER = Logger.getLogger(DefaultTrainingCustomerDataFacade.class);
    private TrainingCustomerService trainingCustomerService;

    private Converter<CustomerModel, CustomerData> customerConverter;
    private Converter<CustomerData, CustomerModel> customerReverseConverter;

    @Override
    public CustomerData buscarClientePorId(String customerId) {
        LOGGER.info("Facade foi invocado e começou o trabalho para buscar o cliente de id: " + customerId);
        CustomerModel customerModel = trainingCustomerService.buscarClientePorId(customerId);
        LOGGER.info("nome do customer que retornou da chamada do service: " + customerModel.getName());
        CustomerData customerDataConvertido = customerConverter.convert(customerModel);
        LOGGER.info("nome do Customer que retornou após ser convertido em dada: " + customerDataConvertido.getName());
        return customerDataConvertido;
    }

    @Override
    public CustomerData criarNovoCliente(CustomerData customerData) {
        LOGGER.info("iniciando conversão de Data para Model");
        CustomerModel customerModel = customerReverseConverter.convert(customerData);
        LOGGER.info("finalizado conversão de Data para model");
        trainingCustomerService.cadastrarNovoCliente(customerModel);
        return buscarClientePorId(customerData.getCustomerId());
    }

    public TrainingCustomerService getTrainingCustomerService() {
        return trainingCustomerService;
    }

    public void setTrainingCustomerService(TrainingCustomerService trainingCustomerService) {
        this.trainingCustomerService = trainingCustomerService;
    }

    public Converter<CustomerModel, CustomerData> getCustomerConverter() {
        return customerConverter;
    }

    public void setCustomerConverter(Converter<CustomerModel, CustomerData> customerConverter) {
        this.customerConverter = customerConverter;
    }

    public Converter<CustomerData, CustomerModel> getCustomerReverseConverter() {
        return customerReverseConverter;
    }

    public void setCustomerReverseConverter(Converter<CustomerData, CustomerModel> customerReverseConverter) {
        this.customerReverseConverter = customerReverseConverter;
    }
}
