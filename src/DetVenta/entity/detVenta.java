package DetVenta.entity;

public class detVenta {
	private int codigoDetVenta;
	private int fechaVentaAño;
	private int fechaVentaMes;
	private int fechaVentaDia;
	public detVenta(int codigoDetVenta, int fechaVentaAño, int fechaVentaMes, int fechaVentaDia) {
		super();
		this.codigoDetVenta = codigoDetVenta;
		this.fechaVentaAño = fechaVentaAño;
		this.fechaVentaMes = fechaVentaMes;
		this.fechaVentaDia = fechaVentaDia;
	}
	public int getCodigoDetVenta() {
		return codigoDetVenta;
	}
	public void setCodigoDetVenta(int codigoDetVenta) {
		this.codigoDetVenta = codigoDetVenta;
	}
	public int getFechaVentaAño() {
		return fechaVentaAño;
	}
	public void setFechaVentaAño(int fechaVentaAño) {
		this.fechaVentaAño = fechaVentaAño;
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
				+ fechaVentaMes + fechaVentaAño + "]";
	}
	
	
	

}
