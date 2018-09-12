package venta.view;
import java.util.Scanner;

import venta.control.ventas;
import venta.entity.venta;
import excepcionesInputTypes.InputTypes;
import excepcionesInputTypes.ventaFantasma;
public class ventaView {
		private ventas ventas;
		private Scanner scanner;
		
		public ventaView(ventas ventas,Scanner scanner) {
			
			this.ventas = ventas;
			
			this.scanner = scanner;
		}
		
		public void addVenta() {
			venta venta;
			
			venta = ventaRegistro.ingresar(scanner);
			ventas.ingresar(venta);
					
		}
		
		public void listVenta() {
			for(int i=0; i<ventas.getCantidad(); i++) {
				System.out.println(ventas.getVentas()[i]);
			}
		}
		
		public void deleteVenta() throws ventaFantasma {
			int codVenta = InputTypes.readInt("Ingrese el codigo de la venta", scanner);
			ventas.eliminar(codVenta);	
		}

		public ventas getVenta() {
			return ventas;
		}
	}