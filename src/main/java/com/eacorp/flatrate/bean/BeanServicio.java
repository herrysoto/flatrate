package com.eacorp.flatrate.bean;


import lombok.Data;

import com.fasterxml.jackson.annotation.JsonInclude;


@Data public class BeanServicio {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String vchdescripcion;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String vchcodigooperacion;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String chrcodigoservicio;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Double numnropieza;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String vchnrotrabajo;
	
//	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String chrcodigooperacionservicio;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String codigo;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Double numhorashombre;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Double numpreciosugerido;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Double numdescuento;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Double numprecioestimado;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Double numpreciooficial;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Double nummanoobra;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Double numrepuesto;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Double numtotal;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Double numcodigo;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Double numcodigooperacionmaestra;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String dtefecha;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String vchoperacionmaestra;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String chrestado; 
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Double numcodigomaster;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Double numcodigoitem;
	
		

}
