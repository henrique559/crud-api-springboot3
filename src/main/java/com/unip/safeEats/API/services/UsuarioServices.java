package com.unip.safeEats.API.services;

import com.unip.safeEats.API.entities.Usuario;
import com.unip.safeEats.API.repositories.UsuarioRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServices {

    @Autowired
    private UsuarioRepository  repository;

    public List<Usuario> findAll(){
        return repository.findAll();
    }

    public Usuario findById(Integer id){
        Optional<Usuario> obj =  repository.findById(id);
        return obj.get();

    }

    public Usuario insert(Usuario obj){
       return repository.save(obj);
    }

    public void delete(Integer id){
         repository.deleteById(id);
    }

    public Usuario update(Integer id, Usuario obj){
        Usuario entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    public void updateData(Usuario entity, Usuario obj) {
        entity.setNome(obj.getNome());
        entity.setEmail(obj.getEmail());
        entity.setSenha(obj.getSenha());
    }

}
