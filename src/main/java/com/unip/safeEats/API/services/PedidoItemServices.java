package com.unip.safeEats.API.services;

import com.unip.safeEats.API.entities.PedidoItem;
import com.unip.safeEats.API.repositories.PedidoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoItemServices {

    @Autowired
    private PedidoItemRepository  repository;

    public List<PedidoItem> findAll(){
        return repository.findAll();
    }

    public PedidoItem findById(Integer id){
        Optional<PedidoItem> obj =  repository.findById(id);
        return obj.get();

    }

    public PedidoItem insert(PedidoItem obj){
       return repository.save(obj);
    }

    public void delete(Integer id){
         repository.deleteById(id);
    }

    public PedidoItem update(Integer id, PedidoItem obj){
        PedidoItem entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(PedidoItem entity, PedidoItem obj) {
        entity.setQuantidade(obj.getQuantidade());
        entity.setPreco_unitario(obj.getPreco_unitario());

    }

}
