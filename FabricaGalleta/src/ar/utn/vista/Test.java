package ar.utn.vista;

import ar.utn.controlador.FabricaContralador;
import ar.utn.modelo.Galleta;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Galleta G1 = new Galleta();
		//G1 es un nuevo objeto del tipo Galleta
		G1.setNombre("oreo");		
		System.out.println(G1.getNombre());
		System.out.println("procesando.......");
		System.out.println("ya tiene la galleta");
		
		FabricaContralador fc = new FabricaContralador();
		
		Galleta oreo =  FabricaControlador();
		

	 
		Galleta[] listaGalleta = new Galleta[5];
	
		//listaGalleta[0] = fc.oreo = fc.creoGalletita("nombre", "dedescripcion", 11);
		
		
	}

	private static Galleta FabricaControlador() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
