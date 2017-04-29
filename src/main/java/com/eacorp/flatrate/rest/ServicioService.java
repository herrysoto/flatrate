package com.eacorp.flatrate.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eacorp.flatrate.bean.*;
import com.eacorp.flatrate.facade.*;



@Controller
@RequestMapping("/api/v1")
public class ServicioService {

	@Autowired
	private ServicioFacade servicioFacade;
	
	@RequestMapping(method = RequestMethod.GET, value = "/{opsId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ArrayList<BeanServicio> listarServicio(@PathVariable String opsId) throws Exception{
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("P_OPS", opsId);
		ArrayList<BeanServicio> listserv = servicioFacade.listarServicio(parametros);
		return listserv;
	}
}
