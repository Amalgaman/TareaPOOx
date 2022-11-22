package Interfaz;

import java.util.LinkedList;

import Logica.*;

class Main {

	public static void main(String[] args) {
		LinkedList<Colectivo> flota = new LinkedList<Colectivo>();

		flota.add(new Colectivo("12", 1, 3, false, 5,new Chofer(1, "Mario")));
		flota.add(new Colectivo("102", 2, 4, false, 8,new Chofer(2, "Tito")));
		flota.add(new Colectivo("120", 3, 5, false, 6,new Chofer(3, "Pepe")));
		
		String[] paradas = {"Constitucion","Independencia","Corrientes","Cordoba","Retiro"}; 
		
		
	}

}
