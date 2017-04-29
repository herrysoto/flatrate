package com.eacorp.flatrate.dao;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.eacorp.flatrate.bean.BeanServicio;

public interface ServicioDAO {
	
	public abstract ArrayList<BeanServicio> listarServicio(Map<String, Object> parametros) throws DataAccessException;

}
