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
@Table(name = "localidad")
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Audited
public class Localidad extends Base {
    @Column(name = "denominacion")
    private String denominacion;
}