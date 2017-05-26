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

public class ListarOperacionServiciosp extends StoredProcedure{
	ArrayList<BeanServicio> listoperacionservicio = new ArrayList<BeanServicio>();
	String sql = Constantes.PAQUETE_OPERACIONSERVICIO+Constantes.FLRT_LIS_OPSER_OPERACION;
	
	public ListarOperacionServiciosp(DataSource ds) {
		setDataSource(ds);
		setSql(sql);
		declareParameter(new SqlParameter("OPERSERV", OracleTypes.VARCHAR));
		declareParameter(new SqlOutParameter("C_OUT", OracleTypes.CURSOR,new RowMapper() { 
			public Object mapRow(ResultSet rs, int rowNum)throws SQLException {
	            BeanServicio op = new BeanServicio();
	            op.setNumnropieza(rs.getDouble("NUMNROPIEZA"));
	            op.setVchnrotrabajo(rs.getString("VCHNROTRABAJO"));
	            op.setCodigo(rs.getString("VCHCODIGOOPERACION")+rs.getString("CHRCODIGOOPERACIONSERVICIO"));
	            op.setVchcodigooperacion(rs.getString("VCHCODIGOOPERACION"));
	            op.setChrcodigooperacionservicio(rs.getString("CHRCODIGOOPERACIONSERVICIO"));
	            op.setVchdescripcion(rs.getString("VCHDESCRIPCION"));
	            op.setNumhorashombre(rs.getDouble("NUMHORASHOMBRE"));
	            op.setNumpreciosugerido(rs.getDouble("NUMPRECIOSUGERIDO"));
	            op.setNumdescuento(rs.getDouble("NUMDESCUENTO"));
	            op.setNumprecioestimado(rs.getDouble("NUMPRECIOESTIMADO"));
	            op.setNumpreciooficial(rs.getDouble("NUMPRECIOOFICIAL"));
	            op.setNummanoobra(rs.getDouble("NUMMANOOBRA"));
	            op.setNumrepuesto(rs.getDouble("NUMREPUESTO"));
	            op.setNummantenimiento(rs.getDouble("NUMMANTENIMIENTO"));
	            op.setNumtotal(rs.getDouble("NUMTOTAL"));
	            op.setNumcodigo(rs.getDouble("NUMCODIGO"));
//	            System.out.println(op.toString());
	            listoperacionservicio.add(op);
	            System.out.println(listoperacionservicio);
	            return listoperacionservicio;       
	           

	            }
			}));		
		compile();
	}
	
	public ArrayList<BeanServicio> executeProcedure(Map<String, Object> parametrosgrid){
		super.execute(parametrosgrid);
		return listoperacionservicio;
	}

	
}
