package com.example.API.REST.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "autor")
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Audited
public class Autor extends Base {
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "biografia", length = 1500)
    private String biografia;

}
