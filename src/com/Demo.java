package com;

import java.util.ArrayList;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Category category =new Category(1, "heavy", "really heavy package");
		ArrayList<Chanel> arch=new ArrayList<Chanel> ();
		arch.add(new Chanel(1, "Paris", 23.33, 4f, 'd', category));
		arch.add(new Chanel(2, "Rome", 30.33, 5f, 'e', category));
		arch.add(new Chanel(3, "Budapest", 3.13, 3f, 'i', category));

		
		ArrayList<Chanel> arch1=new ArrayList<Chanel> ();
		arch1.add(new Chanel(4, "Berlin", 23.33, 6f, 'd', category));
		arch1.add(new Chanel(5, "Bratislava", 30.33, 7f, 'e', category));
		arch1.add(new Chanel(6, "Athens", 3.13, 8f, 'i', category));
		
		
		ArrayList<Package> pac=new ArrayList<Package>();
		pac.add(new Package("Furniture", 2, arch));
		pac.add(new Package("Box", 3, arch1));
		pac.add(new Package("Sofa", 2, arch));

		DTHService dth1=new DTHService("Order", pac);
		
		Package p=new Package("Box", 3, arch);
		
		
		System.out.println(dth1.addPackage(p));
		
		try {
		
			Chanel chanel=dth1.findChannel(4);
			System.out.println(chanel.getChannelName());
		} catch (ChannelNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		Chanel c1=new Chanel(4, "Warsaw", 12.33, 6f, 'w', category);
		Package p1=new Package("Non", 6, arch);
		
		System.out.println(dth1.tagChannelToPackage(p1,c1));

		ArrayList<Chanel> g=dth1.findChannelRating(4f);
		
		for(int i=0;i<g.size();i++)
		{
			System.out.println(g.get(i).getChannelName());
		}
	}

}
