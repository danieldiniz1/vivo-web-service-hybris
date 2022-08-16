package br.com.vivo.b2b.facades.populators;

import br.com.vivo.b2b.facades.dto.AdrressDTO;
import br.com.vivo.b2b.facades.dto.CurrencyDTO;
import br.com.vivo.b2b.facades.dto.LanguageDTO;
import br.com.vivo.b2b.facades.dto.TraninigCustomerResponseDTO;
import br.com.vivo.b2b.facades.dto.address.CountryDTO;
import br.com.vivo.b2b.facades.dto.address.RegionDTO;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.c2l.RegionModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class TrainingCustomerPopulator implements Populator<CustomerModel, TraninigCustomerResponseDTO> {
    @Override
    public void populate(CustomerModel source, TraninigCustomerResponseDTO target) throws ConversionException {
        target.setName(source.getName());
        target.setCpf(source.getCpf());
        target.setAdrressDTO(convertToAddresDTO(source.getAddress()));
        target.setLanguageDTO(convertToLanguageDTO(source.getLanguage()));
        target.setCurrencyDTO(convertToCurrencyDTO(source.getCurrency()));

    }

    private CurrencyDTO convertToCurrencyDTO(CurrencyModel currency) {
        if (currency == null){
            currency = new CurrencyModel();
        }
        CurrencyDTO currencyDTO = new CurrencyDTO();
        currencyDTO.setIsoCode(currency.getIsocode() == null ? "Default " : currency.getIsocode());
        currencyDTO.setSimbol(currency.getSymbol() == null ? "Default " : currency.getSymbol());
        currencyDTO.setActive(currency.getActive() == null ? "Default " : currency.getActive().toString());
        return currencyDTO;
    }

    private LanguageDTO convertToLanguageDTO(LanguageModel language) {
        if (language == null){
            language = new LanguageModel();
        }
        LanguageDTO languageDTO = new LanguageDTO();
        languageDTO.setIsoCode(language.getIsocode() == null ? "Default " : language.getIsocode());
        return  languageDTO;
    }

    private AdrressDTO convertToAddresDTO(AddressModel address) {
        AdrressDTO addressDTO = new AdrressDTO();
        addressDTO.setApartament(address.getAppartment() == null ? "Default " : address.getAppartment());
        addressDTO.setBillingAddres(address.getBillingAddress() == null ? "Default " : address.getBillingAddress().toString());
        addressDTO.setBuilding(addressDTO.getBuilding() == null ? "Default " : address.getBuilding());
        addressDTO.setCellphone(address.getCellphone() == null ? "Default " : address.getCellphone());
        addressDTO.setCompanyName(address.getCompany() == null ? "Default " : address.getCompany());
        addressDTO.setDistrict(address.getDistrict() == null ? "Default " : address.getDistrict());
        addressDTO.setEmail(address.getEmail() == null ? "Default " : address.getEmail());
        addressDTO.setFirstName(address.getFirstname() == null ? "Default " : address.getFirstname());
        addressDTO.setLastName(address.getLastname() == null ? "Default " : address.getLastname());
        addressDTO.setInstallationAddress(address.getInstallationAddress() == null ? "Default " : address.getInstallationAddress().toString());
        addressDTO.setPostalCode(address.getPostalcode() == null ? "Default " : address.getPostalcode());
        addressDTO.setShippingAddres(address.getShippingAddress() == null ? "Default " : address.getShippingAddress().toString());
        addressDTO.setTitle(address.getTitle() == null ? "Default " : address.getTitle().getName());
        addressDTO.setTitleCode(address.getTitle() == null ? "Default " : address.getTitle().getCode());
        addressDTO.setTown(address.getTown() == null ? "Default " : address.getTown());
        addressDTO.setVisibleInAddressBook(address.getVisibleInAddressBook() == null ? "Default " : address.getVisibleInAddressBook().toString());
        addressDTO.setRegionDTO(convertToRegionDTO(address.getRegion()));
        addressDTO.setCountryDTO(convertToCountryDto(address.getCountry()));
        return addressDTO;
    }

    private RegionDTO convertToRegionDTO(RegionModel region) {
        RegionDTO regionDTO = new RegionDTO();
        if (region == null){
            region = new RegionModel();
        }
        regionDTO.setCountryIso(region.getIsocode() == null ? "Default " : region.getIsocode());
        regionDTO.setIsoCodeShort(region.getIsocodeShort() == null ? "Default " : region.getIsocodeShort());
        regionDTO.setName("default");
        return regionDTO;
    }

    private CountryDTO convertToCountryDto(CountryModel country) {
        CountryDTO countryDTO = new CountryDTO();
        countryDTO.setIsoCode(country.getIsocode() == null ? "Default " : country.getIsocode());
        countryDTO.setName(country.getName() == null ? "Default " : country.getName());
        return countryDTO;
    }


}
