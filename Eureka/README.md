# Eureka

  Monolithic architecture is built one large application or system for code base. 
     tightly coupled 
	 makes it difficult to isolate the services
	 
  Microservices
    it is a architecture (SOA) - service oriented architecture
	
	large number of microservices. 
	communicate services with each other 
	
  Spring Cloud
  will enable load balancing, scaling up and down, centralized 

   Eureka Server & Client - netflix

 it is a small services that work together
  every service is a process 
  
  Banking 
	User - MysqL
	Registration - MysqL
	Payment - MongoDB
	Transaction - PostgreSQL
	Query 

 it is built around business capabilities and independently developed by fully auotmated deployment

 microservices can be written in any programming language 
 
 services are exposed by RESTApi 
 services are small units which can be deployable
 services can be also be enabled on cloud

  it is a lossely coupled and also continuous delivery can be performed 

    the large application you are breaking into the smaller units of the application. if we change in one microservice, it does not affect the other services. 

	microservices - it own database 
   small size and also development time is less 
  less dependency and easy to test
  dynamic scaling

  Create a microservices application and also how to create a euruka server and client 

  Eureka Server - it is application that holds all the information - services 
		every microservices - registry - Eureka Server 
		different port numbers 
	 http://localhost:8761
	 
  Eureka Client 
   
  API Gateway 
	interservice communication 
		services should communicate between each other 

		Service Gateway is used to route the request to various microservices and responds to the clients. 
		
		Cross cutting concerns 

    Netflix Eureka Server / Client 
	Spring cloud gateway 
		Route - building the blocks for the gateway (contain the URL request)
		Predicate - match for all the incoming requests 
		Filters - modify the incoming requests 

   @EnableEurekaServer
   @EnableEurekaClient 
   
=================================================================================================================
Here we create 2 Service 
Serive 1 and Service 2

First start SpringEurekaServer
Then start SpringAPIGateway
Then Start the services

http://localhost:8761/
This is through Api Gate 
http://192.168.1.3:8080/Service1/TestService1
http://192.168.1.3:8080/Service2/TestService2
This is direct
http://192.168.1.3:8001/TestService1
http://192.168.1.3:8001/TestService2