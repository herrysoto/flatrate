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

public class BuscarCodMaestra extends StoredProcedure{
	ArrayList<BeanServicio> codmaestra = new ArrayList<BeanServicio>();
	String sql = Constantes.PAQUETE_OPERACIONSERVICIO+Constantes.FLRT_BUSCAR_CODOP_MAESTRA;
	
	public BuscarCodMaestra(DataSource ds){
		setDataSource(ds);
		setSql(sql);
		declareParameter(new SqlOutParameter("C_OUT", OracleTypes.CURSOR,new RowMapper() { 
			public Object mapRow(ResultSet rs, int rowNum)throws SQLException {
	            BeanServicio hh = new BeanServicio();
	            hh.setNumcodigooperacionmaestra(rs.getDouble("NUMCODIGOOPERACIONMAESTRA"));
//	            System.out.println(ops.toString());
	            codmaestra.add(hh);
	            return codmaestra;       
	           

	            }
			}));		
		compile();
	}
	
	public ArrayList<BeanServicio> executeProcedure(Map<String, Object> parametros){
		super.execute(parametros);
		return codmaestra;
	}

}
