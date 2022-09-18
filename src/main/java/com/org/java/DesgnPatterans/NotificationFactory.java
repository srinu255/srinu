package com.org.java.DesgnPatterans;

public class NotificationFactory {
	
	public Notification getNotificationFactory(String typeOfNotification){
		if(typeOfNotification==null){
			return null;
		}
		else if(typeOfNotification.equalsIgnoreCase("message")){
			return new MessgeNotofication();
		}
		else if(typeOfNotification.equalsIgnoreCase("mail")){
			return new MailNotification();
		}
		else if(typeOfNotification.equalsIgnoreCase("whatsup")){
			return new WhatsupNotification();
		}
		else{
			return new OtherNotification();
		}
	}

}
