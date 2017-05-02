package com.eacorp.flatrate.dao.sp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import javax.sql.DataSource;

import oracle.jdbc.internal.OracleTypes;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.object.StoredProcedure;

import com.eacorp.flatrate.bean.BeanServicio;
import com.eacorp.flatrate.system.Constantes;

public class ListarHH extends StoredProcedure{
	ArrayList<BeanServicio> listHH = new ArrayList<BeanServicio>();
	String sql = Constantes.PAQUETE_OPERACIONSERVICIO+Constantes.FLRT_LIST_HH;
	
	public ListarHH(DataSource ds) {
		setDataSource(ds);
		setSql(sql);
		declareParameter(new SqlOutParameter("C_OUT", OracleTypes.CURSOR,new RowMapper() { 
			public Object mapRow(ResultSet rs, int rowNum)throws SQLException {
	            BeanServicio hh = new BeanServicio();
	            hh.setNumhorashombre(rs.getDouble("NUMHORASHOMBRE"));
//	            System.out.println(ops.toString());
	            listHH.add(hh);
	            return listHH;       
	           

	            }
			}));		
		compile();
	}
	
	public ArrayList<BeanServicio> executeProcedure(Map<String, Object> parametroshh){
		super.execute(parametroshh);
		return listHH;
	}
	
}
