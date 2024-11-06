package com.unip.safeEats.API.services;

import com.unip.safeEats.API.entities.Pedido;
import com.unip.safeEats.API.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServices {

    @Autowired
    private PedidoRepository  repository;

    public List<Pedido> findAll(){
        return repository.findAll();
    }

    public Pedido findById(Integer id){
        Optional<Pedido> obj =  repository.findById(id);
        return obj.get();

    }

    public Pedido insert(Pedido obj){
       return repository.save(obj);
    }

    public void delete(Integer id){
         repository.deleteById(id);
    }

    public Pedido update(Integer id, Pedido obj){
        Pedido entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Pedido entity, Pedido obj) {
        entity.setDt_pedido(obj.getDt_pedido());
        entity.setStatus_pedido(obj.getStatus_pedido());
    }

}
