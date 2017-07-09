package com;

import java.util.ArrayList;

public class Package {
	private String packageName;
	private int maxCutomer;
	private ArrayList<Chanel> arch;
	public Package(String packageName, int maxCutomer, ArrayList<Chanel> arch) {
		super();
		this.packageName = packageName;
		this.maxCutomer = maxCutomer;
		this.arch = arch;
	}
	public Package() {
		super();
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public int getMaxCutomer() {
		return maxCutomer;
	}
	public void setMaxCutomer(int maxCutomer) {
		this.maxCutomer = maxCutomer;
	}
	public ArrayList<Chanel> getArch() {
		return arch;
	}
	public void setArch(ArrayList<Chanel> arch) {
		this.arch = arch;
	}
	
}
