package com.devsuperior.dsvendas.repository;

import com.devsuperior.dsvendas.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository <Sale,Long> {
}
