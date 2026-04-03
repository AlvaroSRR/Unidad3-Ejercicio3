package com.programacion4.unidad3ej3.feature.producto.controllers.post;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programacion4.unidad3ej3.feature.producto.services.impl.domain.ProductoDeleteService;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/producto")
@AllArgsConstructor
public class ProductoDeleteController {

    private final ProductoDeleteService productoDeleteService;

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        productoDeleteService.delete(id);

        return ResponseEntity.noContent().build(); // 204
    }
}

