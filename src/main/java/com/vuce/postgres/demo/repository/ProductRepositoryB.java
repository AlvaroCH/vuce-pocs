package com.vuce.postgres.demo.repository;

import com.vuce.postgres.demo.entity.ProductoB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoryB extends JpaRepository<ProductoB,Long> {

  /*List<ProductoB> findAll();

  Iterable<ProductoB> saveAllAndFlush(List<ProductoB> productos);*/

}
