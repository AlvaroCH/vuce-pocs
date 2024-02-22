package com.vuce.postgres.demo.repository;

import com.vuce.postgres.demo.entity.ProductoA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoryA extends JpaRepository<ProductoA,Long> {

  /*List<ProductoA> findAll();

  Iterable<ProductoA> saveAllAndFlush(List<ProductoA> productos);*/

}
