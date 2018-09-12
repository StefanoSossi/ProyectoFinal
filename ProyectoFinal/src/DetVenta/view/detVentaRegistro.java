package DetVenta.view;
 import java.util.Scanner;

import DetVenta.entity.detVenta;
import excepcionesInputTypes.InputTypes;
public class detVentaRegistro {
		public static detVenta ingresar(Scanner scanner) {
			
			int codigoDetVenta= InputTypes.readInt("Codigo Detalle Venta: ", scanner);
			int fechaVentaDia = InputTypes.readInt("fecha Venta Dia: ", scanner);
			int fechaVentaMes = InputTypes.readInt("fecha Venta Mes: ", scanner);
			int fechaVentaAño = InputTypes.readInt("fecha Venta Año: ", scanner);
			int codigoEmpleado = InputTypes.readInt("Codigo Empleado", scanner);
			int codigoAutomovil = InputTypes.readInt("Codigo Automovil", scanner);
			int codigoVenta = InputTypes.readInt("Codigo Venta", scanner);
			
			return new detVenta(codigoDetVenta,fechaVentaAño,fechaVentaMes,fechaVentaDia,codigoEmpleado,codigoAutomovil, codigoVenta);
			
		}
	}
