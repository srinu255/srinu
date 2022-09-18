package com.org.java.DesgnPatterans;

public class SigletonDesignPatteran {
	
	public static SigletonDesignPatteran singleton=null;
	
	private SigletonDesignPatteran(){
		
	}
	public static SigletonDesignPatteran getInstance(){
		if(singleton==null){
			singleton=new SigletonDesignPatteran();
		}
		return singleton;
	}
	public void sampleMethod(){
		System.out.println("hascode of singleton object:::::"+singleton);
	}

}
