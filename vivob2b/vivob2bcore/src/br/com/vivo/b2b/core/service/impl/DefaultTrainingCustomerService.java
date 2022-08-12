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
        return trainingCustomerDao.getAllCustomers();
    }

    public TrainingCustomerDao getTrainingCustomerDao() {
        return trainingCustomerDao;
    }

    public void setTrainingCustomerDao(TrainingCustomerDao trainingCustomerDao) {
        this.trainingCustomerDao = trainingCustomerDao;
    }
}
