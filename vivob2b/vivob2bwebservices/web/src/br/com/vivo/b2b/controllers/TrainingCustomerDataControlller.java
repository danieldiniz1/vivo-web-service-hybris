package br.com.vivo.b2b.controllers;

import br.com.vivo.b2b.controllers.datadto.CustomerDataDTO;
import br.com.vivo.b2b.facades.trainigcustomerdata.TrainingCustomerDataFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<CustomerDataDTO> buscaCustomerPorId(@PathVariable String customerId){
        LOGGER.info("Controller recebe customerId: " +customerId);
        LOGGER.info("iniciando chamada do facade" +customerId);
        CustomerData customerData = trainingCustomerData.buscarClientePorId(customerId);
        LOGGER.info("customerdata name: " + customerData.getName());
        CustomerDataDTO customerDataDTO = new CustomerDataDTO();
        converterToDTOResponse(customerData,customerDataDTO);

        return ResponseEntity.status(HttpStatus.OK).body(customerDataDTO) ;
    }

    private void converterToDTOResponse(CustomerData source, CustomerDataDTO target) {
       target.setCpf(source.getCpf());
       target.setRg(source.getRg());
       target.setName(source.getName());
    }

}
