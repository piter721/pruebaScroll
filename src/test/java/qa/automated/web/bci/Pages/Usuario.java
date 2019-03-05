package qa.automated.web.bci.Pages;

public class Usuario {
	 String rut = "";
	 String clave = "";
	 String nombre = "";
	 String numeroCuenta = "";
	 String iniciales = "";
	
	public Usuario(String rut, String clave, String nombre, String numeroCuenta, String iniciales)
	{
		this.rut = rut;
		this.clave = clave;
		this.nombre = nombre; 
		this.numeroCuenta = numeroCuenta;
		this.iniciales = iniciales;
	}

	public String getRut() {
		return rut;
	}

	public  void setRut(String rut) {
		this.rut = rut;
	}

	public  String getClave() {
		return clave;
	}

	public  void setClave(String clave) {
		this.clave = clave;
	}

	public  String getNombre() {
		return nombre;
	}

	public  void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public  String getNumeroCuenta() {
		return numeroCuenta;
	}

	public  void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public  String getIniciales() {
		return iniciales;
	}

	public  void setIniciales(String iniciales) {
		this.iniciales = iniciales;
	}
	
}
