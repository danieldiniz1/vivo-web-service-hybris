package br.com.vivo.b2b.facades.dto;

public class CurrencyDTO {

    private String active;
    private String isoCode;
    private String name;
    private String simbol;

    public CurrencyDTO() {
    }

    public CurrencyDTO(String active, String isoCode, String name, String simbol) {
        this.active = active;
        this.isoCode = isoCode;
        this.name = name;
        this.simbol = simbol;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
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

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }
}
