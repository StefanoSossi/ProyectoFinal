package com.automovil.control;

import com.automovil.entity.auto;

public class autos {
	private auto[] autos;
	private int cantidad;
	private int ultimo;
	
	public  autos (int tamaño) {
		autos = new auto[tamaño];
		cantidad = 0;
		ultimo = -1;
	}
	public void ingresar(auto auto) throws java.lang.ArrayIndexOutOfBoundsException {
			autos[++ultimo]=auto;
			cantidad++;
	}
	public void eliminar(int codigoAutomovil) {
		int indice = buscar(codigoAutomovil);
		if(indice>=0) {
			if(indice!=ultimo) {
				for(int i=indice; i<=ultimo;i++) {
					autos[i]=autos[i+1];
				}
			}
			ultimo--;
			cantidad--;
		}
		
	}
	private int buscar(int codigoAutomovil) {
		int posicion = -1;
		
		for(int indice=0; posicion<=autos.length;posicion++) {
			if(autos[indice].getCodigoAutomovil()==codigoAutomovil) {
				posicion=indice;
				break;
			}
		}
		return posicion;
	}
	
	public void buscarAutos (int codAuto){
		int indice=0;
		while(indice<=ultimo) {
			if(autos[indice].getCodigoAutomovil()==codAuto) {
				System.out.println(autos[indice].toString());
			}
			indice++;
		}
		}
	
	public auto[] getAutos() {
		return autos;
	}
	public int getCantidad() {
		return cantidad;
	}
}
