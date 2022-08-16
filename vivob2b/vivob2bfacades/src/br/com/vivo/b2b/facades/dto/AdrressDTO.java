package br.com.vivo.b2b.facades.dto;

import br.com.vivo.b2b.facades.dto.address.CountryDTO;
import br.com.vivo.b2b.facades.dto.address.RegionDTO;

public class AdrressDTO {

    private String firstName;
    private String lastName;
    private String apartament;
    private String billingAddres;
    private String building;
    private String cellphone;
    private String companyName;
    private String complement;
    private String defaultAddres;
    private String district;
    private String email;
    private String formattedAddress;
    private String installationAddress;
    private String line1;
    private String line2;
    private String phone;
    private String postalCode;
    private String referencePoint;
    private String riskArea;
    private String shippingAddres;
    private String title;
    private String titleCode;
    private String town;
    private String visibleInAddressBook;
    private RegionDTO regionDTO;
    private CountryDTO countryDTO;



    public AdrressDTO() {
    }

    public AdrressDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getApartament() {
        return apartament;
    }

    public void setApartament(String apartament) {
        this.apartament = apartament;
    }

    public String getBillingAddres() {
        return billingAddres;
    }

    public void setBillingAddres(String billingAddres) {
        this.billingAddres = billingAddres;
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

    public String getDefaultAddres() {
        return defaultAddres;
    }

    public void setDefaultAddres(String defaultAddres) {
        this.defaultAddres = defaultAddres;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    public String getInstallationAddress() {
        return installationAddress;
    }

    public void setInstallationAddress(String installationAddress) {
        this.installationAddress = installationAddress;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getReferencePoint() {
        return referencePoint;
    }

    public void setReferencePoint(String referencePoint) {
        this.referencePoint = referencePoint;
    }

    public String getRiskArea() {
        return riskArea;
    }

    public void setRiskArea(String riskArea) {
        this.riskArea = riskArea;
    }

    public String getShippingAddres() {
        return shippingAddres;
    }

    public void setShippingAddres(String shippingAddres) {
        this.shippingAddres = shippingAddres;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleCode() {
        return titleCode;
    }

    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getVisibleInAddressBook() {
        return visibleInAddressBook;
    }

    public void setVisibleInAddressBook(String visibleInAddressBook) {
        this.visibleInAddressBook = visibleInAddressBook;
    }

    public RegionDTO getRegionDTO() {
        return regionDTO;
    }

    public void setRegionDTO(RegionDTO regionDTO) {
        this.regionDTO = regionDTO;
    }

    public CountryDTO getCountryDTO() {
        return countryDTO;
    }

    public void setCountryDTO(CountryDTO countryDTO) {
        this.countryDTO = countryDTO;
    }
}
