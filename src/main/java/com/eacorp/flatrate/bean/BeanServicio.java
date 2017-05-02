package com.eacorp.flatrate.bean;


import com.fasterxml.jackson.annotation.JsonInclude;


public class BeanServicio {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String vchdescripcion;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String vchcodigooperacion;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String chrcodigoservicio;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String numnropieza;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String vchnrotrabajo;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
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
	
	
	
	
	public String getNumnropieza() {
		return numnropieza;
	}
	public void setNumnropieza(String numnropieza) {
		this.numnropieza = numnropieza;
	}
	public String getVchnrotrabajo() {
		return vchnrotrabajo;
	}
	public void setVchnrotrabajo(String vchnrotrabajo) {
		this.vchnrotrabajo = vchnrotrabajo;
	}
	public String getChrcodigooperacionservicio() {
		return chrcodigooperacionservicio;
	}
	public void setChrcodigooperacionservicio(String chrcodigooperacionservicio) {
		this.chrcodigooperacionservicio = chrcodigooperacionservicio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Double getNumhorashombre() {
		return numhorashombre;
	}
	public void setNumhorashombre(Double numhorashombre) {
		this.numhorashombre = numhorashombre;
	}
	public Double getNumpreciosugerido() {
		return numpreciosugerido;
	}
	public void setNumpreciosugerido(Double numpreciosugerido) {
		this.numpreciosugerido = numpreciosugerido;
	}
	public Double getNumdescuento() {
		return numdescuento;
	}
	public void setNumdescuento(Double numdescuento) {
		this.numdescuento = numdescuento;
	}
	public Double getNumprecioestimado() {
		return numprecioestimado;
	}
	public void setNumprecioestimado(Double numprecioestimado) {
		this.numprecioestimado = numprecioestimado;
	}
	public Double getNumpreciooficial() {
		return numpreciooficial;
	}
	public void setNumpreciooficial(Double numpreciooficial) {
		this.numpreciooficial = numpreciooficial;
	}
	public Double getNummanoobra() {
		return nummanoobra;
	}
	public void setNummanoobra(Double nummanoobra) {
		this.nummanoobra = nummanoobra;
	}
	public Double getNumrepuesto() {
		return numrepuesto;
	}
	public void setNumrepuesto(Double numrepuesto) {
		this.numrepuesto = numrepuesto;
	}
	public Double getNumtotal() {
		return numtotal;
	}
	public void setNumtotal(Double numtotal) {
		this.numtotal = numtotal;
	}
	public Double getNumcodigo() {
		return numcodigo;
	}
	public void setNumcodigo(Double numcodigo) {
		this.numcodigo = numcodigo;
	}
	public String getVchdescripcion() {
		return vchdescripcion;
	}
	public void setVchdescripcion(String vchdescripcion) {
		this.vchdescripcion = vchdescripcion;
	}
	public String getVchcodigooperacion() {
		return vchcodigooperacion;
	}
	public void setVchcodigooperacion(String vchcodigooperacion) {
		this.vchcodigooperacion = vchcodigooperacion;
	}
	public String getChrcodigoservicio() {
		return chrcodigoservicio;
	}
	public void setChrcodigoservicio(String chrcodigoservicio) {
		this.chrcodigoservicio = chrcodigoservicio;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((chrcodigooperacionservicio == null) ? 0
						: chrcodigooperacionservicio.hashCode());
		result = prime
				* result
				+ ((chrcodigoservicio == null) ? 0 : chrcodigoservicio
						.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((numcodigo == null) ? 0 : numcodigo.hashCode());
		result = prime * result
				+ ((numdescuento == null) ? 0 : numdescuento.hashCode());
		result = prime * result
				+ ((numhorashombre == null) ? 0 : numhorashombre.hashCode());
		result = prime * result
				+ ((nummanoobra == null) ? 0 : nummanoobra.hashCode());
		result = prime * result
				+ ((numnropieza == null) ? 0 : numnropieza.hashCode());
		result = prime
				* result
				+ ((numprecioestimado == null) ? 0 : numprecioestimado
						.hashCode());
		result = prime
				* result
				+ ((numpreciooficial == null) ? 0 : numpreciooficial.hashCode());
		result = prime
				* result
				+ ((numpreciosugerido == null) ? 0 : numpreciosugerido
						.hashCode());
		result = prime * result
				+ ((numrepuesto == null) ? 0 : numrepuesto.hashCode());
		result = prime * result
				+ ((numtotal == null) ? 0 : numtotal.hashCode());
		result = prime
				* result
				+ ((vchcodigooperacion == null) ? 0 : vchcodigooperacion
						.hashCode());
		result = prime * result
				+ ((vchdescripcion == null) ? 0 : vchdescripcion.hashCode());
		result = prime * result
				+ ((vchnrotrabajo == null) ? 0 : vchnrotrabajo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BeanServicio other = (BeanServicio) obj;
		if (chrcodigooperacionservicio == null) {
			if (other.chrcodigooperacionservicio != null)
				return false;
		} else if (!chrcodigooperacionservicio
				.equals(other.chrcodigooperacionservicio))
			return false;
		if (chrcodigoservicio == null) {
			if (other.chrcodigoservicio != null)
				return false;
		} else if (!chrcodigoservicio.equals(other.chrcodigoservicio))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (numcodigo == null) {
			if (other.numcodigo != null)
				return false;
		} else if (!numcodigo.equals(other.numcodigo))
			return false;
		if (numdescuento == null) {
			if (other.numdescuento != null)
				return false;
		} else if (!numdescuento.equals(other.numdescuento))
			return false;
		if (numhorashombre == null) {
			if (other.numhorashombre != null)
				return false;
		} else if (!numhorashombre.equals(other.numhorashombre))
			return false;
		if (nummanoobra == null) {
			if (other.nummanoobra != null)
				return false;
		} else if (!nummanoobra.equals(other.nummanoobra))
			return false;
		if (numnropieza == null) {
			if (other.numnropieza != null)
				return false;
		} else if (!numnropieza.equals(other.numnropieza))
			return false;
		if (numprecioestimado == null) {
			if (other.numprecioestimado != null)
				return false;
		} else if (!numprecioestimado.equals(other.numprecioestimado))
			return false;
		if (numpreciooficial == null) {
			if (other.numpreciooficial != null)
				return false;
		} else if (!numpreciooficial.equals(other.numpreciooficial))
			return false;
		if (numpreciosugerido == null) {
			if (other.numpreciosugerido != null)
				return false;
		} else if (!numpreciosugerido.equals(other.numpreciosugerido))
			return false;
		if (numrepuesto == null) {
			if (other.numrepuesto != null)
				return false;
		} else if (!numrepuesto.equals(other.numrepuesto))
			return false;
		if (numtotal == null) {
			if (other.numtotal != null)
				return false;
		} else if (!numtotal.equals(other.numtotal))
			return false;
		if (vchcodigooperacion == null) {
			if (other.vchcodigooperacion != null)
				return false;
		} else if (!vchcodigooperacion.equals(other.vchcodigooperacion))
			return false;
		if (vchdescripcion == null) {
			if (other.vchdescripcion != null)
				return false;
		} else if (!vchdescripcion.equals(other.vchdescripcion))
			return false;
		if (vchnrotrabajo == null) {
			if (other.vchnrotrabajo != null)
				return false;
		} else if (!vchnrotrabajo.equals(other.vchnrotrabajo))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "BeanServicio [vchdescripcion=" + vchdescripcion
				+ ", vchcodigooperacion=" + vchcodigooperacion
				+ ", chrcodigoservicio=" + chrcodigoservicio + ", numnropieza="
				+ numnropieza + ", vchnrotrabajo=" + vchnrotrabajo
				+ ", chrcodigooperacionservicio=" + chrcodigooperacionservicio
				+ ", codigo=" + codigo + ", numhorashombre=" + numhorashombre
				+ ", numpreciosugerido=" + numpreciosugerido
				+ ", numdescuento=" + numdescuento + ", numprecioestimado="
				+ numprecioestimado + ", numpreciooficial=" + numpreciooficial
				+ ", nummanoobra=" + nummanoobra + ", numrepuesto="
				+ numrepuesto + ", numtotal=" + numtotal + ", numcodigo="
				+ numcodigo + "]";
	}
	
	
	
	public BeanServicio(String vchdescripcion, String vchcodigooperacion,
			String chrcodigoservicio, String numnropieza, String vchnrotrabajo,
			String chrcodigooperacionservicio, String codigo,
			Double numhorashombre, Double numpreciosugerido,
			Double numdescuento, Double numprecioestimado,
			Double numpreciooficial, Double nummanoobra, Double numrepuesto,
			Double numtotal, Double numcodigo) {
		super();
		this.vchdescripcion = vchdescripcion;
		this.vchcodigooperacion = vchcodigooperacion;
		this.chrcodigoservicio = chrcodigoservicio;
		this.numnropieza = numnropieza;
		this.vchnrotrabajo = vchnrotrabajo;
		this.chrcodigooperacionservicio = chrcodigooperacionservicio;
		this.codigo = codigo;
		this.numhorashombre = numhorashombre;
		this.numpreciosugerido = numpreciosugerido;
		this.numdescuento = numdescuento;
		this.numprecioestimado = numprecioestimado;
		this.numpreciooficial = numpreciooficial;
		this.nummanoobra = nummanoobra;
		this.numrepuesto = numrepuesto;
		this.numtotal = numtotal;
		this.numcodigo = numcodigo;
	}
	public BeanServicio() {
		super();
	}	
	
	

}
