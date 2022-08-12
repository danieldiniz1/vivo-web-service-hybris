package br.com.vivo.b2b.facades.populators;

import br.com.vivo.b2b.facades.dto.TraninigCustomerResponseDTO;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class TrainingCustomerPopulator implements Populator<CustomerModel, TraninigCustomerResponseDTO> {
    @Override
    public void populate(CustomerModel source, TraninigCustomerResponseDTO target) throws ConversionException {
        target.setCustomerModel(source);
    }
}
