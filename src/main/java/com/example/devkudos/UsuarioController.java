package com.example.devkudos;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> listarUsuario(){

        return repository.findAll();
    }

    @PostMapping
    public Usuario criarUsuario (@RequestBody Usuario novoUsuario) {

        return repository.save(novoUsuario);
    }
}
