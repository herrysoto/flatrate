package com.eacorp.flatrate.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eacorp.flatrate.bean.*;
import com.eacorp.flatrate.facade.*;
import com.eacorp.flatrate.system.Constantes;



@Controller
@RequestMapping("/api/v1")
public class ServicioService {

	@Autowired
	private ServicioFacade servicioFacade;
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/prueba/{opsId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ArrayList<BeanServicio> listarServicio(@PathVariable String opsId) throws Exception{
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("P_OPS", opsId);
		ArrayList<BeanServicio> listserv = servicioFacade.listarServicio(parametros);
		return listserv;
	}
	
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.GET,path = "/primercombo" ,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ArrayList<BeanServicio> listarCombo() throws Exception{
		Map<String, Object> parametros1 = new HashMap<String, Object>();
		ArrayList<BeanServicio> listcomb = servicioFacade.listarCombo(parametros1);
		return listcomb;
	}
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.GET, value = "/segundocombo/{codser}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ArrayList<BeanServicio> listarOperacion(@PathVariable String codser) throws Exception{
		Map<String, Object> parametrooper = new HashMap<String, Object>();
		parametrooper.put("CODSERVICIO", codser);
		ArrayList<BeanServicio> listaoperacion = servicioFacade.listarOperacion(parametrooper);
		return listaoperacion;
	}
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.GET, value = "/grilla/{codoper}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ArrayList<BeanServicio> listarOperacionServicio(@PathVariable String codoper) throws Exception{
		Map<String, Object> parametrosgrid = new HashMap<String, Object>();
		parametrosgrid.put("OPERSERV", codoper);
		ArrayList<BeanServicio> listaoperacionservicio = servicioFacade.listarOperacionServicio(parametrosgrid);
		return listaoperacionservicio;
	}
}
