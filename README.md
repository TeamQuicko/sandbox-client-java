
# Sandbox API Client

The official repository of SDK to communicate with Sandbox APIs.

Sandbox API is a set of REST APIs provides digital infrastructure you will need to quickly build and scale your fintech application in banking, savings, wealth, financial wellness, and insurance.

Quicko Infosoft Pvt Ltd (c) 2020.

## Documentation

[Sandbox API documentation](http://docs.sandbox.co.in/)

## Installation
### Requirements

- Java 1.8 or later

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.sandbox</groupId>
    <artifactId>api-client</artifactId>
    <version>3.5.0-SNAPSHOT</version>
</dependency>
```

<!-- ### Others

You'll need to manually install the following JARs:

- The Sandbox API Client JAR from <To be added> -->

  
## Usage

### API Authentication

Instantiate `ApiClient` with `api_key` & `api_secret`. Use this ApiClient to call Paid APIs or to access resources on server for api user. You can obtain the key from the dashboard. <https://dashboard.sandbox.co.in>

```java
// Initialize ApiUserCredentials
ApiUserCredentials credentials = new ApiUserCredentials("api_key", "api_secret");

// Initialize ApiClient with API session
ApiClient client =
       ApiClientBuilder.basic().withCredentials(credentials).build();
	   
// Use ApiClient to call Paid APIs or to access resources on server for api user
GoodsAndServicesTaxIdentificationNumber gstin = client.GST.searchGSTIN(gstin);
```
