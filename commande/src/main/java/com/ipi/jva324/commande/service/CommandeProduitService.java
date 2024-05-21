package com.ipi.jva324.commande.service;

import com.ipi.jva324.stock.model.ProduitEnStock;
import org.springframework.stereotype.Component;

@Component
public interface CommandeProduitService {
    public ProduitEnStock getProduit(long id);
}