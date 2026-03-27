package com.example.devkudos;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/kudos")
public class KudoController {
    
    @Autowired
    private KudoRepository repository;

    @GetMapping
    public List<Kudo> listarKudos(){
     
        return repository.findAll();
    }

    @PostMapping
    public Kudo criarKudo (@RequestBody Kudo novoKudo) {
        novoKudo.setDataEnvio(LocalDateTime.now());
        return repository.save(novoKudo);
    }
    
}
