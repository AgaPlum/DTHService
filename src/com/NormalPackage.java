package com;

import java.util.ArrayList;

public class NormalPackage extends Package{
	private float discount;

	public NormalPackage(String packageName, int maxCutomer,
			ArrayList<Chanel> arch, float discount) {
		super(packageName, maxCutomer, arch);
		this.discount = discount;
	}

	public NormalPackage(String packageName, int maxCutomer,
			ArrayList<Chanel> arch) {
		super(packageName, maxCutomer, arch);
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
}
