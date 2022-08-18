package br.com.vivo.b2b.facades.form;

public class IdentificationsForm {

    private String identificationNumber;
    private String identificationType;

    public IdentificationsForm() {
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }
}
