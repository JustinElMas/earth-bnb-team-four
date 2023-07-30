package com.jorge.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jorge.demo.models.Usuario;
import com.jorge.demo.repositories.UsuarioRepository;

@Service 
public class UsuarioServicio {

    /*
      C CREATE ->post "save"
      R READ   ->get  "get"
      U UPDATE ->put 
      D DELETE ->delete
    */
    
    // jsp,controlador, servicio, repositorio, modelo

    //final -> método no puede ser modificada o extendida
    private final UsuarioRepository usuarioRepository;

    public UsuarioServicio(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    
    //Devolviendo todos los usuarios.
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }
    //Creando un usuario.
    public Usuario createUsuario(Usuario u) {
        return usuarioRepository.save(u);
    }
    //Obteniendo la información de un usuario
    public Usuario findUsuario(Long id) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
        if(optionalUsuario.isPresent()) {
            return optionalUsuario.get();
        } else {
            return null;
        }
    }

    public Usuario update(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void delete(Long id) {
        throw new UnsupportedOperationException("Usuario is not found");
        // usuarioRepository.deleteById(id);
    }
}

