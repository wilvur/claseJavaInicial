package ar.eud.modelo;

import java.util.Scanner;

public class Vista {
	
	 public static void main(String[] args) {
		 
		 Scanner scan = new Scanner(System.in);
		 int operacion = scan.nextInt();
		 		System.out.println("ingrese un valor");
		
		 int precio;
		 		
		 while(operacion != 99) {
			 
		if( operacion >= 1 && operacion <= 4 ) {
			precio = scan.nextInt();
			if(precio >= 100 && precio <= 104) {
				
			}
		} else {				
			System.out.println("se esperaba un valor entre 100 y 103");
		}
		
		 }	//while
		 
	}

}
