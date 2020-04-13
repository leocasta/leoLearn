package mortgage;

public class Francese {
	private double interessi;
	private double quotaInteressi;
	private double quotaCapitale;
	private int numeroRata;
	private double rata;
	private double debitoResiduo;
	
	
	public Francese(double interessi, double quotaInteressi, double quotaCapitale, int numeroRata, double rata,
			double debitoResiduo) {
		super();
		this.interessi = interessi;
		this.quotaInteressi = quotaInteressi;
		this.quotaCapitale = quotaCapitale;
		this.numeroRata = numeroRata;
		this.rata = rata;
		this.debitoResiduo = debitoResiduo;
	}
	public double getDebitoResiduo() {
		return debitoResiduo;
	}
	public void setDebitoResiduo(double debitoResiduo) {
		this.debitoResiduo = debitoResiduo;
	}
	public double getInteressi() {
		return interessi;
	}
	public void setInteressi(double interessi) {
		this.interessi = interessi;
	}
	public double getQuotaInteressi() {
		return quotaInteressi;
	}
	public void setQuotaInteressi(double quotaInteressi) {
		this.quotaInteressi = quotaInteressi;
	}
	public double getQuotaCapitale() {
		return quotaCapitale;
	}
	public void setQuotaCapitale(double quotaCapitale) {
		this.quotaCapitale = quotaCapitale;
	}
	public int getNumeroRata() {
		return numeroRata;
	}
	public void setNumeroRata(int numeroRata) {
		this.numeroRata = numeroRata;
	}
	public double getRata() {
		return rata;
	}
	public void setRata(double rata) {
		this.rata = rata;
	}
	
	
	public double Rata() {
		double rata = this.quotaCapitale + this.quotaInteressi;
		return rata;
	}
	
	public double QuotaCapitale() {
		double quotaCapitale = this.rata -this.quotaInteressi;
		return quotaCapitale;
	}
	
	public double quotaInteressi() {
		double quotaInteressi = this.debitoResiduo * this.interessi;
		return quotaInteressi;
	}
	
	public double debitoResiduo() {
		double debitoResiduo = debitoResiduo - this.quotaCapitale;
		return debitoResiduo ;
		
	}
}
