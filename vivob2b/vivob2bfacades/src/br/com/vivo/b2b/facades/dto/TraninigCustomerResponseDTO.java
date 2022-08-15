package br.com.vivo.b2b.facades.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import de.hybris.platform.core.model.user.CustomerModel;
@JsonFormat
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
