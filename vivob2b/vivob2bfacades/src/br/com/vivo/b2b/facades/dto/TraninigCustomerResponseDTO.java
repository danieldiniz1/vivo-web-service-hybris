package br.com.vivo.b2b.facades.dto;

import de.hybris.platform.core.model.user.CustomerModel;

public class TraninigCustomerResponseDTO {

    private CustomerModel customerModel;

    public TraninigCustomerResponseDTO() {
    }

    public CustomerModel getCustomerModel() {
        return customerModel;
    }

    public void setCustomerModel(CustomerModel customerModel) {
        this.customerModel = customerModel;
    }
}
