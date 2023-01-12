package com.treina.recife.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.treina.recife.service.ContatoService;
import com.treina.recife.model.Contato;

@RestController
public class ContatoController {
    
    @PostMapping("/contatos")
    public Contato criarNovoContato(@RequestBody Contato contato){
        return contatoService.save(contato);
    }
    @GetMapping("/contatos")
    public Iterable<Contato>obterTodosContatos(){
        return contatoService.findAll();
    }
    @GetMapping("/contatos/{id}")
    public Contato obterContatoPeloId(@PathVariable("id") long id){
        return contatoService.findById(id).get();
    }



    @Autowired
    private ContatoService contatoService;
}
