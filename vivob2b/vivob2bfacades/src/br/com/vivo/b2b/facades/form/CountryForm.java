package br.com.vivo.b2b.facades.form;

public class CountryForm {

    private String isocode;
    private String name;

    public CountryForm() {
    }

    public String getIsocode() {
        return isocode;
    }

    public void setIsocode(String isocode) {
        this.isocode = isocode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
