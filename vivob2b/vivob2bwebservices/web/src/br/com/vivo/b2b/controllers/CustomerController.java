package br.com.vivo.b2b.controllers;

import br.com.vivo.b2b.facades.customer.TrainingCustomerFacade;
import br.com.vivo.b2b.facades.dto.TraninigCustomerResponseDTO;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping(value = "/customer")
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

    @GetMapping("/{customerId}")
    @ResponseBody
    public ResponseEntity<TraninigCustomerResponseDTO> buscaClientePorId(@PathVariable String customerId){
        LOGGER.info("Iniciando busca de customer com id: " + customerId);
        return ResponseEntity.ok().body(trainingCustomerFacade.buscarClientePorId(customerId));
    }
}
