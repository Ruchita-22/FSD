Micoservices: - 1 session
	- Service discovery
	- API Gateway
		- routing
		- facade - single entry point
		- Gateway Offloading 
			- functionalities like auth, logging etc 
		- Aggregation
			
	- Microservice communication
	- Distributed tracing
	- Centralized Configuration
	- Fault tolerance


Cloud Computing with AWS - 10 sessions
	- AWS infrastructure and services
		- EC2, S3, ......
	- Kubernetes - EKS
	- Serverless Applications
		- AWS Lambda, DynamoDb and Gateway




Microservice communication
	
	- Synchronous
		- RestTemplate
		- openFeign   
	- Asynchronous
		- RabbitMQ
		- Kafka


Kafka

 - Distributed Streaming platform 

	- Real time event driven application
	- Fault Tolerant
	- Scalable
	- Runs as a cluster

Use case 
	- Distributed logging
	- Stream processing
	- Pub-Sub messaging



TOPIC:
	
	- Represents a log/collection for a category of event
	- partitioned
	- Replication



Distributed tracing Pattern
--------------------------

Trace a request going through multiple microservice
- Analyse the logs belonging to a specific request
- Find the amount of time each service took to process


Sleuth:
 - every request is traced and assigned a trace ID
- 




Zipkin :















