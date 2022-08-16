package br.com.vivo.b2b.facades.dto.address;

public class RegionDTO {

    private String countryIso;
    private String isoCode;
    private String isoCodeShort;
    private String name;
    private String role;

    public RegionDTO() {
    }

    public RegionDTO(String countryIso, String isoCode, String isoCodeShort, String name, String role) {
        this.countryIso = countryIso;
        this.isoCode = isoCode;
        this.isoCodeShort = isoCodeShort;
        this.name = name;
        this.role = role;
    }

    public String getCountryIso() {
        return countryIso;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getIsoCodeShort() {
        return isoCodeShort;
    }

    public void setIsoCodeShort(String isoCodeShort) {
        this.isoCodeShort = isoCodeShort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
