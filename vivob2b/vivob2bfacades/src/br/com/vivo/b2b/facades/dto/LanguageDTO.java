package br.com.vivo.b2b.facades.dto;

public class LanguageDTO {

    private String active;
    private String isoCode;
    private String nome;
    private String nativeName;

    public LanguageDTO() {
    }

    public LanguageDTO(String active, String isoCode, String nome, String nativeName) {
        this.active = active;
        this.isoCode = isoCode;
        this.nome = nome;
        this.nativeName = nativeName;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }
}
