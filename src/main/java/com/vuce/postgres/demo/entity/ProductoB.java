package com.vuce.postgres.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "productob")
public class ProductoB {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_id")
  @SequenceGenerator(name = "sq_id", sequenceName="sq_producto", allocationSize=1)
  private Long id;

  @Column(name = "description")
  private String nombre;

  @Column(name = "price")
  private String precio;

}