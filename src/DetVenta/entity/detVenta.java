package DetVenta.entity;

public class detVenta {
	private int codigoDetVenta;
	private int fechaVentaA�o;
	private int fechaVentaMes;
	private int fechaVentaDia;
	public detVenta(int codigoDetVenta, int fechaVentaA�o, int fechaVentaMes, int fechaVentaDia) {
		super();
		this.codigoDetVenta = codigoDetVenta;
		this.fechaVentaA�o = fechaVentaA�o;
		this.fechaVentaMes = fechaVentaMes;
		this.fechaVentaDia = fechaVentaDia;
	}
	public int getCodigoDetVenta() {
		return codigoDetVenta;
	}
	public void setCodigoDetVenta(int codigoDetVenta) {
		this.codigoDetVenta = codigoDetVenta;
	}
	public int getFechaVentaA�o() {
		return fechaVentaA�o;
	}
	public void setFechaVentaA�o(int fechaVentaA�o) {
		this.fechaVentaA�o = fechaVentaA�o;
	}
	public int getFechaVentaMes() {
		return fechaVentaMes;
	}
	public void setFechaVentaMes(int fechaVentaMes) {
		this.fechaVentaMes = fechaVentaMes;
	}
	public int getFechaVentaDia() {
		return fechaVentaDia;
	}
	public void setFechaVentaDia(int fechaVentaDia) {
		this.fechaVentaDia = fechaVentaDia;
	}
	@Override
	public String toString() {
		return "detVenta [codigoDetVenta=" + codigoDetVenta + ", fechaVenta (DD/MM/YY)=" + fechaVentaDia 
				+ fechaVentaMes + fechaVentaA�o + "]";
	}
	
	
	

}
