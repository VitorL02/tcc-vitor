package br.com.vitortccappspring.tccvitor.service;

import br.com.vitortccappspring.tccvitor.dtos.ClienteDTO;
import br.com.vitortccappspring.tccvitor.models.Cliente;
import br.com.vitortccappspring.tccvitor.repository.ClienteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public void saveClientDatabase(ClienteDTO clienteDTO){
        Cliente cliente = new Cliente();
        BeanUtils.copyProperties(clienteDTO,cliente);
        cliente.setDataDeCadastro(new Date());
        clienteRepository.save(cliente);
    }

    public List<Cliente>allClients(){
        List<Cliente> allClients = clienteRepository.findAll();
        return allClients;
    }


}
