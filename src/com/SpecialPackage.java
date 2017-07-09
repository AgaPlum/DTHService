package com;

import java.util.ArrayList;

public class SpecialPackage extends Package{
	private double additionalRate;

	public SpecialPackage(String packageName, int maxCutomer,
			ArrayList<Chanel> arch, double additionalRate) {
		super(packageName, maxCutomer, arch);
		this.additionalRate = additionalRate;
	}

	public SpecialPackage(String packageName, int maxCutomer,
			ArrayList<Chanel> arch) {
		super(packageName, maxCutomer, arch);
	}

	public double getAdditionalRate() {
		return additionalRate;
	}

	public void setAdditionalRate(double additionalRate) {
		this.additionalRate = additionalRate;
	}
	
}
