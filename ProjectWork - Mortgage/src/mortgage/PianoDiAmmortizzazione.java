package mortgage;

public interface PianoDiAmmortizzazione {
	
	public void pianoDiAmmortizzazione();
	
	
	public double quotaInteressi();
	
	public double quotaInteressiVariabile(int numeroRata);

	
	public double quotaCapitale();
	
	public double quotaCapitale(int numeroRata);

	
	public double rata();
	
	public double rata(int numeroRata);
	

	public double debitoResiduo();

	public double debitoResiduo(int numeroRata);
	

}
