package br.com.vivo.b2b.facades.populators;

import br.com.vivo.b2b.facades.dto.AdrressDTO;
import br.com.vivo.b2b.facades.dto.TraninigCustomerResponseDTO;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class TrainingCustomerPopulator implements Populator<CustomerModel, TraninigCustomerResponseDTO> {
    @Override
    public void populate(CustomerModel source, TraninigCustomerResponseDTO target) throws ConversionException {
        target.setName(source.getName());
        target.setCpf(source.getCpf());
        target.setAdrressDTO(convertToAddresDTO(source.getAddress()));


    }

    private AdrressDTO convertToAddresDTO(AddressModel address) {
        return new AdrressDTO(address.getFirstname(), address.getLastname());
    }
}
