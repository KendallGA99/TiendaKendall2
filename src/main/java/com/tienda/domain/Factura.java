package com.tienda.domain;

import lombok.Data;

import jakarta.persistence.*;

import java.io.Serializable;

import java.util.Date;

import java.util.Calendar;

@Data

@Entity

@Table(name = "Factura")

public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_factura")

    private long idFactura;

    private long idUsuario;

    private Date fecha;

    private double total;

    private int estado;

    public Factura() {

    }

    public Factura(long idUsuario) {

        this.idFactura = idUsuario;

        this.fecha = Calendar.getInstance().getTime();

        this.estado = 1;

    }

}
