package com.vuce.postgres.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "productoa")
public class ProductoA {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "description")
  private String nombre;

  @Column(name = "price")
  private String precio;
}
