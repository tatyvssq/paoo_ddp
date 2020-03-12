package paoo_fatec_ipi_tarde_decorator_exerc;

public class CorPreenchimentoPrata extends CorPreenchimentoDecorator {

	public CorPreenchimentoPrata (FigurasGeometricas g) {
		super(g);
	}
	
	@Override
	public String desenhar() {
		// TODO Auto-generated method stub
		return getFigurasGeometricas() == null ? "Cor Preenchimento Prata" : "Cor Preenchimento Prata" + getFigurasGeometricas().desenhar();
	}


}
