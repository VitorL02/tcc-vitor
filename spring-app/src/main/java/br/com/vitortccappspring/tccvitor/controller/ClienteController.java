package br.com.vitortccappspring.tccvitor.controller;

import br.com.vitortccappspring.tccvitor.dtos.ClienteDTO;
import br.com.vitortccappspring.tccvitor.models.Cliente;
import br.com.vitortccappspring.tccvitor.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastro-cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<HttpStatus> salvarCliente(@RequestBody ClienteDTO clienteDTO){
        clienteService.saveClientDatabase(clienteDTO);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @GetMapping("/allClients")
    public ResponseEntity<List<Cliente>>getAllClients(){
        List<Cliente> allClients = clienteService.allClients();
        return ResponseEntity.ok(allClients);
    }

}
