package br.com.vitortccappspring.tccvitor.repository;

import br.com.vitortccappspring.tccvitor.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
}
