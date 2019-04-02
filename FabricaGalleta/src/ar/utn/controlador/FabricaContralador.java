package ar.utn.controlador;

import ar.utn.modelo.Galleta;

public class FabricaContralador {
	 
	// creo una galleta
	
	
	public Galleta creoGalletita(String nombre, String descripcion, double precio) {
		
		Galleta g = new Galleta();
		g.setNombre(nombre);
		g.setDescripcion(descripcion);
		g.setPrecio(precio);
		
		return g;
		
		
		
	}

}
