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

}