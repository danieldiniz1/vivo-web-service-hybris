package br.com.vivo.b2b.facades.populators;

import de.hybris.platform.b2ctelcofacades.converters.populator.TmaCustomerReversePopulator;
import de.hybris.platform.b2ctelcofacades.data.TmaIdentificationData;
import de.hybris.platform.b2ctelcoservices.model.TmaIdentificationModel;
import de.hybris.platform.b2ctelcoservices.services.TmaIdentificationService;
import de.hybris.platform.commercefacades.user.converters.populator.CustomerReversePopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;


public class TrainingCustomerDataReversePopulator extends TmaCustomerReversePopulator implements Populator<CustomerData, CustomerModel> {

    public TrainingCustomerDataReversePopulator(Converter<TmaIdentificationData, TmaIdentificationModel> identificationReverseConverter, TmaIdentificationService tmaIdentificationService) {
        super(identificationReverseConverter, tmaIdentificationService);
    }

    @Override
    public void populate(CustomerData source, CustomerModel target) throws ConversionException {
        target.setCpf(source.getCpf());
        target.setRg(source.getRg());
        target.setCustomerID(source.getCustomerId());
        super.populate(source, target);

    }
}
