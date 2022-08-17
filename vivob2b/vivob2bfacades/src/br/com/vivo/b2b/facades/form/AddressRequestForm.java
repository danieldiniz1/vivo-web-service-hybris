package br.com.vivo.b2b.facades.form;

public class AddressRequestForm {

    private CountryForm country;
    private String apartment;
    private String building;
    private String cellphone;
    private String companyName;
    private String complement;
    private boolean billingAddress;


    public AddressRequestForm() {
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public boolean isBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(boolean billingAddress) {
        this.billingAddress = billingAddress;
    }

    public CountryForm getCountry() {
        return country;
    }

    public void setCountry(CountryForm country) {
        this.country = country;
    }
}
