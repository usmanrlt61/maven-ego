# README #

This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###

* Quick summary
* Version
* [Learn Markdown](https://bitbucket.org/tutorials/markdowndemo)

### How do I get set up? ###

* Summary of set up
* Configuration
* Dependencies
* Database configuration
* How to run tests
* Deployment instructions

### Contribution guidelines ###

* Writing tests
* Code review
* Other guidelines

### Who do I talk to? ###

* Repo owner or admin
* Other community or team contact

### Steps to run ###
* Get clone of maven project 
* Install JDK-11 into system 
* Install Maven into your system 
* Download chrome driver which you are using for current system 
* Change path of directory for chromedrive in URLInDesktop.java and URLInMobile.java @ System.setProperty
* Run these 2 Commands:
	mvn clean compile assembly:single
	java -jar target/mvn-1.0-SNAPSHOT-jar-with-dependencies.jar



