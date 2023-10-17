package com.example.API.REST.controllers;

import com.example.API.REST.entities.Libro;
import com.example.API.REST.services.LibroServiceImpl;
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
        path = {"api/v1/libros"}
)
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {
    public LibroController() {
    }

    @Override
    public ResponseEntity<?> getAll(Pageable pageable) {
        return null;
    }
}
