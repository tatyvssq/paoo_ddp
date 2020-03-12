package paoo_fatec_ipi_tarde_decorator_exerc;

public abstract class CorPreenchimentoDecorator extends FigurasGeometricas{
	
	private FigurasGeometricas figurasGeometricas;
	
	public CorPreenchimentoDecorator(FigurasGeometricas figurasGeometricas) {
		this.figurasGeometricas = figurasGeometricas;
	}
	
	public FigurasGeometricas getFigurasGeometricas() {
		return figurasGeometricas;
	}
	
	public void setFigurasGeometricas(FigurasGeometricas figurasGeometricas) {
		this.figurasGeometricas = figurasGeometricas;
	}
	
	@Override
	public String getDescription() {
		return figurasGeometricas == null ? super.getDescription() : super.getDescription() + ", " + figurasGeometricas.getDescription();
	}
}