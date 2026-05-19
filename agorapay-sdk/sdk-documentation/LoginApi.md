# LoginApi

All URIs are relative to *https://api.live.agorapay.com/mkp*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tokenPost**](LoginApi.md#tokenPost) | **POST** /token |  |



## tokenPost

> AuthenticationSuccess tokenPost(grantType, scope, contentType)



### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.LoginApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP basic authorization: auth
        HttpBasicAuth auth = (HttpBasicAuth) defaultClient.getAuthentication("auth");
        auth.setUsername("YOUR USERNAME");
        auth.setPassword("YOUR PASSWORD");

        LoginApi apiInstance = new LoginApi(defaultClient);
        String grantType = "client_credentials"; // String | 
        String scope = "openid"; // String | 
        String contentType = "contentType_example"; // String | 
        try {
            AuthenticationSuccess result = apiInstance.tokenPost(grantType, scope, contentType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoginApi#tokenPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **grantType** | **String**|  | [optional] [default to client_credentials] |
| **scope** | **String**|  | [optional] [default to openid] |
| **contentType** | **String**|  | [optional] |

### Return type

[**AuthenticationSuccess**](AuthenticationSuccess.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

