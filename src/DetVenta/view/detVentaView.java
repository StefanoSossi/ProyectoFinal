package DetVenta.view;
import java.util.Scanner;

import DetVenta.control.detVentas;
import DetVenta.entity.detVenta;
import excepcionesInputTypes.InputTypes;
import excepcionesInputTypes.detVentaFantasma;
public class detVentaView {
		private detVentas detVentas;
		private Scanner scanner;
		
		public detVentaView(detVentas detVentas,Scanner scanner) {
			
			this.detVentas = detVentas;
			
			this.scanner = scanner;
		}
		
		public void addDetVenta() {
			detVenta detVenta;
			
			detVenta = detVentaRegistro.ingresar(scanner);
			detVentas.ingresar(detVenta);
					
		}
		
		public void listDetVenta() {
			for(int i=0; i<detVentas.getCantidad(); i++) {
				System.out.println(detVentas.getDetVenta()[i]);
			}
		}
		
		public void deleteDetVenta() throws detVentaFantasma {
			int codDetVenta = InputTypes.readInt("Ingrese el codigo del detalle de venta", scanner);
			detVentas.eliminar(codDetVenta);	
		}

		public detVentas getDetVenta() {
			return detVentas;
		}
	}