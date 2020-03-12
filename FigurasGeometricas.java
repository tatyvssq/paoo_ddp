package paoo_fatec_ipi_tarde_decorator_exerc;

public abstract class FigurasGeometricas {
	
	public abstract String desenhar();
	
	public String getDescription() {
		return getClass().getSimpleName();
	}

}
