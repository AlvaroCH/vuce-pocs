package com.vuce.postgres.demo.controller;

import com.vuce.postgres.demo.bean.ProductoResponse;
import com.vuce.postgres.demo.entity.ProductoA;
import com.vuce.postgres.demo.entity.ProductoB;
import java.util.ArrayList;
import java.util.List;

public class ProductoMapper {

    public List<ProductoResponse> productMapperToResponseA(List<ProductoA> lstProductoA){

        List<ProductoResponse> lstResponse = new ArrayList<>();

        for (ProductoA productoA: lstProductoA){
            ProductoResponse productoResponse = new ProductoResponse();
            productoResponse.setId(productoA.getId());
            productoResponse.setName(productoA.getNombre());
            productoResponse.setPrecio(productoA.getPrecio());

            lstResponse.add(productoResponse);
        }

        return lstResponse;
    }

    public List<ProductoResponse> productMapperToResponseB(List<ProductoB> lstProductoB){

        List<ProductoResponse> lstResponse = new ArrayList<>();

        for (ProductoB productoB: lstProductoB){
            ProductoResponse productoResponse = new ProductoResponse();
            productoResponse.setId(productoB.getId());
            productoResponse.setName(productoB.getNombre());
            productoResponse.setPrecio(productoB.getPrecio());

            lstResponse.add(productoResponse);
        }

        return lstResponse;

    }

}
