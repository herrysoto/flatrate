package com.eacorp.flatrate.dao.impl;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.eacorp.flatrate.bean.BeanServicio;
import com.eacorp.flatrate.dao.ServicioDAO;
import com.eacorp.flatrate.dao.sp.BuscarCodMaestra;
import com.eacorp.flatrate.dao.sp.BuscarCodoperValid;
import com.eacorp.flatrate.dao.sp.BuscarItem;
import com.eacorp.flatrate.dao.sp.BuscarNumCod;
import com.eacorp.flatrate.dao.sp.ListarCodMaxHH;
import com.eacorp.flatrate.dao.sp.ListarCombo;
import com.eacorp.flatrate.dao.sp.ListarHH;
import com.eacorp.flatrate.dao.sp.ListarOperacionServiciosp;
import com.eacorp.flatrate.dao.sp.ListarOperacionsp;
import com.eacorp.flatrate.dao.sp.ListarServiciosContenidos;
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


	
	public ArrayList<BeanServicio> listarOperacionServicio(
			Map<String, Object> parametrosgrid) throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("Obteniendo la grilla");
		ListarOperacionServiciosp listaroperacionservicio = new ListarOperacionServiciosp(getDsPrueba());
		return listaroperacionservicio.executeProcedure(parametrosgrid);
	}


	
	public ArrayList<BeanServicio> listarHoraHombre(
			Map<String, Object> parametroshh) throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("Obteniendo la hora hombre");
		ListarHH listhh = new ListarHH(getDsPrueba());
		return listhh.executeProcedure(parametroshh);
	}


	
	public ArrayList<BeanServicio> listarCodMaxhh(Map<String, Object> parametros)
			throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("Obteniendo el codigo maximo de  hora hombre");
		ListarCodMaxHH listcod = new ListarCodMaxHH(getDsPrueba());
		return listcod.executeProcedure(parametros);
	}


	
	public ArrayList<BeanServicio> buscarItem(Map<String, Object> parametros)
			throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("Buscando item");
		BuscarItem listItem = new BuscarItem(getDsPrueba());
		return listItem.executeProcedure(parametros);
	}


	
	public ArrayList<BeanServicio> buscarNumcod(Map<String, Object> parametros)
			throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("Buscando el codigo maximo para insertar una nueva operacion servicio");
		BuscarNumCod numcod = new BuscarNumCod(getDsPrueba());
		return numcod.executeProcedure(parametros);
	}


	@Override
	public ArrayList<BeanServicio> buscarCodMaestra(
			Map<String, Object> parametros) throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("Obteniendo el codigo de la operacion maestra");
		BuscarCodMaestra codmaestra = new BuscarCodMaestra(getDsPrueba());
		return codmaestra.executeProcedure(parametros);
	}


	@Override
	public ArrayList<BeanServicio> buscarCodopValid(
			Map<String, Object> parametros) throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("Obteniendo el codigo de validacion para insertar un nuevo item");
		BuscarCodoperValid codvalid = new BuscarCodoperValid(getDsPrueba());
		return codvalid.executeProcedure(parametros);
	}


	@Override
	public ArrayList<BeanServicio> listarServiciosContenidos(
			Map<String, Object> parametros) throws DataAccessException {
		// TODO Auto-generated method stub
		System.out.println("Obteniendo la lista de servicios contenidos");
		ListarServiciosContenidos listcontenidos = new ListarServiciosContenidos(getDsPrueba());
		return listcontenidos.executeProcedure(parametros);
	}

}
