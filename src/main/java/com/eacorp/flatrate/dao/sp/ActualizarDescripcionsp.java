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

public class ActualizarDescripcionsp extends StoredProcedure{
	ArrayList<BeanServicio> lis = new ArrayList<BeanServicio>();
	String sql = Constantes.PAQUETE_OPERACIONSERVICIO+Constantes.FLRT_ACT_DESC;
		
		
		public ActualizarDescripcionsp(DataSource ds){
			setDataSource(ds);
			setSql(sql);
			declareParameter(new SqlParameter("DESCRI", OracleTypes.VARCHAR));
			declareParameter(new SqlParameter("COUDOPERA", OracleTypes.VARCHAR));
			declareParameter(new SqlParameter("COUDSERVICIO", OracleTypes.CHAR));
			declareParameter(new SqlOutParameter("C_OUT", OracleTypes.CURSOR));
//					,new RowMapper() { 
//				public Object mapRow(ResultSet rs, int rowNum)throws SQLException {
////		            BeanServicio op = new BeanServicio();
////		            op.setVchdescripcion(rs.getString("VCHDESCRIPCION"));
////		            op.setVchcodigooperacion(rs.getString("VCHCODIGOOPERACION"));
////		            op.setChrcodigooperacionservicio(rs.getString("CHRCODIGOOPERACIONSERVICIO"));
//////		            System.out.println(op.toString());
////		            lis.add(op);
//		            return lis;       
//		           
//
//		            }
//				}));		
			compile();
		}
		
		public void executeProcedure(Map<String, Object> parametros){
			super.execute(parametros);
		}
}
