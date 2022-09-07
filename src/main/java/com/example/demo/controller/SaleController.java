package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.entity.Sale;
import com.example.demo.service.SaleService;

@CrossOrigin( "*" )
@RestController
public class SaleController{

    private final SaleService saleService;

    public SaleController( @Autowired SaleService saleService){
        this.saleService = saleService;
    }

    @GetMapping( "/sales/{id}" )
    public Sale getSale( @PathVariable Long id ){
        return saleService.getSale( id );
    }
}