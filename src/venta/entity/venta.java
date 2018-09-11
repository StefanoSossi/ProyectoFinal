package venta.entity;

public class venta {
	private int codigoVenta;
	private int numeroVenta;
	private String reservacion;
	public venta(int codigoVenta, int numeroVenta, String reservacion) {
		super();
		this.codigoVenta = codigoVenta;
		this.numeroVenta = numeroVenta;
		this.reservacion = reservacion;
	}
	public int getCodigoVenta() {
		return codigoVenta;
	}
	public void setCodigoVenta(int codigoVenta) {
		this.codigoVenta = codigoVenta;
	}
	public int getNumeroVenta() {
		return numeroVenta;
	}
	public void setNumeroVenta(int numeroVenta) {
		this.numeroVenta = numeroVenta;
	}
	public String getReservacion() {
		return reservacion;
	}
	public void setReservacion(String reservacion) {
		this.reservacion = reservacion;
	}
	@Override
	public String toString() {
		return "venta [codigoVenta=" + codigoVenta + ", numeroVenta=" + numeroVenta + ", reservacion=" + reservacion
				+ "]";
	}
	

}
