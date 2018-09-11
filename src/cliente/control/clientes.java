package cliente.control;

import cliente.entity.cliente;

public class clientes {
			private cliente[] clientes;
		private int cantidad;
		private int ultimo;
		
		public clientes (int tamaño) {
			clientes = new cliente[tamaño];
			cantidad = 0;
			ultimo = -1;
		}
		public void ingresar(cliente cliente) throws java.lang.ArrayIndexOutOfBoundsException {
				clientes[++ultimo]=cliente;
				cantidad++;
		}
		public void eliminar(int codCliente) {
			int indice = buscar(codCliente);
			if(indice>=0) {
				if(indice!=ultimo) {
					for(int i=indice; i<=ultimo;i++) {
						clientes[i]=clientes[i+1];
					}
				}
				ultimo--;
				cantidad--;
			}
			
		}
		public int buscar(int codCliente) {
			int posicion = -1;
			
			int indice=0;
			while(indice<=ultimo) {
				if(clientes[indice].getCodCliente()==codCliente) {
					posicion=indice;
					break;
				}
				indice++;
			}
		//	if (posicion==-1){
		//		throw new Fantasma();
			//}
			return posicion;
		}
		
		
		public cliente[] getClientes() {
			return clientes;
		}
		public int getCantidad() {
			return cantidad;
		}
		
		
	}