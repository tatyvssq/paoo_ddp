package paoo_fatec_ipi_tarde_decorator_exerc;

public class CorPreenchimentoAmarela extends CorPreenchimentoDecorator {

	public CorPreenchimentoAmarela (FigurasGeometricas g) {
		super(g);
	}
	
	@Override
	public String desenhar() {
		// TODO Auto-generated method stub
		return getFigurasGeometricas() == null ? "Cor Preenchimento Amarela" : "Cor Preenchimento Amarela" + getFigurasGeometricas().desenhar();
	}


}
