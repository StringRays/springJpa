package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.demo.data.entity.Sale;
import com.example.demo.repository.SaleRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class SaleServiceImpl implements SaleService{

    private final SaleRepository saleRepository;

    @Override
    public Sale getSale(Long id) {
        Optional<Sale> sale = saleRepository.findById(id);
        
        return sale.orElse(null);
    }
    
}
