package com.eacorp.flatrate.facade.impl;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.eacorp.flatrate.bean.BeanServicio;
import com.eacorp.flatrate.dao.ServicioDAO;
import com.eacorp.flatrate.facade.ServicioFacade;

@Service
public class ServicioFacadeImpl implements ServicioFacade{
	
	@Autowired
	private ServicioDAO servicioDAO;

	@Override
	public ArrayList<BeanServicio> listarServicio(Map<String, Object> parametros)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return servicioDAO.listarServicio(parametros);
	}

	@Override
	public ArrayList<BeanServicio> listarCombo(Map<String, Object> parametros1)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return servicioDAO.listarCombo(parametros1);
	}

	@Override
	public ArrayList<BeanServicio> listarOperacion(Map<String, Object> parametrooper) throws DataAccessException {
		// TODO Auto-generated method stub
		return servicioDAO.listarOperacion(parametrooper);
	}

	@Override
	public ArrayList<BeanServicio> listarOperacionServicio(
			Map<String, Object> parametrosgrid) throws DataAccessException {
		// TODO Auto-generated method stub
		return servicioDAO.listarOperacionServicio(parametrosgrid);
	}

	@Override
	public ArrayList<BeanServicio> listarHoraHombre(
			Map<String, Object> parametroshh) throws DataAccessException {
		// TODO Auto-generated method stub
		return servicioDAO.listarHoraHombre(parametroshh);
	}

	@Override
	public ArrayList<BeanServicio> listarCodMaxhh(Map<String, Object> parametros)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return servicioDAO.listarCodMaxhh(parametros);
	}

	@Override
	public ArrayList<BeanServicio> buscarItem(Map<String, Object> parametros)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return servicioDAO.buscarItem(parametros);
	}

	@Override
	public ArrayList<BeanServicio> buscarNumcod(Map<String, Object> parametros)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return servicioDAO.buscarNumcod(parametros);
	}

	@Override
	public ArrayList<BeanServicio> buscarCodMaestra(
			Map<String, Object> parametros) throws DataAccessException {
		// TODO Auto-generated method stub
		return servicioDAO.buscarCodMaestra(parametros);
	}

	@Override
	public ArrayList<BeanServicio> buscarCodopValid(
			Map<String, Object> parametros) throws DataAccessException {
		// TODO Auto-generated method stub
		return servicioDAO.buscarCodopValid(parametros);
	}

	@Override
	public ArrayList<BeanServicio> listarServiciosContenidos(
			Map<String, Object> parametros) throws DataAccessException {
		// TODO Auto-generated method stub
		return servicioDAO.listarServiciosContenidos(parametros);
	}

	@Override
	public void actualizardesc(Map<String, Object> parametros)
			throws DataAccessException {
		// TODO Auto-generated method stub
		servicioDAO.actualizardesc(parametros);
	}

	@Override
	public void actualizarHH(Map<String, Object> parametros)
			throws DataAccessException {
		// TODO Auto-generated method stub
		servicioDAO.actualizarHH(parametros);
	}

	@Override
	public void actualizarGrilla(Map<String, Object> parametros)
			throws DataAccessException {
		// TODO Auto-generated method stub
		servicioDAO.actualizarGrilla(parametros);
	}

	@Override
	public void actualizarOSERV(Map<String, Object> parametros)
			throws DataAccessException {
		// TODO Auto-generated method stub
		servicioDAO.actualizarOSERV(parametros);
	}

}
