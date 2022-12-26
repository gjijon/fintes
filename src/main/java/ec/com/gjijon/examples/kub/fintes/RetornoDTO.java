package ec.com.gjijon.examples.kub.fintes;

public class RetornoDTO {
	private String nombre;

	public RetornoDTO(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "RetornoDTO [nombre=" + nombre + "]";
	}

}
