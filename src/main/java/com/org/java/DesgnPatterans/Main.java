package com.org.java.DesgnPatterans;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationFactory factory=new NotificationFactory();
	Notification notify=factory.getNotificationFactory("messages");
	notify.message();
	
	
	SigletonDesignPatteran s=SigletonDesignPatteran.getInstance();
	s.sampleMethod();
	SigletonDesignPatteran s2=SigletonDesignPatteran.getInstance();
	s.sampleMethod();
	SigletonDesignPatteran s3=SigletonDesignPatteran.getInstance();
	s.sampleMethod();
	MessgeNotofication m1=new MessgeNotofication();
	System.out.println(m1);
	MessgeNotofication m2=new MessgeNotofication();
	System.out.println(m2);
	MessgeNotofication m3=new MessgeNotofication();
	System.out.println(m3);
	}

}
