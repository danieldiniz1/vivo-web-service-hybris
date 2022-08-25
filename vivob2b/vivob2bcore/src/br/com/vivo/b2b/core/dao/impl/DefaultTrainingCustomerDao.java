package br.com.vivo.b2b.core.dao.impl;

import br.com.vivo.b2b.core.dao.TrainingCustomerDao;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultTrainingCustomerDao extends AbstractItemDao implements TrainingCustomerDao {

    private static final Logger LOGGER = Logger.getLogger(DefaultTrainingCustomerDao.class);
    private final String CUSTOMER_ALL_QUERY = "SELECT { " + CustomerModel.PK + "} FROM {" + CustomerModel._TYPECODE + "" +
            "} WHERE {" + CustomerModel.CUSTOMERID +"} IS NOT NULL"  ;
    private final String CUSTOMER_ID_QUERY = "SELECT { " + CustomerModel.PK + "} FROM {" + CustomerModel._TYPECODE + "" +
            "} WHERE {" + CustomerModel.CUSTOMERID +"} =?customerId"  ;

    @Override
    public List<CustomerModel> getAllCustomers() {
        LOGGER.info("O Dao iniciou sua busca por todos os clientes que NÃO tem CUSTOMERID NULL");
        SearchResult<CustomerModel> customers = getFlexibleSearchService().search(CUSTOMER_ALL_QUERY);
        List<CustomerModel> customersResult = customers.getResult();
        customersResult.forEach(c -> LOGGER.info("cpf: " + c.getCpf() + " nome: " + c.getName()));
        return customersResult == null? Collections.EMPTY_LIST : customersResult;
    }

    @Override
    public CustomerModel buscaClientePorId(String customerId) {
        LOGGER.info("O Dao iniciou sua busca do cliente.");
        ServicesUtil.validateParameterNotNull(customerId,"O id não pode ser nulo");
        final Map<String,String> param =new HashMap<>();
        param.put("customerId",customerId);
        SearchResult<CustomerModel> customer = getFlexibleSearchService().search(CUSTOMER_ID_QUERY, param);
        if (customer.getResult().get(0) == null){
            throw new RuntimeException("Não foi encontrado nenhum cliente com id: " + customerId);
        }
        LOGGER.info("nome do cliente encontrado: " + customer.getResult().get(0).getName());
        return customer.getResult().get(0);
    }

    @Override
    public void cadastrarNovoCliente(CustomerModel customerModel) {
        getModelService().save(customerModel);
        LOGGER.info("cliente foi criado com sucesso: " + customerModel.getName());
    }

    @Override
    public void deletarClientePorId(String customerId) {
        LOGGER.info("iniciando processo de deleção de cliente com id: " + customerId);

        CustomerModel customerModelQueVaiSerDeletado = buscaClientePorId(customerId);
        LOGGER.info("O nome do cliente que vai ser deletado é: " + customerModelQueVaiSerDeletado.getName());
        LOGGER.info("A Pk do cliente que vai ser deletado é: " + customerModelQueVaiSerDeletado.getPk().toString());
        getModelService().remove(customerModelQueVaiSerDeletado.getPk());
        LOGGER.info("O cliente foi removido");

    }

    @Override
    public void AtualizarClientePorId(String id, String cpf) {
        CustomerModel customerModelASerAtualizado = buscaClientePorId(id);
        imprimeLogAtualizacao("antes", customerModelASerAtualizado.getCpf());
        customerModelASerAtualizado.setCpf(cpf);
        imprimeLogAtualizacao("depois", cpf);
        getModelService().save(customerModelASerAtualizado);
    }

    private void imprimeLogAtualizacao(String periodo, String cpf) {
        LOGGER.info("O cpf no " + periodo + " é: " + cpf);
    }
}
