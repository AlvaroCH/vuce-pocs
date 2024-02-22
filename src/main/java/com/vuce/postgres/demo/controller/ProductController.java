package com.vuce.postgres.demo.controller;

import com.vuce.postgres.demo.bean.ProductoResponse;
import com.vuce.postgres.demo.entity.ProductoA;
import com.vuce.postgres.demo.entity.ProductoB;
import com.vuce.postgres.demo.repository.ProductRepositoryA;
import com.vuce.postgres.demo.repository.ProductRepositoryB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class ProductController {

    @Autowired
    private ProductRepositoryA productoRepositoryA;

    @Autowired
    private ProductRepositoryB productoRepositoryB;

    private ProductoMapper productoMapper;

    @GetMapping("a/")
    public List<ProductoResponse> obtenerProductoA() {
        productoMapper = new ProductoMapper();
        return productoMapper.productMapperToResponseA(productoRepositoryA
                .findAll());
    }

    @GetMapping("b/")
    public Mono<List<ProductoResponse>> obtenerProductoB() {
        productoMapper = new ProductoMapper();
        return Mono.just(productoMapper.productMapperToResponseB(productoRepositoryB
                .findAll()));
    }

    @PostMapping("a/guardar")
    public Flux<ProductoA> guardarProductosA(@RequestBody List<ProductoA> listaProductos) {
        return Flux.fromIterable(productoRepositoryA.saveAll(listaProductos));
    }

    @PostMapping("b/guardar")
    public Flux<ProductoB> guardarProductosB(@RequestBody List<ProductoB> listaProductos) {
        return Flux.fromIterable(productoRepositoryB.saveAll(listaProductos));
    }

}
