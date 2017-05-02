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

public class ListarOperacionsp extends StoredProcedure{
	ArrayList<BeanServicio> listoperacion = new ArrayList<BeanServicio>();
	String sql = Constantes.PAQUETE_OPERACIONSERVICIO+Constantes.FLRT_LIS_OPER_SERVICIO;
	
	
	public ListarOperacionsp(DataSource ds){
		setDataSource(ds);
		setSql(sql);
		declareParameter(new SqlParameter("CODSERVICIO", OracleTypes.VARCHAR));
		declareParameter(new SqlOutParameter("C_OUT", OracleTypes.CURSOR,new RowMapper() { 
			public Object mapRow(ResultSet rs, int rowNum)throws SQLException {
	            BeanServicio op = new BeanServicio();
	            op.setVchcodigooperacion(rs.getString("VCHCODIGOOPERACION"));
	            op.setVchdescripcion(rs.getString("VCHDESCRIPCION"));
	            op.setChrcodigoservicio(rs.getString("CHRCODIGOSERVICIO"));
//	            System.out.println(op.toString());
	            listoperacion.add(op);
	            return listoperacion;       
	           

	            }
			}));		
		compile();
	}
	
	public ArrayList<BeanServicio> executeProcedure(Map<String, Object> parametrooper){
		super.execute(parametrooper);
		return listoperacion;
	}
}
