package br.com.vivo.b2b.facades.form;

public class TrainingCustomerRequestForm {

    private AddressRequestForm address;


    public TrainingCustomerRequestForm() {
    }

    public AddressRequestForm getAddress() {
        return address;
    }

    public void setAddress(AddressRequestForm address) {
        this.address = address;
    }
}
