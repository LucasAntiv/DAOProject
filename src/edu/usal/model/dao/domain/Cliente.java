package edu.usal.model.dao.domain;

import java.util.Date;

public class Cliente {

	private String nombre;
	private String apellido;
	private Pasaporte pasaporte;
	private String cuit;
	private Date fechaDeVencimiento;
	private String email;
	private Telefono telefono;
	private PasajeroFrecuente pasajeroFrecuente;
	private Direccion direccionCompleta;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Pasaporte getPasaporte() {
		return pasaporte;
	}
	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public Date getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}
	public void setFechaDeVencimiento(Date fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Telefono getTelefono() {
		return telefono;
	}
	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}
	public PasajeroFrecuente getPasajeroFrecuente() {
		return pasajeroFrecuente;
	}
	public void setPasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) {
		this.pasajeroFrecuente = pasajeroFrecuente;
	}
	public Direccion getDireccionCompleta() {
		return direccionCompleta;
	}
	public void setDireccionCompleta(Direccion direccionCompleta) {
		this.direccionCompleta = direccionCompleta;
	}
	
	public Cliente(String nombre, String apellido, Pasaporte pasaporte, String cuit, Date fechaDeVencimiento,
			String email, Telefono telefono, PasajeroFrecuente pasajeroFrecuente, Direccion direccionCompleta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.pasaporte = pasaporte;
		this.cuit = cuit;
		this.fechaDeVencimiento = fechaDeVencimiento;
		this.email = email;
		this.telefono = telefono;
		this.pasajeroFrecuente = pasajeroFrecuente;
		this.direccionCompleta = direccionCompleta;
	}
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
