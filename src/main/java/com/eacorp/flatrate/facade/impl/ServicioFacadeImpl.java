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

}
