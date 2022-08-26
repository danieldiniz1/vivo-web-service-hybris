package br.com.vivo.b2b.controllers;

import br.com.vivo.b2b.controllers.datadto.CustomerDataDTO;
import br.com.vivo.b2b.facades.form.TrainingCustomerRequestForm;
import br.com.vivo.b2b.facades.trainigcustomerdata.TrainingCustomerDataFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.webservicescommons.mapping.DataMapper;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/customer-data")
public class TrainingCustomerDataControlller {

    @Resource(name = "trainingCustomerData")
    private TrainingCustomerDataFacade trainingCustomerData;

    @Resource(name = "dataMapper")
    private DataMapper dataMapper;


    private static final Logger LOGGER = Logger.getLogger(TrainingCustomerDataControlller.class);

    @GetMapping("/{customerId}")
    public ResponseEntity buscaCustomerPorId(@PathVariable String customerId,@RequestParam(defaultValue = "BASIC") String fields){
        LOGGER.info("Controller recebe customerId: " +customerId);
        LOGGER.info("iniciando chamada do facade" +customerId);
        CustomerData customerData = trainingCustomerData.buscarClientePorId(customerId);

        LOGGER.info("customerdata name: " + customerData.getName());
        CustomerDataDTO customerDataDTO = new CustomerDataDTO();
        converterToDTOResponse(customerData,customerDataDTO);
        CustomerData response = dataMapper.map(customerData,CustomerData.class,fields);
        return ResponseEntity.status(HttpStatus.OK).body(customerDataDTO);
    }

    @PostMapping
    public ResponseEntity<CustomerDataDTO> cadastraNovoCliente(@RequestBody TrainingCustomerRequestForm form){
        CustomerDataDTO dataDTO = new CustomerDataDTO();
        try {
            CustomerData customerData = trainingCustomerData.criarNovoCliente(converterToCustomerData(form));
            LOGGER.info("Cliente criado com sucesso");
            converterToDTOResponse(customerData,dataDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(dataDTO);
        } catch (Exception ex){
            LOGGER.error("cause: " + ex.getCause());
            LOGGER.error("message: " + ex.getMessage());

            return ResponseEntity.badRequest().build();
        }
    }


    private CustomerData converterToCustomerData(TrainingCustomerRequestForm form) {
        CustomerData customerData = new CustomerData();
        LOGGER.info("convertendo form para DATA");
        customerData.setCustomerId(form.getId());
        LOGGER.info("convertendo form para DATA e customerId: " + customerData.getCustomerId());
        customerData.setUid(form.getUid());
        LOGGER.info("convertendo form para DATA e uid: " + customerData.getUid());
        customerData.setCpf(form.getCpf());
        LOGGER.info("convertendo form para DATA e cpf: " + customerData.getCpf());
        customerData.setRg(form.getRg());
        LOGGER.info("convertendo form para DATA e rg: " + customerData.getRg());
        customerData.setName(form.getName());
        LOGGER.info("convertendo form para DATA com nome: " + customerData.getName());
        customerData.setFirstName(form.getFirstName());
        customerData.setLastName(form.getLastName());
        return customerData;
    }

    private void converterToDTOResponse(CustomerData source, CustomerDataDTO target) {
       target.setCpf(source.getCpf());
       target.setRg(source.getRg());
       target.setName(source.getName());
    }

}
