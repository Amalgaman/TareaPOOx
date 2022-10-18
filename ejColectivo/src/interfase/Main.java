package interfase;

import java.util.Iterator;

import javax.swing.JOptionPane;

import logica.*;

class Main {

	public static void main(String[] args) {
		
		Motor motor = new Motor(1,"2002",6);
		Colectivo bondi = new Colectivo(2, "EQU ISD", motor, 15, 20);
		
		Sube sube1 = new Sube(1, 1234567, 40);
		Sube sube2 = new Sube(2, 6543543, 20);
		Sube sube3 = new Sube(3, 765756, 10);
		
		Pasajero p1 = new Pasajero(1, "123456", "Ernesto",sube1);
		Pasajero p2 = new Pasajero(2, "324562", "Maria",sube2);
		Pasajero p3 = new Pasajero(3, "127896", "Marta",sube3);
		
		int op1,op2;
		String[] opciones1 = {"Ingresar Pasajero","Realizar Viaje","Salir"};
		String[] opciones2 = new String[3];
		
		do {

		opciones2[0]= p1.getNombre()+" - $"+p1.getSube().getSaldo(); 	
		opciones2[1]=p2.getNombre()+" - $"+p2.getSube().getSaldo(); 
		opciones2[2]=p3.getNombre()+" - $"+p3.getSube().getSaldo();
		
		op1 = JOptionPane.showOptionDialog(null, "Bienvenido, selecciona accion que queres realizar", "Simulador Colectivo", 0, 0, null, opciones1, opciones1);
		
		switch (op1) {
		case 0:
			op2 = JOptionPane.showOptionDialog(null, "¿Cual persona subira?", "Simulador Colectivo", 0, 0, null, opciones2, opciones2);
			switch (op2) {
			case 0:
				if(p1.subirBondi(bondi)) {
					JOptionPane.showMessageDialog(null, p1.getNombre()+" pudo subirse correctamente al colectivo (Saldo restante: "+p1.getSube().getSaldo()+")");
				}else {
					JOptionPane.showMessageDialog(null, p1.getNombre()+" no pudo subirse al colectivo :(");
				}
				
				break;
			case 1:
				if(p2.subirBondi(bondi)) {
					JOptionPane.showMessageDialog(null, p2.getNombre()+" pudo subirse correctamente al colectivo (Saldo restante: "+p2.getSube().getSaldo()+")");
				}else {
					JOptionPane.showMessageDialog(null, p2.getNombre()+" no pudo subirse al colectivo :(");
				}
				break;
			case 2:
				if(p3.subirBondi(bondi)) {
					JOptionPane.showMessageDialog(null, p3.getNombre()+" pudo subirse correctamente al colectivo (Saldo restante: "+p3.getSube().getSaldo()+")");
				}else {
					JOptionPane.showMessageDialog(null, p3.getNombre()+" no pudo subirse al colectivo :(");
				}
				break;
			}
			break;
		case 1:
			if(bondi.realizarViaje()){
				JOptionPane.showMessageDialog(null, "El colectivo arranco y condujo hasta la siguiente parada, quedan "+bondi.getCantidad_pasajeros()+" pasajeros");
			}else {
				JOptionPane.showMessageDialog(null, "El colectivo no arranco, el motor esta averiado");
			}
			break;
			
		case 2:
			System.out.println("ejecucion finalizada");
			break;
		
		}
		}while(op1<2);
	}

}
