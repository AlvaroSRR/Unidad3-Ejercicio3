package com.programacion4.unidad3ej3.feature.producto.mappers;

import com.programacion4.unidad3ej3.feature.producto.dtos.request.ProductoCreateRequestDto;
import com.programacion4.unidad3ej3.feature.producto.dtos.response.ProductoResponseDto;
import com.programacion4.unidad3ej3.feature.producto.models.Producto;

public class ProductoMapper {
    
    public static Producto toEntity(ProductoCreateRequestDto dto) {
        Producto producto = new Producto();
        producto.setNombre(capitalize(dto.getNombre()));
        producto.setCodigo(dto.getCodigo());
        producto.setDescripcion(capitalize(dto.getDescripcion()));
        producto.setPrecio(dto.getPrecio());
        producto.setStock(dto.getStock());
        return producto;
    }

    public static ProductoResponseDto toResponseDto(Producto producto) {
        ProductoResponseDto dto = new ProductoResponseDto();
        dto.setId(producto.getId());
        dto.setNombre(producto.getNombre());
        dto.setCodigo(producto.getCodigo());
        dto.setDescripcion(producto.getDescripcion());
        dto.setPrecio(producto.getPrecio());
        dto.setStock(producto.getStock());
        return dto;
    }

        private static String capitalize(String texto) {
        if (texto == null || texto.isEmpty()) return texto;

        texto = texto.toLowerCase();
        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }
}
