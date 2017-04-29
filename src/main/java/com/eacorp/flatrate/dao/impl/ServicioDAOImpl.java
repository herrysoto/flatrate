package com.eacorp.flatrate.dao.impl;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.eacorp.flatrate.bean.BeanServicio;
import com.eacorp.flatrate.dao.ServicioDAO;
import com.eacorp.flatrate.dao.sp.ListarServiciosp;
import com.eacorp.flatrate.system.MasterDBConnections;

@Service
public class ServicioDAOImpl extends MasterDBConnections implements ServicioDAO{

	
	public ArrayList<BeanServicio> listarServicio(Map<String, Object> parametros)
			throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("esta llegando al modelo de datos");
		ListarServiciosp ls = new ListarServiciosp(getDsPrueba());
		return ls.executeProcedure(parametros);
	}

}
