package com.eacorp.flatrate.rest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eacorp.flatrate.bean.*;
import com.eacorp.flatrate.facade.*;
import com.eacorp.flatrate.system.Constantes;



@Controller
@RequestMapping("/api/v1")
public class ServicioService {
	
	private static final DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");

	@Autowired
	private ServicioFacade servicioFacade;
	
	
	//es una prueba que no va en ningun servicio
	@RequestMapping(method = RequestMethod.GET, value = "/prueba/{opsId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ArrayList<BeanServicio> listarServicio(@PathVariable String opsId) throws Exception{
//		Date date = new Date();
//        System.out.println(sdf.format(date));
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
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.GET, value = "/horashombre", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ArrayList<BeanServicio> listarhh() throws Exception{
		Map<String, Object> parametroshh = new HashMap<String, Object>();
		ArrayList<BeanServicio> listahh = servicioFacade.listarHoraHombre(parametroshh);
		return listahh;
	}
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.GET, value = "/Getnumcodigo", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ArrayList<BeanServicio> listarcodmaxhh() throws Exception{
		Map<String, Object> parametros = new HashMap<String, Object>();
		ArrayList<BeanServicio> listacod = servicioFacade.listarCodMaxhh(parametros);
		return listacod;
	}
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.GET, value = "/buscar/{descripcion}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ArrayList<BeanServicio> buscarItem(@PathVariable String descripcion) throws Exception{
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("DESCRIPCION", descripcion);
		ArrayList<BeanServicio> listItem = servicioFacade.buscarItem(parametros);
		return listItem;
	}
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.GET, value = "/buscarnumcod", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ArrayList<BeanServicio> buscarNumcod() throws Exception{
		Map<String, Object> parametros = new HashMap<String, Object>();
		ArrayList<BeanServicio> numcod = servicioFacade.buscarNumcod(parametros);
		return numcod;
	}
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.GET, value = "/buscarcodmaestra", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ArrayList<BeanServicio> buscarCodMaestra() throws Exception{
		Map<String, Object> parametros = new HashMap<String, Object>();
		ArrayList<BeanServicio> codmaestra = servicioFacade.buscarCodMaestra(parametros);
		return codmaestra;
	}
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.GET, value = "/buscarvalid/{codopera}/{codoperaservicio}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ArrayList<BeanServicio> buscarCodValid(@PathVariable String codopera,@PathVariable String codoperaservicio) throws Exception{
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("OPERACION", codopera);
		parametros.put("SERVICIO", codoperaservicio);
		ArrayList<BeanServicio> codvalid = servicioFacade.buscarCodopValid(parametros);
		return codvalid;
	}
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.GET, value = "/listacontenidos/{param}/{param2}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ArrayList<BeanServicio> listarserviciosContenidos(@PathVariable String param,@PathVariable String param2) throws Exception{
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("CODOPERACION", param);
		parametros.put("CODOPERACIONSERVICIO", param2);
		ArrayList<BeanServicio> listcontenidos = servicioFacade.listarServiciosContenidos(parametros);
		return listcontenidos;
	}
	
	//es una prueba que no va en ningun servicio
	
	@CrossOrigin(origins = Constantes.FE_URL) 
	@RequestMapping(method = RequestMethod.PUT, value = "/actualizar/", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public BeanServicio actualizardesc(@RequestBody BeanServicio servicio) throws Exception{
		
//		System.out.println(servicio.getVchdescripcion());
//		System.out.println(servicio.getVchcodigooperacion());
//		System.out.println(servicio.getChrcodigooperacionservicio());
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("DESCRI", servicio.getVchdescripcion());
		parametros.put("COUDOPERA", servicio.getVchcodigooperacion());
		parametros.put("COUDSERVICIO", servicio.getChrcodigooperacionservicio());
		servicioFacade.actualizardesc(parametros) ;
		return servicio;
	}
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.PUT, value = "/actualizarhorashombre", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public BeanServicio actualizarhh(@RequestBody BeanServicio servicio) throws Exception{
//		System.out.println(servicio.getNumpreciooficial());
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("PRECIOOFICIAL", servicio.getNumpreciooficial());
		servicioFacade.actualizarHH(parametros);
		return servicio;
	}
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.PUT, value = "/actualizargrilla", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public BeanServicio actualizargrilla(@RequestBody BeanServicio servicio) throws Exception{
//		System.out.println(servicio.getNumpreciooficial());
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("PRECIOSUGERIDO", servicio.getNumpreciosugerido());
		parametros.put("TOTAL", servicio.getNumtotal());
		parametros.put("DESCUENTO", servicio.getNumdescuento());
		parametros.put("HORASHOMBRE", servicio.getNumhorashombre());
		parametros.put("CODIGOOPERACION", servicio.getVchcodigooperacion());
		parametros.put("CODIGOOPERACIONSERVICIO", servicio.getChrcodigooperacionservicio());
		servicioFacade.actualizarGrilla(parametros);
		return servicio;
	}
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.PUT, value = "/actualizaroperacionservicio", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public BeanServicio actualizarOperacionServicio(@RequestBody BeanServicio servicio) throws Exception{
		Date date = new Date();
//        System.out.println(sdf.format(date));
//		System.out.println(servicio.getNumpreciooficial());
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("NROTRABAJO", servicio.getVchnrotrabajo());
		parametros.put("DESCRIPCION", servicio.getVchdescripcion());
		parametros.put("PRECIOSUGERIDO", servicio.getNumpreciosugerido());
		parametros.put("HORASHOMBRE", servicio.getNumhorashombre());
		parametros.put("DESCUENTO", servicio.getNumdescuento());
		parametros.put("DTEMODIFICACION", fecha.format(date)); //TENGO QUE ARREGLARLO
		parametros.put("TOTAL", servicio.getNumtotal());
		parametros.put("CODIGOOPERACIONSERVICIO", servicio.getChrcodigooperacionservicio());
		parametros.put("CODIGOOPERACION", servicio.getVchcodigooperacion());
		servicioFacade.actualizarOSERV(parametros);
		return servicio;
	}
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.POST, value = "/insertarhorashombre", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public BeanServicio insertarHorasHombre(@RequestBody BeanServicio servicio) throws Exception{
//		Date date = new Date();
//        System.out.println(fecha.format(date));
//		System.out.println(servicio.getNumpreciooficial());
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("CODIGO", servicio.getNumcodigo());
		parametros.put("HORASHOMBRE", servicio.getNumhorashombre());
//		parametros.put("DTFECHA",fecha.format(date));
		servicioFacade.insertarHH(parametros);
		return servicio;
	}
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.POST, value = "/insertarcontenido", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public BeanServicio insertarContenido(@RequestBody BeanServicio servicio) throws Exception{
//		Date date = new Date();
//        System.out.println(fecha.format(date));
//		System.out.println(servicio.getNumpreciooficial());
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("CODIGOOPERACIONMAESTRA", servicio.getNumcodigooperacionmaestra());
		parametros.put("OPERACIONMAESTRA", servicio.getVchoperacionmaestra());
		parametros.put("CODIGOOPERACION", servicio.getVchcodigooperacion());
		parametros.put("CODIGOOPERACIONSERVICIO", servicio.getChrcodigooperacionservicio());
		parametros.put("ESTADO", servicio.getChrestado());
		parametros.put("CODIGOMASTER", servicio.getNumcodigomaster());
		parametros.put("CODIGOITEM", servicio.getNumcodigoitem());
//		parametros.put("DTFECHA",fecha.format(date));
		servicioFacade.insertarContenido(parametros);
		return servicio;
	}
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.POST, value = "/insertaroperacionservicio", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public BeanServicio insertarOperacionServicio(@RequestBody BeanServicio servicio) throws Exception{
//		Date date = new Date();
//        System.out.println(fecha.format(date));
//		System.out.println(servicio.getNumpreciooficial());
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("codigo", servicio.getChrcodigooperacionservicio());
		parametros.put("codigoOperacion", servicio.getVchcodigooperacion());
		parametros.put("descripcion", servicio.getVchdescripcion());
		parametros.put("precioSugerido", servicio.getNumpreciosugerido());
		parametros.put("precioOficial", servicio.getNumpreciooficial());
		parametros.put("horasHombre", servicio.getNumhorashombre());
		parametros.put("descuento", servicio.getNumdescuento());
		parametros.put("numcodigo", servicio.getNumcodigo());
		parametros.put("total", servicio.getNumtotal());
//		parametros.put("DTFECHA",fecha.format(date));
		servicioFacade.insertarOperacionServicio(parametros);
		return servicio;
	}
	
	@CrossOrigin(origins = Constantes.FE_URL)
	@RequestMapping(method = RequestMethod.DELETE, value = "/eliminarcontenido/{numcodigomaestra}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public int eliminarContenido(@PathVariable int numcodigomaestra) throws Exception{
//		Date date = new Date();
//        System.out.println(fecha.format(date));
//		System.out.println(servicio.getNumpreciooficial());
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("NUMMAESTRA", numcodigomaestra);
//		parametros.put("DTFECHA",fecha.format(date));
		servicioFacade.eliminarContenido(parametros);
		return numcodigomaestra;
	}
	
}
