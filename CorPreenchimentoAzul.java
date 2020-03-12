package paoo_fatec_ipi_tarde_decorator_exerc;

public class CorPreenchimentoAzul extends CorPreenchimentoDecorator {

	public CorPreenchimentoAzul (FigurasGeometricas g) {
		super(g);
	}
	
	@Override
	public String desenhar() {
		// TODO Auto-generated method stub
		return getFigurasGeometricas() == null ? "Cor Preenchimento Azul" : "Cor Preenchimento Azul" + getFigurasGeometricas().desenhar();
	}

}
