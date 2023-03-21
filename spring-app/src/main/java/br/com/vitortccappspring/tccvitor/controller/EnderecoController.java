package br.com.vitortccappspring.tccvitor.controller;


import br.com.vitortccappspring.tccvitor.models.Endereco;
import br.com.vitortccappspring.tccvitor.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("/{cep}")
    public ResponseEntity<Endereco> getEndereco(@PathVariable(value = "cep") String cep){
        Endereco endereco = enderecoService.recebeEndereco(cep);
        return ResponseEntity.ok(endereco);

    }


}
