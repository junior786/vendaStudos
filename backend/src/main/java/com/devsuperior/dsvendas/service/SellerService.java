package com.devsuperior.dsvendas.service;

import com.devsuperior.dsvendas.dto.SelletDTO;
import com.devsuperior.dsvendas.model.Seller;
import com.devsuperior.dsvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public List<SelletDTO> findAll(){
        List<Seller> result =  sellerRepository.findAll();
        return  result.stream().map(SelletDTO::new).collect(Collectors.toList());
    }

}
