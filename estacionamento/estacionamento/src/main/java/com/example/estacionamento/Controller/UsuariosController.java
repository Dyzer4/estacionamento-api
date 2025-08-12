package com.example.estacionamento.Controller;

import com.example.estacionamento.Entity.Usuario;
import com.example.estacionamento.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {

        @Autowired
        public UsuarioRepository usuario;
        @GetMapping
        public List<Usuario> listarUsuario() {
            return usuario.findAll();
        }

        @GetMapping("/{id}")
        public Usuario pesquisarUsuario(@PathVariable int id) {
            return usuario.findById(id).orElse(null);
        }
}



