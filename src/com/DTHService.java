package com;

import java.util.ArrayList;

public class DTHService {
	private String name;
	private static ArrayList<Package> pac;
	
	public DTHService(String name, ArrayList<Package> pac) {
		super();
		this.name = name;
		DTHService.pac = pac;
	}
	public static boolean addPackage(Package p)
	{
		boolean b=true;
		for(int i=0;i<pac.size();i++)
		{
				if(pac.get(i).getPackageName()==p.getPackageName())
					{
					b=false;
					}
		}
				if(true==b)
				{
				pac.add(p);
				}

		return b;
	}
	public static Chanel findChannel(int channelId) throws ChannelNotFoundException
	{
		Chanel ch=new Chanel();
		for(int i=0;i<pac.size();i++)
			{
				for(int j=0;j<pac.get(i).getArch().size();j++)
				{
					if(pac.get(i).getArch().get(j).getChannelId()==channelId)
					{
						ch=pac.get(i).getArch().get(j);
						break;
					}				
				}
			}
			if(ch.getChannelId()==0)
			{
				throw new ChannelNotFoundException("The channel is not found ");
			}
			
		return ch;
	}
	public static String tagChannelToPackage(Package p, Chanel c)
	{
		String output="";
		if(pac.size()<5)
		{
		for(int i=0;i<pac.size();i++)
		{
			if(!p.getArch().contains(c)){
			p.getArch().add(c);
			output="The channel "+ c.getChannelName()+" is  tagged to the package "+p.getPackageName() ;
			}
		}
		}
		else
		{
			output="Otherwise display the message like “The channel cannot be tagged ";
		}
		return output;
	}
	public static ArrayList<Chanel> findChannelRating(float rating)
	{
		ArrayList<Chanel> chan=new ArrayList<Chanel>();
		for(int i=0;i<pac.size();i++)
		{
			for(int j=0;j<pac.get(i).getArch().size();j++)
				{
				if (rating < pac.get(i).getArch().get(j).getChannelRating())
						{
							if(!chan.contains(pac.get(i).getArch().get(j)))
									{
										chan.add(pac.get(i).getArch().get(j));
									}
						}
				}
		}
		return chan;
	}
}
