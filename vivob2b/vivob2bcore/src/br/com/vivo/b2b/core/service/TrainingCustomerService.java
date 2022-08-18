package br.com.vivo.b2b.core.service;

import de.hybris.platform.core.model.user.CustomerModel;

import java.util.List;

public interface TrainingCustomerService {

    List<CustomerModel> getAllCustomers();

    CustomerModel buscarClientePorId(String customerId);

    void cadastrarNovoCliente(CustomerModel convertFormToModel);

    void deletarClientePorId(String customerId);
}
