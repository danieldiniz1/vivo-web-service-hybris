package br.com.vivo.b2b.facades.populators;

import br.com.vivo.b2b.facades.form.AddressRequestForm;
import br.com.vivo.b2b.facades.form.CountryForm;
import br.com.vivo.b2b.facades.form.TrainingCustomerRequestForm;
import de.hybris.platform.commerceservices.constants.GeneratedCommerceServicesConstants;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.storelocator.jalo.PointOfService;

public class TrainingCustomerReversePopulator implements Populator<TrainingCustomerRequestForm,CustomerModel> {

    private ModelService modelService;

    @Override
    public void populate(TrainingCustomerRequestForm source, CustomerModel target) throws ConversionException {
        target.setCpf(source.getCpf());
        target.setCustomerID(source.getId());
        target.setUid(source.getUid());
        target.setName(source.getName());

//        target.setAddress(populateToAddresModel(source.getAddress()));
    }

    private AddressModel populateToAddresModel(AddressRequestForm address) {
        AddressModel addressModel = modelService.create(AddressModel.class);
        addressModel.setBillingAddress(address.isBillingAddress());
        addressModel.setBuilding(address.getBuilding());
        addressModel.setCellphone(address.getCellphone());
        addressModel.setCountry(populateToCountryModel(address.getCountry()));
        addressModel.setOwner(modelService.create(PointOfService.class));

        return addressModel;
    }

    private CountryModel populateToCountryModel(CountryForm country) {
        CountryModel countryModel = modelService.create(CountryModel.class);
        countryModel.setName(country.getName());
        countryModel.setIsocode(country.getIsocode());
        return countryModel;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
