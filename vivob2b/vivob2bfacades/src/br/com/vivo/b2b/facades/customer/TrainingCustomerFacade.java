package br.com.vivo.b2b.facades.customer;

import br.com.vivo.b2b.facades.dto.TraninigCustomerResponseDTO;

import java.util.List;

public interface TrainingCustomerFacade {

    List<TraninigCustomerResponseDTO> getAllCustomers();

    TraninigCustomerResponseDTO buscarClientePorId(String customerId);
}
