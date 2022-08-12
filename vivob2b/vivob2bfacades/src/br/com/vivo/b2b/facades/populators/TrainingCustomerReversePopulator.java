package br.com.vivo.b2b.facades.populators;

import br.com.vivo.b2b.facades.dto.TraninigCustomerResponseDTO;
import br.com.vivo.b2b.facades.form.TrainingCustomerRequestForm;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class TrainingCustomerReversePopulator implements Populator<TrainingCustomerRequestForm,CustomerModel> {

    @Override
    public void populate(TrainingCustomerRequestForm source, CustomerModel target) throws ConversionException {

    }
}
