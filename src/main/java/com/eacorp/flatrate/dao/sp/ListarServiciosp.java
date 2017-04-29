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

public class ListarServiciosp extends StoredProcedure{
	ArrayList<BeanServicio> listserv = new ArrayList<BeanServicio>();
	String sql = Constantes.PAQUETE_OPERACIONSERVICIO+Constantes.LIS_OPSE;
	
	public ListarServiciosp(DataSource ds){
		setDataSource(ds);
		setSql(sql);
		declareParameter(new SqlParameter("P_OPS", OracleTypes.VARCHAR));
		declareParameter(new SqlOutParameter("C_OUT", OracleTypes.CURSOR,new RowMapper() { 
			public Object mapRow(ResultSet rs, int rowNum)throws SQLException {
	            BeanServicio ops = new BeanServicio();
	            ops.setChrcodigooperacion(rs.getString("CHRCODIGOSERVICIO"));
	            ops.setVchdescripcion(rs.getString("VCHDESCRIPCION"));
//	            System.out.println(ops.toString());
	            listserv.add(ops);
	            return listserv;       
	           

	            }
			}));		
		compile();
	}
	
	public ArrayList<BeanServicio> executeProcedure(Map<String, Object> parametros){
		super.execute(parametros);
		return listserv;
	}
	

}
