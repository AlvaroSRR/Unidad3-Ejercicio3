package com.programacion4.unidad3ej3.feature.producto.controllers.post;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programacion4.unidad3ej3.feature.producto.dtos.request.ProductoCreateRequestDto;
import com.programacion4.unidad3ej3.feature.producto.dtos.response.ProductoResponseDto;
import com.programacion4.unidad3ej3.feature.producto.services.impl.domain.ProductoUpdateService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/producto")
@AllArgsConstructor
public class ProductoPutController {

    private final ProductoUpdateService productoUpdateService;

    @PutMapping("/{id}")
    public ResponseEntity<ProductoResponseDto> update(
            @PathVariable Long id,
            @RequestBody @Valid ProductoCreateRequestDto dto
    ) {

        ProductoResponseDto response = productoUpdateService.update(id, dto);

        return ResponseEntity.ok(response);
    }
}
