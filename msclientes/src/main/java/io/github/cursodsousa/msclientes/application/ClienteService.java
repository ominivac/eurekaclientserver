package io.github.cursodsousa.msclientes.application;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.cursodsousa.msclientes.domain.Cliente;
import io.github.cursodsousa.msclientes.infra.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService {
	
	private final ClienteRepository clienteRepository = null;

	public ClienteRepository getClienteRepository() {
		return clienteRepository;
	}
	
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	
	public Optional<Cliente> getByCPF(String cpf){
		return clienteRepository.findByCPF(cpf);
	}
	
	
	

}
