# AD CAMPAIGN RESTFUL SERVICE

* This application is developed using Spring Boot application which will provide web services for CRUD operations i.e. Create, Retrieve, Update and Delete operations using HTTP POST, GET, PUT and DELETE method respectively.
* We didnt use any database. Instead just used a HashMap to store the data objects through a Service/Impl layer class.
* Gradle has been used as build and dependency management tool.

## How to run this Spring boot application

Make sure you have latest version of Gradle installed and PATH is configured.
Go to the directory where you unzipped the file i.e. where the build.gradle is there
or
* Clone this repository
Run gradle clean bootRun command
This should run the application and once the application runs you should see something like this
```
2017-08-06 13:07:10.666  INFO 9656 --- [  restartedMain] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
2017-08-06 13:07:10.671  INFO 9656 --- [  restartedMain] c.c.xh.AdCampaignServiceApplication      : Started AdCampaignServiceApplication in 5.258 seconds (JVM running for 5.75)
```

## About the Service

You can call some REST endpoints defined in ```com.comcast.xh.controller.AdCampaignController``` on **port 8080**.
You can call some of the operational endpoints like
```
http://localhost:8090/campaign/addCampaign
```

Here are some endpoints you can call:

### Create a Campaign for a Partner

```
POST http://localhost:8090/campaign/addCampaign
Accept: application/json
Content-Type: application/json

{

"partner_id": "Comcast",
"duration":10,
"ad_content":"XH Advertising",
"ad_title":"XH Home Security",
"ad_status":"Active"

}

RESPONSE: HTTP 200 (Created)
```
### Retrieve all Campaigns

```
GET http://localhost:8090/campaign/getAllCampaigns

Response: HTTP 200
Content: List of all Campaigns
```

### Update a Campaign

```
PUT http://localhost:8090/campaign/updateCampaign
Accept: application/json
Content-Type: application/json

{

"partner_id": "Comcast",
"duration":100,
"ad_content":"XH Advertising",
"ad_title":"XH Home Security",
"ad_status":"Active"

}

RESPONSE: HTTP 200
```

### Retrieve Camapign based on partner_id

```
GET http://localhost:8090/campaign/getCampaign/{partner_id}

Response: HTTP 200
Content: Campaign in json format
```