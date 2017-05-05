package com.eacorp.flatrate.dao.sp;

import java.util.Map;

import javax.sql.DataSource;

import oracle.jdbc.internal.OracleTypes;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import com.eacorp.flatrate.system.Constantes;

public class InsertarServicioContenido extends StoredProcedure{
String sql = Constantes.PAQUETE_OPERACIONSERVICIO+Constantes.FLRT_INS_CONTENIDO;
	
	
	public InsertarServicioContenido(DataSource ds){
		setDataSource(ds);
		setSql(sql);
		declareParameter(new SqlParameter("CODIGOOPERACIONMAESTRA", OracleTypes.NUMBER));
		declareParameter(new SqlParameter("OPERACIONMAESTRA", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("CODIGOOPERACION", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("CODIGOOPERACIONSERVICIO", OracleTypes.CHAR));
		declareParameter(new SqlParameter("ESTADO", OracleTypes.CHAR));
		declareParameter(new SqlParameter("CODIGOMASTER", OracleTypes.NUMBER));
		declareParameter(new SqlParameter("CODIGOITEM", OracleTypes.NUMBER));
		declareParameter(new SqlOutParameter("C_OUT", OracleTypes.CURSOR));	
		compile();
	}
	
	public void executeProcedure(Map<String, Object> parametros){
		super.execute(parametros);
	}
}
