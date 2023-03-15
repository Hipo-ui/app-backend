package com.exercise.app.models;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

	private final static long serialVersionUID = 1L;

	@Id
	@NotNull
	@Min(0)
	@Max(99999)
	@Column(name = "sku", nullable = false, unique=true)
	private Long sku;

	@NotNull
	@Column(name = "articulo", length = 15, nullable = false)
	@Length(min = 1, max = 15)
	@NotEmpty
	private String articulo;

	@NotNull
	@Column(name = "marca", length = 15, nullable = false)
	@Length(min = 1, max = 15)
	@NotEmpty
	private String marca;

	@NotNull
	@Column(name = "modelo", length = 20, nullable = false)
	@Length(min = 1, max = 20)
	@NotEmpty
	private String modelo;

	@NotNull
	@Min(0)
	@Max(9)
	@Column(name = "id_departamento", nullable = false)
	private int departamento;

	@NotNull
	@Min(0)
	@Max(99)
	@Column(name = "id_clase", nullable = false)
	private int clase;

	@NotNull
	@Min(0)
	@Max(999)
	@Column(name = "id_familia", nullable = false)
	private int familia;

	@NotNull
	@Column(name = "fecha_alta", nullable = false)
	private java.sql.Date fechaAlta;

	@NotNull
	@Min(0)
	@Max(999999999)
	@Column(name = "stock", nullable = false)
	private Long stock;

	@NotNull
	@Min(0)
	@Max(999999999)
	@Column(name = "cantidad", nullable = false)
	private Long cantidad;

	@NotNull
	@Min(0)
	@Max(1)
	@Column(name = "descontinuado", nullable = false)
	private int descontinuado;

	@NotNull
	@Column(name = "fecha_baja", nullable = false)
	private java.sql.Date fechaBaja;

	public Producto() {

	}

	public Producto(Long sku, String articulo, String marca, String modelo, int departamento,
			int clase, int familia, java.sql.Date fechaAlta, Long stock, Long cantidad, int descontinuado, java.sql.Date fechaBaja) {
		this.sku = sku;
		this.articulo = articulo;
		this.marca = marca;
		this.modelo = modelo;
		this.departamento = departamento;
		this.clase = clase;
		this.familia = familia;
		this.fechaAlta = fechaAlta;
		this.stock = stock;
		this.cantidad = cantidad;
		this.descontinuado = descontinuado;
		this.fechaBaja = fechaBaja;
	}

	public Long getSku() {
		return sku;
	}

	public void setSku(Long sku) {
		this.sku = sku;
	}

	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getDepartamento() {
		return departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public int getFamilia() {
		return familia;
	}

	public void setFamilia(int familia) {
		this.familia = familia;
	}

	public java.sql.Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(java.sql.Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public int getDescontinuado() {
		return descontinuado;
	}

	public void setDescontinuado(int descontinuado) {
		this.descontinuado = descontinuado;
	}

	public java.sql.Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(java.sql.Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	@Override
	public String toString() {
		return "Prodcuto [sku=" + sku + ", articulo=" + articulo + ", marca=" + marca
				+ ", modelo=" + modelo + ", departamento=" + departamento + ", clase=" + clase + ", familia=" + familia
				+ ", fechaAlta=" + fechaAlta + ", stock=" + stock + ", cantidad=" + cantidad + ", descontinuado="
				+ descontinuado + ", fechaBaja=" + fechaBaja + "]";
	}
}
