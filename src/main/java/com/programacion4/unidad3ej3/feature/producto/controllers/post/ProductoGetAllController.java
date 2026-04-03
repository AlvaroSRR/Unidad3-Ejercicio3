package com.programacion4.unidad3ej3.feature.producto.controllers.post;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programacion4.unidad3ej3.feature.producto.dtos.response.ProductoResponseDto;
import com.programacion4.unidad3ej3.feature.producto.services.impl.domain.ProductoGetAllService;

import lombok.AllArgsConstructor;

    @RestController
@RequestMapping("/producto")
@AllArgsConstructor
public class ProductoGetAllController {

    

    private final ProductoGetAllService productoGetAllService;

    @GetMapping
    public ResponseEntity<List<ProductoResponseDto>> getAll() {

        List<ProductoResponseDto> productos = productoGetAllService.getAll();

        return ResponseEntity.ok(productos);
    }
}

