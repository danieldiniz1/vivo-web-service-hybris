package br.com.vivo.b2b.facades.trainigcustomerdata.impl;

import br.com.vivo.b2b.facades.trainigcustomerdata.TrainingCustomerDataFacade;
import org.apache.log4j.Logger;

public class DefaultTrainingCustomerData implements TrainingCustomerDataFacade {

    private static final Logger LOGGER = Logger.getLogger(DefaultTrainingCustomerData.class);

    @Override
    public void buscarClientePorId(String customerId) {
        LOGGER.info("Facade foi invocado e começou o trabalho para buscar o cliente de id: " + customerId);
    }
}
