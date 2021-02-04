package fcf.decorator.decorators;

import fcf.decorator.VPDecorator;
import fcf.decorator.VigilantePlayaInterface;

public class VPMedico extends VPDecorator{

	public VPMedico(VigilantePlayaInterface vigilantePlaya) {
		super(vigilantePlaya);
	}

	@Override
	public void vigilarGuiris() {
		
		super.vigilarGuiris();
		System.out.println("Vigilante MEDICO que cuida de los guiris.");
		this.rcp();
		this.llamaAmbulancia();
	}
	
	private void rcp() {
		
		System.out.println("Vigilante MEDICO - Realiza RCP.");
	}
	
	private void llamaAmbulancia() {
		
		System.out.println("Vigilante MEDICO - Llama a la ambulancia.");
	}
	
}
