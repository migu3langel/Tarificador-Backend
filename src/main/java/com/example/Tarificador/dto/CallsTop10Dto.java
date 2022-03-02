package com.example.Tarificador.dto;



public class CallsTop10Dto {
	

	private String extension;

	private String tipo;

	public CallsTop10Dto(String tipo, String extension) {
		super();
		this.tipo = tipo;
		this.extension = extension;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	
	
	

}
