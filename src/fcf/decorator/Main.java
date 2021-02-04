package fcf.decorator;

import fcf.decorator.decorators.VPMedico;
import fcf.decorator.decorators.VPOrganizador;

public class Main {

	public static void main(String[] args) {


		System.out.println("*************Vigilante Playa ********************");
		VigilantePlayaInterface vigilantePlaya = new VPJaveaImpl();
		vigilantePlaya.vigilarGuiris();

		System.out.println("\n*************Vigilante Playa MEDICO *********************************");
		VigilantePlayaInterface vigilantePlayaMedico = new VPMedico(new VPJaveaImpl());
		vigilantePlayaMedico.vigilarGuiris();

		System.out.println("\n*************Vigilante Playa ORGANIZADOR *********************************");
		VigilantePlayaInterface vigilantePlayaOrganizador = new VPOrganizador(new VPJaveaImpl());
		vigilantePlayaOrganizador.vigilarGuiris();

		System.out.println("\n*************Vigilante Playa ORGANIZADOR CHETADO *********************************");
		VigilantePlayaInterface vigilantePlayaOrganizadorUpgrade = new VPOrganizador(new VPMedico(new VPJaveaImpl()));
		vigilantePlayaOrganizadorUpgrade.vigilarGuiris();
		
		
	}

}
