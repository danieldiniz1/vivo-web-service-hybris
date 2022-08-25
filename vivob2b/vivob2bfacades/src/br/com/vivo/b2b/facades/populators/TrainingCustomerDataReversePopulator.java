package br.com.vivo.b2b.facades.populators;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.converters.populator.CustomerReversePopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;


public class TrainingCustomerDataReversePopulator extends CustomerReversePopulator implements Populator<CustomerData, CustomerModel> {

    @Override
    public void populate(CustomerData source, CustomerModel target) throws ConversionException {
        target.setCpf(source.getCpf());
        super.populate(source, target);
        target.setRg(source.getRg());
    }
}
