package com.eacorp.flatrate.dao.sp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import javax.sql.DataSource;

import oracle.jdbc.internal.OracleTypes;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import com.eacorp.flatrate.bean.BeanServicio;
import com.eacorp.flatrate.system.Constantes;

public class BuscarCodoperValid extends StoredProcedure{
	ArrayList<BeanServicio> codrep = new ArrayList<BeanServicio>();
	String sql = Constantes.PAQUETE_OPERACIONSERVICIO+Constantes.FLRT_BUSCAR_CODOP_VALID;
		
		
		public BuscarCodoperValid(DataSource ds){
			setDataSource(ds);
			setSql(sql);
			declareParameter(new SqlParameter("OPERACION", OracleTypes.VARCHAR));
			declareParameter(new SqlParameter("SERVICIO", OracleTypes.VARCHAR));
			declareParameter(new SqlOutParameter("C_OUT", OracleTypes.CURSOR,new RowMapper() { 
				public Object mapRow(ResultSet rs, int rowNum)throws SQLException {
		            BeanServicio op = new BeanServicio();
		            op.setChrcodigooperacionservicio(rs.getString("CHRCODIGOOPERACIONSERVICIO"));
//		            System.out.println(op.toString());
		            codrep.add(op);
		            return codrep;       
		           

		            }
				}));		
			compile();
		}
		
		public ArrayList<BeanServicio> executeProcedure(Map<String, Object> parametros){
			super.execute(parametros);
			return codrep;
		}
}
