package br.com.vivo.b2b.core.dao;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.internal.dao.Dao;

import java.util.List;

public interface TrainingCustomerDao extends Dao {

    List<CustomerModel> getAllCustomers();

    CustomerModel buscaClientePorId(String customerId);

    void cadastrarNovoCliente(CustomerModel customerModel);
}
