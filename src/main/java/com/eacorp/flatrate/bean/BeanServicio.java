package com.eacorp.flatrate.bean;

public class BeanServicio {
	private String chrcodigooperacion;
	private String vchdescripcion;
	
	public String getChrcodigooperacion() {
		return chrcodigooperacion;
	}
	public BeanServicio() {
		super();
	}
	public void setChrcodigooperacion(String chrcodigooperacion) {
		this.chrcodigooperacion = chrcodigooperacion;
	}
	public String getVchdescripcion() {
		return vchdescripcion;
	}
	public void setVchdescripcion(String vchdescripcion) {
		this.vchdescripcion = vchdescripcion;
	}
	@Override
	public String toString() {
		return "BeanServicios [chrcodigooperacion=" + chrcodigooperacion
				+ ", vchdescripcion=" + vchdescripcion + "]";
	}
	public BeanServicio(String chrcodigooperacion, String vchdescripcion) {
		super();
		this.chrcodigooperacion = chrcodigooperacion;
		this.vchdescripcion = vchdescripcion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((chrcodigooperacion == null) ? 0 : chrcodigooperacion
						.hashCode());
		result = prime * result
				+ ((vchdescripcion == null) ? 0 : vchdescripcion.hashCode());
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
		if (chrcodigooperacion == null) {
			if (other.chrcodigooperacion != null)
				return false;
		} else if (!chrcodigooperacion.equals(other.chrcodigooperacion))
			return false;
		if (vchdescripcion == null) {
			if (other.vchdescripcion != null)
				return false;
		} else if (!vchdescripcion.equals(other.vchdescripcion))
			return false;
		return true;
	}
	
	

}
