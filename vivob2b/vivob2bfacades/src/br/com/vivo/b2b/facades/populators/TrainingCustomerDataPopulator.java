package br.com.vivo.b2b.facades.populators;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;


public class TrainingCustomerDataPopulator extends CustomerPopulator implements Populator<CustomerModel, CustomerData> {

    @Override
    public void populate(CustomerModel source, CustomerData target) {
        target.setCpf(source.getCpf());
        target.setRg(source.getRg());
        super.populate(source, target);
    }
}
