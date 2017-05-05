package com.eacorp.flatrate.dao.sp;

import java.util.Map;

import javax.sql.DataSource;

import oracle.jdbc.internal.OracleTypes;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import com.eacorp.flatrate.system.Constantes;

public class AgregarOperacionServicio extends StoredProcedure{
String sql = Constantes.PAQUETE_OPERACIONSERVICIO+Constantes.FLRT_INS_OPERACIONSERVICIO;
	
	
	public AgregarOperacionServicio(DataSource ds){
		setDataSource(ds);
		setSql(sql);
		declareParameter(new SqlParameter("codigo", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("codigoOperacion", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("descripcion", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("precioSugerido", OracleTypes.NUMBER));
		declareParameter(new SqlParameter("precioOficial", OracleTypes.NUMBER));
		declareParameter(new SqlParameter("horasHombre", OracleTypes.NUMBER));
		declareParameter(new SqlParameter("descuento", OracleTypes.NUMBER));
		declareParameter(new SqlParameter("numcodigo", OracleTypes.NUMBER));
		declareParameter(new SqlParameter("total", OracleTypes.NUMBER));
		declareParameter(new SqlOutParameter("C_OUT", OracleTypes.CURSOR));	
		compile();
	}
	
	public void executeProcedure(Map<String, Object> parametros){
		super.execute(parametros);
	}
}
