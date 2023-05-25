package com.deda;

public class Salary {

	private double basic;
	private double pf;
	private double da;
	private double gross;
	private double net;

	public Salary (double basic) {
		this.basic=basic;
		this.da=basic * (0.10);
		this.pf=basic * (0.05);
		this.gross= basic+da+pf;
		this.net=gross+pf;
	}

	@Override
	public String toString() {
		return "Salary [basic=" + basic + ", pf=" + pf + ", da=" + da + ", gross=" + gross + ", net=" + net + "]";
	}

/*	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getGross() {
		return gross;
	}

	public void setGross(double gross) {
		this.gross = gross;
	}

	public double getNet() {
		return net;
	}

	public void setNet(double net) {
		this.net = net;
	}
	
	*/
}
