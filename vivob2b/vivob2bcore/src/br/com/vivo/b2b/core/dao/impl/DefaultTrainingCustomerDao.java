package br.com.vivo.b2b.core.dao.impl;

import br.com.vivo.b2b.core.dao.TrainingCustomerDao;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.List;

public class DefaultTrainingCustomerDao extends AbstractItemDao implements TrainingCustomerDao {

    private static final Logger LOGGER = Logger.getLogger(DefaultTrainingCustomerDao.class);
    private final String CUSTOMER_ALL_QUERY = "SELECT { " + CustomerModel.PK + "} FROM {" + CustomerModel._TYPECODE + "" +
            "} WHERE {" + CustomerModel.CUSTOMERID +"} IS NOT NULL"  ;

    @Override
    public List<CustomerModel> getAllCustomers() {
        LOGGER.info("O Dao iniciou sua busca por todos os clientes que NÃO tem CUSTOMERID NULL");
        SearchResult<CustomerModel> customers = getFlexibleSearchService().search(CUSTOMER_ALL_QUERY);
        List<CustomerModel> customersResult = customers.getResult();
        customersResult.forEach(c -> LOGGER.info("cpf: " + c.getCpf() + " nome: " + c.getName()));
        return customersResult == null? Collections.EMPTY_LIST : customersResult;
    }
}
