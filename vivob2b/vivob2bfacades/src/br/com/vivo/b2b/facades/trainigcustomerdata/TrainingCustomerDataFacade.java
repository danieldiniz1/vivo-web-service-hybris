package br.com.vivo.b2b.facades.trainigcustomerdata;

import de.hybris.platform.commercefacades.user.data.CustomerData;

public interface TrainingCustomerDataFacade {

    CustomerData buscarClientePorId(String customerId);
}
