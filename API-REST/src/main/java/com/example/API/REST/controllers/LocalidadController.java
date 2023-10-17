package com.example.API.REST.controllers;

import com.example.API.REST.entities.Localidad;
import com.example.API.REST.services.LocalidadServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@CrossOrigin(
        origins = {"*"}
)
@RequestMapping(
        path = {"api/v1/localidades"}
)
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
    public LocalidadController() {
    }

    @Override
    public ResponseEntity<?> getAll(Pageable pageable) {
        return null;
    }
}