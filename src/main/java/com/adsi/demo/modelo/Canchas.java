/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.demo.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "canchas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Canchas.findAll", query = "SELECT c FROM Canchas c")
    , @NamedQuery(name = "Canchas.findById", query = "SELECT c FROM Canchas c WHERE c.id = :id")
    , @NamedQuery(name = "Canchas.findByValorXMinuto", query = "SELECT c FROM Canchas c WHERE c.valorXMinuto = :valorXMinuto")})
public class Canchas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "dimensiones")
    private String dimensiones;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "imagen")
    private String imagen;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "parametros")
    private String parametros;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_x_minuto")
    private int valorXMinuto;

    public Canchas() {
    }

    public Canchas(Integer id) {
        this.id = id;
    }

    public Canchas(Integer id, String dimensiones, String nombre, String imagen, String descripcion, String estado, String parametros, int valorXMinuto) {
        this.id = id;
        this.dimensiones = dimensiones;
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.estado = estado;
        this.parametros = parametros;
        this.valorXMinuto = valorXMinuto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    public int getValorXMinuto() {
        return valorXMinuto;
    }

    public void setValorXMinuto(int valorXMinuto) {
        this.valorXMinuto = valorXMinuto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Canchas)) {
            return false;
        }
        Canchas other = (Canchas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adsi.demo.modelo.Canchas[ id=" + id + " ]";
    }
    
}
