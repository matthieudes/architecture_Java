package com.ipi.jva324.commande.service;

import com.ipi.jva324.commande.model.Commande;
import com.ipi.jva324.stock.model.ProduitEnStock;
import com.ipi.jva324.stock.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandeProduitServiceLocalImpl implements CommandeProduitService{
    @Autowired
    private ProduitService produitService;

    @Override
    public ProduitEnStock getProduit(long id){
        return produitService.getProduit(id );
    }
}