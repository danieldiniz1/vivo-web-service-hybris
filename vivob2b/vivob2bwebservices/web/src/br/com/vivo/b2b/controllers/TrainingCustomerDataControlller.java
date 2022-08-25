package br.com.vivo.b2b.controllers;

import br.com.vivo.b2b.facades.trainigcustomerdata.TrainingCustomerDataFacade;
import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/customer-data")
public class TrainingCustomerDataControlller {

    @Resource(name = "trainingCustomerData")
    private TrainingCustomerDataFacade trainingCustomerData;

    private static final Logger LOGGER = Logger.getLogger(TrainingCustomerDataControlller.class);

    @GetMapping("/{customerId}")
    public ResponseEntity buscaCustomerPorId(@PathVariable String customerId){
        LOGGER.info("Controller recebe customerId: " +customerId);
        LOGGER.info("iniciando chamada do facade" +customerId);
        if(customerId == null){
            return ResponseEntity.badRequest().build();
        }
        trainingCustomerData.buscarClientePorId(customerId);
        return ResponseEntity.ok().build();
    }
}
