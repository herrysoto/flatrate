package com.eacorp.flatrate.dao.sp;

import java.util.Map;

import javax.sql.DataSource;

import oracle.jdbc.internal.OracleTypes;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import com.eacorp.flatrate.system.Constantes;

public class ActualizarOperacionServicio extends StoredProcedure{
String sql = Constantes.PAQUETE_OPERACIONSERVICIO+Constantes.FLRT_ACT_OPESER;
	
	
	public ActualizarOperacionServicio(DataSource ds){
		setDataSource(ds);
		setSql(sql);
		declareParameter(new SqlParameter("NROTRABAJO", OracleTypes.VARCHAR));		
		declareParameter(new SqlParameter("DESCRIPCION", OracleTypes.VARCHAR));
		declareParameter(new SqlParameter("PRECIOSUGERIDO", OracleTypes.NUMBER));
		declareParameter(new SqlParameter("HORASHOMBRE", OracleTypes.NUMBER));
		declareParameter(new SqlParameter("DESCUENTO", OracleTypes.NUMBER));
		declareParameter(new SqlParameter("DTEMODIFICACION", OracleTypes.DATE));
		declareParameter(new SqlParameter("TOTAL", OracleTypes.NUMBER));
		declareParameter(new SqlParameter("CODIGOOPERACIONSERVICIO", OracleTypes.CHAR));
		declareParameter(new SqlParameter("CODIGOOPERACION", OracleTypes.VARCHAR));
		declareParameter(new SqlOutParameter("C_OUT", OracleTypes.CURSOR));	
		compile();
	}
	
	public void executeProcedure(Map<String, Object> parametros){
		super.execute(parametros);
	}
}
