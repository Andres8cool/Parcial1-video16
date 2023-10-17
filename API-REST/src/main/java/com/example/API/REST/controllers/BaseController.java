package com.example.API.REST.controllers;

import java.awt.print.Pageable;
import java.io.Serializable;

import com.example.API.REST.entities.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface BaseController<E extends Base, ID extends Serializable> {
    ResponseEntity<?> getAll();
    ResponseEntity<?> getAll(Pageable pageable);
    ResponseEntity<?> getOne(@PathVariable ID id);

    ResponseEntity<?> save(@RequestBody E entity);

    ResponseEntity<?>update(@PathVariable ID id, @RequestBody E entity);

    ResponseEntity<?> delete(@PathVariable ID id);
}
