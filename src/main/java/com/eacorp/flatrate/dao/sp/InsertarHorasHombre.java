package com.eacorp.flatrate.dao.sp;

import java.util.Map;

import javax.sql.DataSource;

import oracle.jdbc.internal.OracleTypes;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import com.eacorp.flatrate.system.Constantes;

public class InsertarHorasHombre extends StoredProcedure{
	String sql = Constantes.PAQUETE_OPERACIONSERVICIO+Constantes.FLRT_INS_HH;
	
	
	public InsertarHorasHombre(DataSource ds){
		setDataSource(ds);
		setSql(sql);
		declareParameter(new SqlParameter("CODIGO", OracleTypes.NUMBER));
		declareParameter(new SqlParameter("HORASHOMBRE", OracleTypes.NUMBER));
		declareParameter(new SqlOutParameter("C_OUT", OracleTypes.CURSOR));	
		compile();
	}
	
	public void executeProcedure(Map<String, Object> parametros){
		super.execute(parametros);
	}
}
