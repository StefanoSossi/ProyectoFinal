package DetVenta.view;

import java.util.Scanner;

import excepcionesInputTypes.InputTypes;
import excepcionesInputTypes.detVentaFantasma;

public class detVentaMenu {
			private static int encabezado (Scanner scanner) {
				int opcion;
				
				while (true) {
					System.out.println("Ingrese una opcion; ");
					System.out.println("------------------- ");
					System.out.println("1. Ingresar detalle de venta");
					System.out.println("2. Listar detalle de venta");
					System.out.println("3. Eliminar detalle de venta");
					System.out.println("0. Salir");
					System.out.println();
					
					opcion = InputTypes.readInt("¿Su opcion?", scanner);
					
					if(opcion >= 0 && opcion <=3) {
						return opcion;
					}
				}
			}
			public static void menu (Scanner scanner, detVentaView detVentaView) {
				boolean salir = false;
				while(!salir) {
					switch(encabezado(scanner)) {
					case 0:
						salir = true;
						break;
					case 1:
						detVentaView.addDetVenta();
						break;
					case 2:
						detVentaView.listDetVenta();
						break;
					case 3:
						try {
							detVentaView.deleteDetVenta();
						} catch (detVentaFantasma e) {
							System.out.println("No existe detalle de venta");
						}
						break;
					}
				}
				
				
			}

}
