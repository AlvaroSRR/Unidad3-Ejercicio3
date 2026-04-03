package com.programacion4.unidad3ej3.feature.producto.controllers.post;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programacion4.unidad3ej3.feature.producto.dtos.request.ProductoPatchRequestDto;
import com.programacion4.unidad3ej3.feature.producto.dtos.response.ProductoResponseDto;
import com.programacion4.unidad3ej3.feature.producto.services.impl.domain.ProductoPatchService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/producto")
@AllArgsConstructor
public class ProductoPatchController {

    private final ProductoPatchService productoPatchService;

    @PatchMapping("/{id}")
    public ResponseEntity<ProductoResponseDto> patch(
            @PathVariable Long id,
            @RequestBody ProductoPatchRequestDto dto
    ) {

        ProductoResponseDto response = productoPatchService.patch(id, dto);

        return ResponseEntity.ok(response);
    }
}