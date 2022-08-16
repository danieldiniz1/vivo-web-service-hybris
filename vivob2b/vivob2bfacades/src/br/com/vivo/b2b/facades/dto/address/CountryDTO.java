package br.com.vivo.b2b.facades.dto.address;

public class CountryDTO {

    private String isoCode;
    private String name;

    public CountryDTO(String isoCode, String name) {
        this.isoCode = isoCode;
        this.name = name;
    }

    public CountryDTO() {
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
