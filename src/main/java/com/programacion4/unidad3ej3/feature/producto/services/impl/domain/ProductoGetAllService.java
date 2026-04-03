package com.programacion4.unidad3ej3.feature.producto.services.impl.domain;

import java.util.List;

import org.springframework.stereotype.Service;

import com.programacion4.unidad3ej3.feature.producto.dtos.response.ProductoResponseDto;
import com.programacion4.unidad3ej3.feature.producto.mappers.ProductoMapper;
import com.programacion4.unidad3ej3.feature.producto.models.Producto;
import com.programacion4.unidad3ej3.feature.producto.repositories.IProductoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductoGetAllService {

    private final IProductoRepository productoRepository;

    public List<ProductoResponseDto> getAll() {

        List<Producto> productos = (List<Producto>) productoRepository.findAll();

        return productos.stream()
                .map(ProductoMapper::toResponseDto)
                .toList();
    }
}