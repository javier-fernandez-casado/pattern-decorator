package fcf.decorator;

public abstract class VPDecorator implements VigilantePlayaInterface {
	
	private final VigilantePlayaInterface vigilantePlaya;

	public VPDecorator(VigilantePlayaInterface vigilantePlaya) {
		this.vigilantePlaya = vigilantePlaya;
	}

	@Override
	public void vigilarGuiris() {

		this.vigilantePlaya.vigilarGuiris();
	}

}
