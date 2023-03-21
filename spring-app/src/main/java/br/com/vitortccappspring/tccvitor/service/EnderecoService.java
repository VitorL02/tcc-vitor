package br.com.vitortccappspring.tccvitor.service;

import br.com.vitortccappspring.tccvitor.configuration.FeignClientConfiguration;
import br.com.vitortccappspring.tccvitor.models.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;


@Service
@FeignClient(name="BuscaEndereco",url = "https://viacep.com.br/ws/", configuration = FeignClientConfiguration.class)
public interface EnderecoService {
    @GetMapping("/{cep}/json/")
    Endereco recebeEndereco(@PathVariable(value = "cep") String cep);

}
