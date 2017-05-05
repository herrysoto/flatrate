package com.eacorp.flatrate.dao;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataAccessException;

import com.eacorp.flatrate.bean.BeanServicio;

public interface ServicioDAO {
	
	public abstract ArrayList<BeanServicio> listarServicio(Map<String, Object> parametros) throws DataAccessException;
	
	public abstract ArrayList<BeanServicio> listarCombo(Map<String,Object> parametros1) throws DataAccessException;
	
	public abstract ArrayList<BeanServicio> listarOperacion(Map<String,Object> parametrooper) throws DataAccessException;
	
	public abstract ArrayList<BeanServicio> listarOperacionServicio(Map<String, Object> parametrosgrid) throws DataAccessException;
	
	public abstract ArrayList<BeanServicio> listarHoraHombre(Map<String, Object> parametroshh) throws DataAccessException;
	
	public abstract ArrayList<BeanServicio> listarCodMaxhh(Map<String, Object> parametros) throws DataAccessException;
	
	public abstract ArrayList<BeanServicio> buscarItem(Map<String, Object> parametros) throws DataAccessException;
	
	public abstract ArrayList<BeanServicio> buscarNumcod(Map<String, Object> parametros) throws DataAccessException;
	
	public abstract ArrayList<BeanServicio> buscarCodMaestra(Map<String, Object> parametros) throws DataAccessException;
	
	public abstract ArrayList<BeanServicio> buscarCodopValid(Map<String, Object> parametros) throws DataAccessException;
	
	public abstract ArrayList<BeanServicio> listarServiciosContenidos(Map<String, Object> parametros) throws DataAccessException;
	
	public abstract void actualizardesc(Map<String, Object> parametros) throws DataAccessException;
	
	public abstract void actualizarHH(Map<String, Object> parametros) throws DataAccessException;
	
	public abstract void actualizarGrilla(Map<String, Object> parametros) throws DataAccessException;
	
	public abstract void actualizarOSERV(Map<String, Object> parametros) throws DataAccessException;
	
	public abstract void insertarHH(Map<String, Object> parametros) throws DataAccessException;
	
	public abstract void insertarContenido(Map<String, Object> parametros) throws DataAccessException;
	
	public abstract void insertarOperacionServicio(Map<String, Object> parametros) throws DataAccessException;
	
	public abstract void eliminarContenido(Map<String, Object> parametros) throws DataAccessException;

}
