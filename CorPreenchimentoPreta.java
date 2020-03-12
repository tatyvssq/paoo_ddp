package paoo_fatec_ipi_tarde_decorator_exerc;

public class CorPreenchimentoPreta extends CorPreenchimentoDecorator {

	public CorPreenchimentoPreta (FigurasGeometricas g) {
		super(g);
	}
	
	@Override
	public String desenhar() {
		// TODO Auto-generated method stub
		return getFigurasGeometricas() == null ? "Cor Preenchimento Preta" : "Cor Preenchimento Preta" + getFigurasGeometricas().desenhar();
	}


}
