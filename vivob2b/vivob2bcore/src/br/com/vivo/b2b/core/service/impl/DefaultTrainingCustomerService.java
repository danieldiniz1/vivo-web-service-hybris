package br.com.vivo.b2b.core.service.impl;

import br.com.vivo.b2b.core.dao.TrainingCustomerDao;
import br.com.vivo.b2b.core.service.TrainingCustomerService;
import de.hybris.platform.core.model.user.CustomerModel;
import org.apache.log4j.Logger;

import java.util.List;

public class DefaultTrainingCustomerService implements TrainingCustomerService {

    private static final Logger LOGGER = Logger.getLogger(DefaultTrainingCustomerService.class);

    private TrainingCustomerDao trainingCustomerDao;

    @Override
    public List<CustomerModel> getAllCustomers() {
        LOGGER.info("Service iniciou o trabalho de busca de customers");
        return trainingCustomerDao.getAllCustomers();
    }

    @Override
    public CustomerModel buscarClientePorId(String customerId) {
        LOGGER.info("Service iniciou o trabalho de busca do cliente.");
        return trainingCustomerDao.buscaClientePorId(customerId);
    }

    @Override
    public void cadastrarNovoCliente(CustomerModel customerModel) {
        trainingCustomerDao.cadastrarNovoCliente(customerModel);
    }

    @Override
    public void deletarClientePorId(String customerId) {
        trainingCustomerDao.deletarClientePorId(customerId);
    }

    @Override
    public void atualizarCliente(String id, String cpf) {

    }

    public TrainingCustomerDao getTrainingCustomerDao() {
        return trainingCustomerDao;
    }

    public void setTrainingCustomerDao(TrainingCustomerDao trainingCustomerDao) {
        this.trainingCustomerDao = trainingCustomerDao;
    }
}
