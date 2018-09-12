# Spring Framework

##IOC

##MVC

##Spring Security
### Configuring Spring security:
* Create a springSecurityFilterChain which is responsible for all the security. The class must declare @EnableWebSecurity in case of web app.
* The next step is to register the springSecurityFilterChain with the war. It can be done by extending AbstractSecurityWebApplicationInitializer
that will ensure the  springSecurityFilterChain gets registered. Then if we use Spring MVC it would be added in getRootConfigClasses() method.