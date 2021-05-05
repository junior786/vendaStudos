package com.devsuperior.dsvendas.controller;

import com.devsuperior.dsvendas.dto.SelletDTO;
import com.devsuperior.dsvendas.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {
    @Autowired
    private SellerService service;

    @GetMapping
    public ResponseEntity<List<SelletDTO>> findAll(){
        List<SelletDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }
}
