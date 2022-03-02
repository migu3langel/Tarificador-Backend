package com.example.Tarificador.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;



/**
 * The persistent class for the calls database table.
 * 
 */
@Entity
@Table(name="calls")
public class Call implements Serializable {private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long idL;

@Column(name="codigo_cuenta")
private String codigoCuenta;

private Date duracion;

private String extension;

@Temporal(TemporalType.DATE)
private Date fecha;

private Date hora;

@Column(name="numero_marcado")
private String numeroMarcado;

private int pais;

private String tipo;

private String troncal;

public Call() {
}



public Call( String codigoCuenta,Date hora,String tipo,Date duracion, Long idL,String extension,
		Date fecha,String numeroMarcado,int pais,String troncal) {
	super();
	this.idL = idL;
	this.codigoCuenta = codigoCuenta;
	this.duracion = duracion;
	this.extension = extension;
	this.fecha = fecha;
	this.hora = hora;
	this.numeroMarcado = numeroMarcado;
	this.pais = pais;
	this.tipo = tipo;
	this.troncal = troncal;
}



public Long getIdL() {
	return idL;
}

public void setIdL(Long idL) {
	this.idL = idL;
}

public String getCodigoCuenta() {
	return this.codigoCuenta;
}

public void setCodigoCuenta(String codigoCuenta) {
	this.codigoCuenta = codigoCuenta;
}

public Date getDuracion() {
	return this.duracion;
}

public void setDuracion(Date duracion) {
	this.duracion = duracion;
}

public String getExtension() {
	return this.extension;
}

public void setExtension(String extension) {
	this.extension = extension;
}

public Date getFecha() {
	return this.fecha;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}

public Date getHora() {
	return this.hora;
}

public void setHora(Date hora) {
	this.hora = hora;
}

public String getNumeroMarcado() {
	return this.numeroMarcado;
}

public void setNumeroMarcado(String numeroMarcado) {
	this.numeroMarcado = numeroMarcado;
}

public int getPais() {
	return this.pais;
}

public void setPais(int pais) {
	this.pais = pais;
}

public String getTipo() {
	return this.tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getTroncal() {
	return this.troncal;
}

public void setTroncal(String troncal) {
	this.troncal = troncal;
}

}