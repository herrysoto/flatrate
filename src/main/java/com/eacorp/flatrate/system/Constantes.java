package com.eacorp.flatrate.system;



public class Constantes {
	
	public final static String PAQUETE_OPERACIONSERVICIO = "PKG_OPERACIONSERVICIOS";
	public final static String LIS_OPSE = ".CTPR_LIS_OPSE";
	
	//obtener el primer combo o lista de servicios
	public final static String LIS_COMB = ".OPSE_LIS_COMB1";
	
	//obtener la lista de operaciones
	public final static String FLRT_LIS_OPER_SERVICIO = ".OPER_LIST";
	
	//obtener la lista de operacionservicio para la grilla
	public final static String FLRT_LIS_OPSER_OPERACION = ".OPERSERV_LIST";
	
	//obtener las horashombre del sistema
	public final static String FLRT_LIST_HH = ".HH_LIST";
	
	//obtener el codigo maximo de horas hombre para insertar el nuevo hh
	public final static String FLRT_LIST_CODNUM = ".CODIGOMAXHH_LIST";
	
	//buscar item
	public final static String FLRT_BUSCAR_ITEM = ".BUSCAR_ITEM";
	
	//OBTENER EL NUMCODIGO PARA INSERTAR UNA NUEVA OPERACION SERVICIO
	public final static String FLRT_BUSCAR_NUMCOD = ".OBTENER_NUMCODIGO_OPSER";
	
	//--OBTENER EL CODIGO DE OPERACION MAESTRA PARA LOS SERVICIOS CONTENIDOS
	public final static String FLRT_BUSCAR_CODOP_MAESTRA = ".CODOPERACION_MAESTRA";
	
	//SE OBTIENE UN CODIGO QUE YA ESTE EN EL SISTEMA PARA QUE MANDE A VALIDAR Y NO LE PERMITA INSERTAR UNA NUEVA OPERACION SERVICIO
	public final static String FLRT_BUSCAR_CODOP_VALID = ".CODVALIDACION";
	
	//SE OBTIENE LA LISTA DE LOS SERVICIOS CONTENIDOS
	public final static String FLRT_LIS_CONTENIDOS = ".SERVCONTENIDOS";
	
	//PROBANDO EL PUT(ACTUALIZAR)
	public final static String FLRT_ACT_DESC = ".ACTUALIZARDES";
	
	//actualizar las HorasHombre, esto va primero y luego viene el insert(post)
	public final static String FLRT_ACT_HH = ".UPDATEHORASHOMBRE";
	
	//esta funcion sirve para actualizar la grilla despues de guardar los contenidos
	public final static String FLRT_ACT_CONTENIDO = ".ACTUALIZARGRILLA";
	
	//Actualizar operacion servicio
	public final static String FLRT_ACT_OPESER = ".ACTUALIZAROPERACIONSERVICIO";
	
	//INSERTAR LAS HORAS HOMBRE
	public final static String FLRT_INS_HH = ".POSTHORASHOMBRE";
	
	//Insertar un nuevo contenido
	public final static String FLRT_INS_CONTENIDO = ".INSERTARCONTENIDO";
	
	//INSERTAR OPERACION SERVICIO 
	public final static String FLRT_INS_OPERACIONSERVICIO = ".AGREGAR_OPERACIONSERVICIOS";
	
	//eliminar contenido
	public final static String FLRT_DEL_CONTENIDO = ".ELIMINARCONTENIDO";
	
	public final static String FE_URL = "http://localhost:4200";
	
	
}
