package com.programacion4.unidad3ej3.feature.producto.controllers.post;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programacion4.unidad3ej3.feature.producto.dtos.response.ProductoResponseDto;
import com.programacion4.unidad3ej3.feature.producto.services.impl.domain.ProductoGetByIdService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/producto")
@AllArgsConstructor
public class ProductoGetByIdController {
    
    private final ProductoGetByIdService productoGetByIdService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductoResponseDto> getById(@PathVariable Long id) {

        ProductoResponseDto producto = productoGetByIdService.getById(id);

        return ResponseEntity.ok(producto);
    }
}
