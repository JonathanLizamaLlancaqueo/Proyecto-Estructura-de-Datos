package dci.ufro.cl.fifa.controller;

import dci.ufro.cl.fifa.model.Jugador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;
//define la clase como un controlador
//direccion que desencadena el controlador
@Controller
@RequestMapping("")
public class JugadoresController {

	private Collection<Jugador> jugadores;

	@RequestMapping("")//direccion que desencadena el metodo
	public String index(Model modelo) {
		// TODO - implement JugadoresController.index
		modelo.addAttribute("titulo","Sistema de Visualización de Datos de Contaminación Ambiental	");
		return "index";
		//para lanzar una pagina se agrega la pagina en templates y se escribe la direccion donde enviarla
	}

	/**
	 * 
	 * @param modelo
	 */
	@RequestMapping(value = "/listado", method = RequestMethod.GET)
	//model modelo sirve para enviar datos a la vista
	public String listarJugadores(Model modelo) {
		// TODO - implement JugadoresController.listarJugadores
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param club
	 * @param modelo
	 */
	@RequestMapping(value= "/club", method = RequestMethod.GET)
	public String listarPorClub(String club, Model modelo) {
		// TODO - implement JugadoresController.listarPorClub
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param potencial
	 * @param modelo
	 */
	@RequestMapping(value = "/potencial", method = RequestMethod.GET)
	public String listarPorPotencial(int potencial, Model modelo) {
		// TODO - implement JugadoresController.listarPorPotencial
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nacionalidad
	 * @param modelo
	 */
	@RequestMapping(value = "/nacionalidad", method = RequestMethod.GET)
	public String listarPorNacionalidad(String nacionalidad, Model modelo) {
		// TODO - implement JugadoresController.listarPorNacionalidad
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param rating
	 * @param modelo
	 */
	@RequestMapping(value = "/rating", method = RequestMethod.GET)
	public String listarPorRating(int rating, Model modelo) {
		// TODO - implement JugadoresController.listarPorRating
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param modelo
	 */
	@RequestMapping(value = "/nombre", method = RequestMethod.GET)
	public void buscarNombre(String nombre, Model modelo) {
		// TODO - implement JugadoresController.buscarNombre
		throw new UnsupportedOperationException();
	}

}