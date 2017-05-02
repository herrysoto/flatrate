package com.eacorp.flatrate.dao.impl;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.eacorp.flatrate.bean.BeanServicio;
import com.eacorp.flatrate.dao.ServicioDAO;
import com.eacorp.flatrate.dao.sp.ListarCodMaxHH;
import com.eacorp.flatrate.dao.sp.ListarCombo;
import com.eacorp.flatrate.dao.sp.ListarHH;
import com.eacorp.flatrate.dao.sp.ListarOperacionServiciosp;
import com.eacorp.flatrate.dao.sp.ListarOperacionsp;
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


	public ArrayList<BeanServicio> listarCombo(Map<String, Object> parametros1)
			throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("Obteniendo la lista de servicios");
		ListarCombo listacombo = new ListarCombo(getDsPrueba());
		return listacombo.executeProcedure(parametros1);
	}



	public ArrayList<BeanServicio> listarOperacion(Map<String, Object> parametrooper) throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("Obteniendo la lista de operaciones");
		ListarOperacionsp listaoperacion =  new ListarOperacionsp(getDsPrueba());
		return listaoperacion.executeProcedure(parametrooper);
	}


	@Override
	public ArrayList<BeanServicio> listarOperacionServicio(
			Map<String, Object> parametrosgrid) throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("Obteniendo la grilla");
		ListarOperacionServiciosp listaroperacionservicio = new ListarOperacionServiciosp(getDsPrueba());
		return listaroperacionservicio.executeProcedure(parametrosgrid);
	}


	@Override
	public ArrayList<BeanServicio> listarHoraHombre(
			Map<String, Object> parametroshh) throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("Obteniendo la hora hombre");
		ListarHH listhh = new ListarHH(getDsPrueba());
		return listhh.executeProcedure(parametroshh);
	}


	@Override
	public ArrayList<BeanServicio> listarCodMaxhh(Map<String, Object> parametros)
			throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("Obteniendo el codigo maximo de  hora hombre");
		ListarCodMaxHH listcod = new ListarCodMaxHH(getDsPrueba());
		return listcod.executeProcedure(parametros);
	}

}
