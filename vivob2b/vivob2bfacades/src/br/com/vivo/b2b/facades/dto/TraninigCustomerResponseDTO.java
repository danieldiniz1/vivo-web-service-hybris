package br.com.vivo.b2b.facades.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;

public class TraninigCustomerResponseDTO {


    private String name;
    private String cpf;

    private AdrressDTO adrressDTO;

    private CurrencyDTO currencyDTO;
    private LanguageDTO languageDTO;


    public TraninigCustomerResponseDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public AdrressDTO getAdrressDTO() {
        return adrressDTO;
    }

    public void setAdrressDTO(AdrressDTO adrressDTO) {
        this.adrressDTO = adrressDTO;
    }

    public CurrencyDTO getCurrencyDTO() {
        return currencyDTO;
    }

    public void setCurrencyDTO(CurrencyDTO currencyDTO) {
        this.currencyDTO = currencyDTO;
    }

    public LanguageDTO getLanguageDTO() {
        return languageDTO;
    }

    public void setLanguageDTO(LanguageDTO languageDTO) {
        this.languageDTO = languageDTO;
    }
}
