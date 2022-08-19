package br.com.vivo.b2b.controllers;

import br.com.vivo.b2b.facades.customer.TrainingCustomerFacade;
import br.com.vivo.b2b.facades.dto.TraninigCustomerResponseDTO;
import br.com.vivo.b2b.facades.form.TrainingCustomerRequestForm;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/customer")
@Api(tags = "Customer")
public class CustomerController {

    private static final Logger LOGGER = Logger.getLogger(CustomerController.class);

    @Resource
    private TrainingCustomerFacade trainingCustomerFacade;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<TraninigCustomerResponseDTO>> buscaTodosClientes(){
        LOGGER.info("O Controller iniciou a chamada para buscar os customers");
        List<TraninigCustomerResponseDTO> allCustomers = trainingCustomerFacade.getAllCustomers();
        return ResponseEntity.status(200).body(allCustomers);
    }

    @ApiOperation(nickname="getCustomerDetails", value="Get a Specific Customer Details",
            notes="Return a specific Custumer based on Id",authorizations={@Authorization
            (value="oauth2_client_credentials")})
    @GetMapping("/{customerId}")
    @ResponseBody
    public ResponseEntity<TraninigCustomerResponseDTO> buscaClientePorId(@PathVariable String customerId){
        LOGGER.info("Iniciando busca de customer com id: " + customerId);
        return ResponseEntity.ok().body(trainingCustomerFacade.buscarClientePorId(customerId));
    }
    @ApiOperation(nickname="SubscribeCustomer", value="Subscribe a new Customer",
            notes="Subscribe new customer based form in body",authorizations={@Authorization
            (value="oauth2_client_credentials")})
//    @ApiBaseSiteIdParam
    @PostMapping
    @ResponseBody
    public ResponseEntity<TraninigCustomerResponseDTO> cadastraCliente(@RequestBody TrainingCustomerRequestForm customerForm){
        LOGGER.info("Company name: " + customerForm.getAddress().getCompanyName());
        LOGGER.info("country isocode: " + customerForm.getAddress().getCountry().getIsocode());
        LOGGER.info("cpf: " + customerForm.getCpf());
        LOGGER.info("whatsapp notifications: " + customerForm.isWhatsappNotifications());
        customerForm.getIdentifications().forEach(c -> LOGGER.info(" numbers: " + c.getIdentificationNumber() + ", type: " + c.getIdentificationType()));

        return ResponseEntity.status(HttpStatus.CREATED).body(trainingCustomerFacade.cadastrarNovoCliente(customerForm));
    }

    @ApiOperation(nickname="DeleteCustomer", value="Delete customer by ID",
            notes="don't have body return",authorizations={@Authorization
            (value="oauth2_client_credentials")})
    @ApiBaseSiteIdParam
    @DeleteMapping("/{customerId}")
    @ResponseBody
    public ResponseEntity deletarClientePorCustomerId(@PathVariable String customerId){
        LOGGER.info("Deletando o cliente de id: " + customerId);
        trainingCustomerFacade.deletarClientePorId(customerId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


    @ApiOperation(nickname="UpdateCustomer", value="Update customer by ID",
            notes="don't have body return",authorizations={@Authorization
            (value="oauth2_client_credentials")})
    @PutMapping
    @ResponseBody
    public ResponseEntity atualizarClientePorCustomerId(@RequestBody TrainingCustomerRequestForm trainingCustomerRequestForm){
        LOGGER.info("Atualizando o cliente de id: " + trainingCustomerRequestForm.getId());
        trainingCustomerFacade.atualizarCustomer(trainingCustomerRequestForm);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
