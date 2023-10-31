package edu.cesur.fullstack.services;

import java.util.ArrayList;
import java.util.Arrays;

import edu.cesur.fullstack.models.LibroDTO;

public class LibroServicesImpl implements LibroServices{

	ArrayList<LibroDTO> listaLibros = new ArrayList<>(Arrays.asList(new LibroDTO(1L,"harrypotter","Pérez",false),
			new LibroDTO(2L,"spiderman","Gómez",false),
			new LibroDTO(3L,"batman","González",false)));
}
