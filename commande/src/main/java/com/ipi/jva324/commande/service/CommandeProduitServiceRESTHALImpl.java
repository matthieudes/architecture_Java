package com.ipi.jva324.commande.service;

import com.ipi.jva324.stock.model.ProduitEnStock;
import com.ipi.jva324.stock.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Primary
@Component
public class CommandeProduitServiceRESTHALImpl implements  CommandeProduitService{

    /** URL serveur : (configurée dans application.properties, sinon valeur par défaut) */
    @Value("${stockapiserver.url:http://localhost:8080/}")
    private String url ;


    @Autowired
    private RestTemplate restTemplate;

    public ProduitEnStock getProduit(long id){
        return restTemplate.getForObject( url+"/api/data-rest/produitEnStocks/"+ id , ProduitEnStock.class);
    }
}