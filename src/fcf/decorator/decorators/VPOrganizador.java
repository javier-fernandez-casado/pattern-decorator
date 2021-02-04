package fcf.decorator.decorators;

import fcf.decorator.VPDecorator;
import fcf.decorator.VigilantePlayaInterface;

public class VPOrganizador extends VPDecorator {

	public VPOrganizador(VigilantePlayaInterface vigilantePlaya) {
		super(vigilantePlaya);
	}
	
	@Override
	public void vigilarGuiris() {
		
		super.vigilarGuiris();
		System.out.println("Vigilante ORGANIZADOR que cuida de los guiris.");
		this.perimetroZona();
		this.llamaFamiliares();
	}
	
	private void perimetroZona() {
		
		System.out.println("Vigilante ORGANIZADOR - Coloca perímetro de seguridad en la zona.");
	}
	
	private void llamaFamiliares() {
		
		System.out.println("Vigilante ORGANIZADOR - Contacta con los familiares del accidentado.");
	}

}
