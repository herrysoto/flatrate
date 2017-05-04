package com.eacorp.flatrate.dao.sp;

import java.util.ArrayList;
import java.util.Map;

import javax.sql.DataSource;

import oracle.jdbc.internal.OracleTypes;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import com.eacorp.flatrate.bean.BeanServicio;
import com.eacorp.flatrate.system.Constantes;

public class ActualizarHorasHombre extends StoredProcedure{
	String sql = Constantes.PAQUETE_OPERACIONSERVICIO+Constantes.FLRT_ACT_HH;
		
		
		public ActualizarHorasHombre(DataSource ds){
			setDataSource(ds);
			setSql(sql);
			declareParameter(new SqlParameter("PRECIOOFICIAL", OracleTypes.NUMBER));
			declareParameter(new SqlOutParameter("C_OUT", OracleTypes.CURSOR));	
			compile();
		}
		
		public void executeProcedure(Map<String, Object> parametros){
			super.execute(parametros);
		}
}
