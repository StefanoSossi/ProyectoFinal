package venta.view;
 import java.util.Scanner;

import venta.entity.venta;
import excepcionesInputTypes.InputTypes;
public class ventaRegistro {
		public static venta ingresar(Scanner scanner) {
			
			String reservacion= InputTypes.readString("reservacion: ", scanner);
			int codigoVenta= InputTypes.readInt("Codigo empleado: ", scanner);
			int numeroVenta = InputTypes.readInt("Numero Venta: ", scanner);
			
			return new venta(codigoVenta, numeroVenta,reservacion);
			
		}
	}
