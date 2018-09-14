package com.automovil.view;

import java.util.Scanner;

import com.automovil.control.autos;

import com.compra.entity.Compra;

import excepciones.entity.CategoriaF;



public class AutoView {
	private autos autos;
	private compras compras;
	private Scanner scanner;
	public AutoView(autos autos, compras compras, Scanner scanner) {
		
		this.autos= autos;
		this.scanner = scanner;
		this.compras= compras;
	}
	public void addProduct() throws CategoriaF {
		autos autos;
		
			autos = RegistroAuto.ingresar(scanner,compras);
	
		autos.ingresar(autos);
				
	}
	
	
	
	public void listProduct() {
    	int codigoAutomovil=0;
    	int indiceCategoria=0;
    	for(int i = 0; i <= autos.getCantidad(); i++) {
    		System.out.println(autos.getAutos() [i]);
    		codigoAutomovil = autos.getAutos()[i].getCodigoAutomovil();
    		try {
				indiceCategoria = compras.buscar(codigoAutomovil);
				System.out.println(compras.getCompra()[indiceCategoria]);
			} catch (CategoriaF e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    }
	public void deleteProduct() {
		int codigoAutomovil = InputTypes.readInt("Ingrese el codigo del automovil", scanner);
		autos.eliminar(codigoAutomovil);	
	}

}
