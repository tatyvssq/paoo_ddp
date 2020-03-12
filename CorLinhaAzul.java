package paoo_fatec_ipi_tarde_decorator_exerc;

public class CorLinhaAzul extends CorLinhaDecorator{
	
	public CorLinhaAzul (FigurasGeometricas g) {
		super(g);
	}
	
	@Override
	public String desenhar() {
		// TODO Auto-generated method stub
		return getFigurasGeometricas() == null ? "Cor Linha Azul" : "Cor Linha Azul" + getFigurasGeometricas().desenhar();
	}
	

}
