# README #


### Steps to run ###
* Get clone of maven project 
* Install JDK-11 into system 
* Install Maven into your system 
* Download chrome driver which you are using for current system 
* Change path of directory for chromedrive in URLInDesktop.java and URLInMobile.java @ System.setProperty
* Run these 2 Commands:
	mvn clean compile assembly:single
	java -jar target/mvn-1.0-SNAPSHOT-jar-with-dependencies.jar



