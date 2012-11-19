WearShop-2.0
============

Development with the following technologies: Java 7, Spring 3, Maven

Initialize the project
======================
1. Add a 'pom.xml' file in the root directory
2. Use Maven to clean Eclipse. (enter in TERMINAL $ mvn eclipse:clean eclipse:eclipse and then refresh the project in Eclipse so that the dependencies are updated)
3. mvn package
	This command should build war package to be deployed on web server
4. mvn jetty:run
5. Jetty hot deploy
6. Debug application deployed in Jetty


TODO
====
1. private static PasswordEncryptor encryptor = new StrongPasswordEncryptor();
2. Cache [net.sf.ehcache.*, Cache, CacheManager, Element]

Resources
==========
1. http://www.a2ztechguide.com/2011/11/spring-3-mvc-eclipse-project-using.html
2. http://eureka.ykyuen.info/2010/03/07/spring-mvc-in-maven/
3. http://techblog.zabuchy.net/2011/development-environment-setup-eclipse-maven-spring3-struts2-hibernate-jetty/
4. http://gkokkinos.wordpress.com/2012/01/02/setting-up-a-spring-mvc-project-with-maven-in-eclipse/
5. http://kh-yiu.blogspot.com/2012/05/quick-tutorial-to-spring-mvc-with-maven.html	

REST & JSON
1. http://rafaelfiume.wordpress.com/2012/05/03/spring-3-rest-and-json/