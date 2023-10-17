package com.example.API.REST.controllers;

import com.example.API.REST.entities.Autor;
import com.example.API.REST.services.AutorServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping(path = {"api/v1/autores"})
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
    public AutorController() {
    }

    @Override
    public ResponseEntity<?> getAll(Pageable pageable) {
        return null;
    }
}