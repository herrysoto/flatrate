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

public class ListarCombo extends StoredProcedure{
	ArrayList<BeanServicio> listcomb = new ArrayList<BeanServicio>();
	String sql = Constantes.PAQUETE_OPERACIONSERVICIO+Constantes.LIS_COMB;
	
	public ListarCombo(DataSource ds){
		setDataSource(ds);
		setSql(sql);
		declareParameter(new SqlOutParameter("C_OUT", OracleTypes.CURSOR,new RowMapper() { 
			public Object mapRow(ResultSet rs, int rowNum)throws SQLException {
	            BeanServicio comb = new BeanServicio();
	            comb.setChrcodigoservicio(rs.getString("CHRCODIGOSERVICIO"));
	            comb.setVchdescripcion(rs.getString("VCHDESCRIPCION"));
//	            System.out.println(ops.toString());
	            listcomb.add(comb);
	            return listcomb;       
	           

	            }
			}));		
		compile();
	}
	
	public ArrayList<BeanServicio> executeProcedure(Map<String, Object> parametros1){
		super.execute(parametros1);
		return listcomb;
	}
}
