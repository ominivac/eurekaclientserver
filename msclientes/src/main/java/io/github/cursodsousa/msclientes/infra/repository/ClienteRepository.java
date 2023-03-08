package io.github.cursodsousa.msclientes.infra.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.cursodsousa.msclientes.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	Optional<Cliente> findByCPF(String cpf);

	
}
