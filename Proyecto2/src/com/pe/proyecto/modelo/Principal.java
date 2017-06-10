package com.pe.proyecto.modelo;

public class Principal {

	public static void main(String args[]) {
		// creando objeto alumno
		Alumno a = new Alumno();

		a.setNombre("luis");
		System.out.println(a.getNombre());
		System.out.println(a);

	}

}
