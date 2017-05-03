package com.eacorp.flatrate.facade;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.eacorp.flatrate.bean.BeanServicio;

public interface ServicioFacade {

	public abstract ArrayList<BeanServicio> listarServicio(Map<String, Object> parametros) throws DataAccessException;
	public abstract ArrayList<BeanServicio> listarCombo(Map<String,Object> parametros1) throws DataAccessException;
	public abstract ArrayList<BeanServicio> listarOperacion(Map<String,Object> parametrooper) throws DataAccessException;
	public abstract ArrayList<BeanServicio> listarOperacionServicio(Map<String, Object> parametrosgrid) throws DataAccessException;
	public abstract ArrayList<BeanServicio> listarHoraHombre(Map<String, Object> parametroshh) throws DataAccessException;
	public abstract ArrayList<BeanServicio> listarCodMaxhh(Map<String, Object> parametros) throws DataAccessException;
	public abstract ArrayList<BeanServicio> buscarItem(Map<String, Object> parametros) throws DataAccessException;
	public abstract ArrayList<BeanServicio> buscarNumcod(Map<String, Object> parametros) throws DataAccessException;
}
