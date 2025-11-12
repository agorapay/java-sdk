# DefaultApi

All URIs are relative to *https://api.live.agorapay.com/mkp*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountHolderOnlineRegisterPost**](DefaultApi.md#accountHolderOnlineRegisterPost) | **POST** /accountHolder/onlineRegister |  |
| [**accountHolderRegisterPost**](DefaultApi.md#accountHolderRegisterPost) | **POST** /accountHolder/register |  |
| [**accountHolderRegistrationDetailsGet**](DefaultApi.md#accountHolderRegistrationDetailsGet) | **GET** /accountHolder/registrationDetails |  |
| [**accountHolderUnregisterPost**](DefaultApi.md#accountHolderUnregisterPost) | **POST** /accountHolder/unregister |  |
| [**accountHolderUpdatePost**](DefaultApi.md#accountHolderUpdatePost) | **POST** /accountHolder/update |  |
| [**accountHolderUploadDocumentPost**](DefaultApi.md#accountHolderUploadDocumentPost) | **POST** /accountHolder/uploadDocument |  |
| [**mandateCreatePost**](DefaultApi.md#mandateCreatePost) | **POST** /mandate/create |  |
| [**mandateUpdatePost**](DefaultApi.md#mandateUpdatePost) | **POST** /mandate/update |  |
| [**operationsListPost**](DefaultApi.md#operationsListPost) | **POST** /operations/list |  |
| [**payinAdjustPaymentPost**](DefaultApi.md#payinAdjustPaymentPost) | **POST** /payin/adjustPayment |  |
| [**payinCancelPost**](DefaultApi.md#payinCancelPost) | **POST** /payin/cancel |  |
| [**payinCapturePost**](DefaultApi.md#payinCapturePost) | **POST** /payin/capture |  |
| [**payinMandateGet**](DefaultApi.md#payinMandateGet) | **GET** /payin/mandate |  |
| [**payinOrderDetailsGet**](DefaultApi.md#payinOrderDetailsGet) | **GET** /payin/orderDetails |  |
| [**payinPaymentDetailsPost**](DefaultApi.md#payinPaymentDetailsPost) | **POST** /payin/paymentDetails |  |
| [**payinPaymentIframePost**](DefaultApi.md#payinPaymentIframePost) | **POST** /payin/paymentIframe |  |
| [**payinPaymentIframeSecurePost**](DefaultApi.md#payinPaymentIframeSecurePost) | **POST** /payin/paymentIframeSecure |  |
| [**payinPaymentMethodsPost**](DefaultApi.md#payinPaymentMethodsPost) | **POST** /payin/paymentMethods |  |
| [**payinPaymentPost**](DefaultApi.md#payinPaymentPost) | **POST** /payin/payment |  |
| [**payinPaymentSecurePost**](DefaultApi.md#payinPaymentSecurePost) | **POST** /payin/paymentSecure |  |
| [**payinRefundPost**](DefaultApi.md#payinRefundPost) | **POST** /payin/refund |  |
| [**payinReloadPost**](DefaultApi.md#payinReloadPost) | **POST** /payin/reload | Credit payment account by PayIn SDD B2C |
| [**payinTicketGet**](DefaultApi.md#payinTicketGet) | **GET** /payin/ticket | Get card payment ticket |
| [**paymentAccountCreditPost**](DefaultApi.md#paymentAccountCreditPost) | **POST** /paymentAccount/credit |  |
| [**paymentAccountDisableIBANPost**](DefaultApi.md#paymentAccountDisableIBANPost) | **POST** /paymentAccount/disableIBAN |  |
| [**paymentAccountGet**](DefaultApi.md#paymentAccountGet) | **GET** /paymentAccount |  |
| [**paymentAccountListPost**](DefaultApi.md#paymentAccountListPost) | **POST** /paymentAccount/list |  |
| [**paymentAccountPayoutAutoPost**](DefaultApi.md#paymentAccountPayoutAutoPost) | **POST** /paymentAccount/payoutAuto |  |
| [**paymentAccountReportGet**](DefaultApi.md#paymentAccountReportGet) | **GET** /paymentAccount/report |  |
| [**paymentAccountSetAuthorizedOverdraftPost**](DefaultApi.md#paymentAccountSetAuthorizedOverdraftPost) | **POST** /paymentAccount/setAuthorizedOverdraft | Function to update authorized OverDraft Amount |
| [**paymentAccountSetFloorLimitPost**](DefaultApi.md#paymentAccountSetFloorLimitPost) | **POST** /paymentAccount/setFloorLimit | Start change IBAN process |
| [**paymentAccountSetIBANPost**](DefaultApi.md#paymentAccountSetIBANPost) | **POST** /paymentAccount/setIBAN | Start change IBAN process |
| [**paymentMethodGetAliasPost**](DefaultApi.md#paymentMethodGetAliasPost) | **POST** /paymentMethod/getAlias |  |
| [**paymentMethodGetIBANPost**](DefaultApi.md#paymentMethodGetIBANPost) | **POST** /paymentMethod/getIBAN |  |
| [**paymentMethodListPost**](DefaultApi.md#paymentMethodListPost) | **POST** /paymentMethod/list |  |
| [**paymentMethodRemoveAliasPost**](DefaultApi.md#paymentMethodRemoveAliasPost) | **POST** /paymentMethod/removeAlias |  |
| [**payoutCreatePost**](DefaultApi.md#payoutCreatePost) | **POST** /payout/create |  |
| [**selfcareInitPost**](DefaultApi.md#selfcareInitPost) | **POST** /selfcare/init |  |
| [**transferCreatePost**](DefaultApi.md#transferCreatePost) | **POST** /transfer/create |  |



## accountHolderOnlineRegisterPost

> AccountHolderOnlineRegisterResponse accountHolderOnlineRegisterPost(accountHolderOnlineRegisterRequest)



Start registering new account holder

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AccountHolderOnlineRegisterRequest accountHolderOnlineRegisterRequest = new AccountHolderOnlineRegisterRequest(); // AccountHolderOnlineRegisterRequest | 
        try {
            AccountHolderOnlineRegisterResponse result = apiInstance.accountHolderOnlineRegisterPost(accountHolderOnlineRegisterRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountHolderOnlineRegisterPost");
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
| **accountHolderOnlineRegisterRequest** | [**AccountHolderOnlineRegisterRequest**](AccountHolderOnlineRegisterRequest.md)|  | |

### Return type

[**AccountHolderOnlineRegisterResponse**](AccountHolderOnlineRegisterResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response to accountHolder registration |  -  |
| **400** | Response when error is detected |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## accountHolderRegisterPost

> AccountHolderRegisterResponse accountHolderRegisterPost(accountHolderRegisterRequest)



Start registering new account holder

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AccountHolderRegisterRequest accountHolderRegisterRequest = new AccountHolderRegisterRequest(); // AccountHolderRegisterRequest | 
        try {
            AccountHolderRegisterResponse result = apiInstance.accountHolderRegisterPost(accountHolderRegisterRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountHolderRegisterPost");
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
| **accountHolderRegisterRequest** | [**AccountHolderRegisterRequest**](AccountHolderRegisterRequest.md)|  | |

### Return type

[**AccountHolderRegisterResponse**](AccountHolderRegisterResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response to accountHolder registration |  -  |
| **400** | Response when error is detected |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## accountHolderRegistrationDetailsGet

> AccountHolderRegisterResponse accountHolderRegistrationDetailsGet(requestId)



Get registration details

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String requestId = "requestId=2176372"; // String | Registration request identifier
        try {
            AccountHolderRegisterResponse result = apiInstance.accountHolderRegistrationDetailsGet(requestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountHolderRegistrationDetailsGet");
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
| **requestId** | **String**| Registration request identifier | |

### Return type

[**AccountHolderRegisterResponse**](AccountHolderRegisterResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | registration information response |  -  |
| **400** | Response error |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## accountHolderUnregisterPost

> AccountHolderUnregisterResponse accountHolderUnregisterPost(accountHolderUnregisterRequest)



Unregister pending account holder registration

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AccountHolderUnregisterRequest accountHolderUnregisterRequest = new AccountHolderUnregisterRequest(); // AccountHolderUnregisterRequest | 
        try {
            AccountHolderUnregisterResponse result = apiInstance.accountHolderUnregisterPost(accountHolderUnregisterRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountHolderUnregisterPost");
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
| **accountHolderUnregisterRequest** | [**AccountHolderUnregisterRequest**](AccountHolderUnregisterRequest.md)|  | [optional] |

### Return type

[**AccountHolderUnregisterResponse**](AccountHolderUnregisterResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Result response |  -  |
| **400** | Error response |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## accountHolderUpdatePost

> AccountHolderUpdateResponse accountHolderUpdatePost(accountHolderUpdateRequest)



Update account holder registration

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AccountHolderUpdateRequest accountHolderUpdateRequest = new AccountHolderUpdateRequest(); // AccountHolderUpdateRequest | 
        try {
            AccountHolderUpdateResponse result = apiInstance.accountHolderUpdatePost(accountHolderUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountHolderUpdatePost");
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
| **accountHolderUpdateRequest** | [**AccountHolderUpdateRequest**](AccountHolderUpdateRequest.md)|  | |

### Return type

[**AccountHolderUpdateResponse**](AccountHolderUpdateResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update register response |  -  |
| **400** | Response when error is detected |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## accountHolderUploadDocumentPost

> AccountHolderUploadDocumentResponse accountHolderUploadDocumentPost(json, _file)



Upload document in registration process. Upload must be done in multipart/form-data mime type. One part must be a valid JSON with required fields in content-disposition named &#39;json&#39;. Second part must be the file base64 encoded in content-disposition named &#39;file&#39;. fileExt is defined in content-type of file part.

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AccountHolderUploadDocumentRequest json = new AccountHolderUploadDocumentRequest(); // AccountHolderUploadDocumentRequest | 
        Object _file = null; // Object | 
        try {
            AccountHolderUploadDocumentResponse result = apiInstance.accountHolderUploadDocumentPost(json, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountHolderUploadDocumentPost");
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
| **json** | [**AccountHolderUploadDocumentRequest**](AccountHolderUploadDocumentRequest.md)|  | |
| **_file** | [**Object**](Object.md)|  | |

### Return type

[**AccountHolderUploadDocumentResponse**](AccountHolderUploadDocumentResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload document response |  -  |
| **400** | Response when error is detected |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## mandateCreatePost

> MandateCreateResponse mandateCreatePost(mandateCreateRequest)



Generate a SEPA Direct debit mandate B2C or B2B, do not generate any transactions

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        MandateCreateRequest mandateCreateRequest = new MandateCreateRequest(); // MandateCreateRequest | 
        try {
            MandateCreateResponse result = apiInstance.mandateCreatePost(mandateCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#mandateCreatePost");
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
| **mandateCreateRequest** | [**MandateCreateRequest**](MandateCreateRequest.md)|  | |

### Return type

[**MandateCreateResponse**](MandateCreateResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SEPA Direct Debit mandate generated |  -  |
| **400** | error in operation processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## mandateUpdatePost

> MandateUpdateResponse mandateUpdatePost(mandateUpdateRequest)



Generate a SEPA Direct debit mandate B2C or B2B, do not generate any transactions

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        MandateUpdateRequest mandateUpdateRequest = new MandateUpdateRequest(); // MandateUpdateRequest | 
        try {
            MandateUpdateResponse result = apiInstance.mandateUpdatePost(mandateUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#mandateUpdatePost");
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
| **mandateUpdateRequest** | [**MandateUpdateRequest**](MandateUpdateRequest.md)|  | |

### Return type

[**MandateUpdateResponse**](MandateUpdateResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SEPA Direct Debit mandate updated successfully |  -  |
| **400** | error in operation processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## operationsListPost

> OperationsListResponse operationsListPost(operationsListRequest)



Retrieve operation from criteria

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        OperationsListRequest operationsListRequest = new OperationsListRequest(); // OperationsListRequest | All request data are embedded in a json structure in the body
        try {
            OperationsListResponse result = apiInstance.operationsListPost(operationsListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#operationsListPost");
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
| **operationsListRequest** | [**OperationsListRequest**](OperationsListRequest.md)| All request data are embedded in a json structure in the body | |

### Return type

[**OperationsListResponse**](OperationsListResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | To have the list of operation from a Marketplace |  -  |
| **400** | Processing error |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## payinAdjustPaymentPost

> AjustPaymentResponse payinAdjustPaymentPost(adjustPaymentRequest)



Before the cashing of the operation, change the payment amount and/or the breakdown If it&#39;s only a change in the breakdown, set the adjustAmount to the same of the transactionAmount

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AdjustPaymentRequest adjustPaymentRequest = new AdjustPaymentRequest(); // AdjustPaymentRequest | All request data are embedded in a json structure in the body
        try {
            AjustPaymentResponse result = apiInstance.payinAdjustPaymentPost(adjustPaymentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#payinAdjustPaymentPost");
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
| **adjustPaymentRequest** | [**AdjustPaymentRequest**](AdjustPaymentRequest.md)| All request data are embedded in a json structure in the body | |

### Return type

[**AjustPaymentResponse**](AjustPaymentResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New amount and/ord breakdown successfully submitted |  -  |
| **400** | error in operation processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## payinCancelPost

> CancelResponse payinCancelPost(cancelRequest)



Cancel a payment transaction or all the payment transactions of an order

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        CancelRequest cancelRequest = new CancelRequest(); // CancelRequest | 
        try {
            CancelResponse result = apiInstance.payinCancelPost(cancelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#payinCancelPost");
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
| **cancelRequest** | [**CancelRequest**](CancelRequest.md)|  | [optional] |

### Return type

[**CancelResponse**](CancelResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancelation Done |  -  |
| **400** | error in operation processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## payinCapturePost

> CaptureResponse payinCapturePost(captureRequest)



Capture a payment transaction or all the capturable payment transactions of an order

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        CaptureRequest captureRequest = new CaptureRequest(); // CaptureRequest | 
        try {
            CaptureResponse result = apiInstance.payinCapturePost(captureRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#payinCapturePost");
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
| **captureRequest** | [**CaptureRequest**](CaptureRequest.md)|  | |

### Return type

[**CaptureResponse**](CaptureResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Capture Done |  -  |
| **400** | Error in capture processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## payinMandateGet

> GetMandateResponse payinMandateGet(transactionId, reference)



Get signed mandate file

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String transactionId = "{\"transactionId\":165231523612}"; // String | Must be a transaction for SDD. Must be provided if reference is not present.
        String reference = "{\"reference\":\"2020110907201100Y0H1102\"}"; // String | Mandate reference (UMR). Must be provided if transationId is not present
        try {
            GetMandateResponse result = apiInstance.payinMandateGet(transactionId, reference);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#payinMandateGet");
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
| **transactionId** | **String**| Must be a transaction for SDD. Must be provided if reference is not present. | [optional] |
| **reference** | **String**| Mandate reference (UMR). Must be provided if transationId is not present | [optional] |

### Return type

[**GetMandateResponse**](GetMandateResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get SDD mandate signed file |  -  |
| **400** | error in request processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## payinOrderDetailsGet

> OrderDetailsResponse payinOrderDetailsGet(orderId)



Send back all the data of an order and its transactions

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String orderId = "{\"orderId\":\"25465265\"}"; // String | id of the order.
        try {
            OrderDetailsResponse result = apiInstance.payinOrderDetailsGet(orderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#payinOrderDetailsGet");
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
| **orderId** | **String**| id of the order. | |

### Return type

[**OrderDetailsResponse**](OrderDetailsResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order retrieved successfully |  -  |
| **400** | error in order retireval |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## payinPaymentDetailsPost

> PaymentDetailsResponse payinPaymentDetailsPost(paymentDetailsRequest)



The call send the last mandatory data to finalize the payment

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PaymentDetailsRequest paymentDetailsRequest = new PaymentDetailsRequest(); // PaymentDetailsRequest | All request data are embedded in a json structure in the body
        try {
            PaymentDetailsResponse result = apiInstance.payinPaymentDetailsPost(paymentDetailsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#payinPaymentDetailsPost");
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
| **paymentDetailsRequest** | [**PaymentDetailsRequest**](PaymentDetailsRequest.md)| All request data are embedded in a json structure in the body | |

### Return type

[**PaymentDetailsResponse**](PaymentDetailsResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment transaction processed successfully |  -  |
| **400** | Error in processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## payinPaymentIframePost

> PaymentIframeResponse payinPaymentIframePost(paymentIframeRequest)



When your shopper is ready to pay, submit your order/payment by this request and get an Authent Code. Then save the orderId and open an iframe for the shopper with the authentCode.

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PaymentIframeRequest paymentIframeRequest = new PaymentIframeRequest(); // PaymentIframeRequest | All request data are embedded in a json structure in the body
        try {
            PaymentIframeResponse result = apiInstance.payinPaymentIframePost(paymentIframeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#payinPaymentIframePost");
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
| **paymentIframeRequest** | [**PaymentIframeRequest**](PaymentIframeRequest.md)| All request data are embedded in a json structure in the body | |

### Return type

[**PaymentIframeResponse**](PaymentIframeResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Start payment with iframe response |  -  |
| **400** | error in operation processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## payinPaymentIframeSecurePost

> PaymentIframeResponse payinPaymentIframeSecurePost(paymentIframeRequest)



When your shopper is ready to pay, submit your order/payment by this request and get an Authent Code. Then save the orderId and open an iframe for the shopper with the authentCode. More strict control compared to /payin/paymentIframe

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PaymentIframeRequest paymentIframeRequest = new PaymentIframeRequest(); // PaymentIframeRequest | All request data are embedded in a json structure in the body
        try {
            PaymentIframeResponse result = apiInstance.payinPaymentIframeSecurePost(paymentIframeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#payinPaymentIframeSecurePost");
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
| **paymentIframeRequest** | [**PaymentIframeRequest**](PaymentIframeRequest.md)| All request data are embedded in a json structure in the body | |

### Return type

[**PaymentIframeResponse**](PaymentIframeResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Start payment with iframe response |  -  |
| **400** | error in operation processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## payinPaymentMethodsPost

> PaymentMethodsResponse payinPaymentMethodsPost(paymentMethodsRequest)



When your shopper is ready to pay, submit an order and get a list of the available payment methods and alias. The list is based on the shopper country and the order amount and currency.  This is the first call to use when going on a payment operation. The next call should be /payment

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PaymentMethodsRequest paymentMethodsRequest = new PaymentMethodsRequest(); // PaymentMethodsRequest | All request data are embedded in a json structure in the body
        try {
            PaymentMethodsResponse result = apiInstance.payinPaymentMethodsPost(paymentMethodsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#payinPaymentMethodsPost");
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
| **paymentMethodsRequest** | [**PaymentMethodsRequest**](PaymentMethodsRequest.md)| All request data are embedded in a json structure in the body | |

### Return type

[**PaymentMethodsResponse**](PaymentMethodsResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order created/retrieved, Available Payment Methods selected |  -  |
| **400** | Error in processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## payinPaymentPost

> PaymentResponse payinPaymentPost(paymentRequest)



When your shopper choose a payment method, this call submit the choice and any data if already given. The return can be final, (transaction completed) or ask to authentification details, or redirect the shopper to PSP or 3DS pages.

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PaymentRequest paymentRequest = new PaymentRequest(); // PaymentRequest | All request data are embedded in a json structure in the body
        try {
            PaymentResponse result = apiInstance.payinPaymentPost(paymentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#payinPaymentPost");
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
| **paymentRequest** | [**PaymentRequest**](PaymentRequest.md)| All request data are embedded in a json structure in the body | |

### Return type

[**PaymentResponse**](PaymentResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment processing success |  -  |
| **400** | Error in processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## payinPaymentSecurePost

> PaymentResponse payinPaymentSecurePost(paymentRequest)



When your shopper choose a payment method, this call submit the choice and any data if already given. The return can be final, (transaction completed) or ask to authentification details, or redirect the shopper to PSP or 3DS pages. More strict control compared to /payin/payment

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PaymentRequest paymentRequest = new PaymentRequest(); // PaymentRequest | All request data are embedded in a json structure in the body
        try {
            PaymentResponse result = apiInstance.payinPaymentSecurePost(paymentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#payinPaymentSecurePost");
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
| **paymentRequest** | [**PaymentRequest**](PaymentRequest.md)| All request data are embedded in a json structure in the body | |

### Return type

[**PaymentResponse**](PaymentResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment processing success |  -  |
| **400** | Error in processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## payinRefundPost

> RefundResponse payinRefundPost(refundRequest)



Refund a payment transaction or all the refundable payment transactions of an order

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        RefundRequest refundRequest = new RefundRequest(); // RefundRequest | 
        try {
            RefundResponse result = apiInstance.payinRefundPost(refundRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#payinRefundPost");
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
| **refundRequest** | [**RefundRequest**](RefundRequest.md)|  | |

### Return type

[**RefundResponse**](RefundResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Refund Done |  -  |
| **400** | error in request processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## payinReloadPost

> PayinReloadResponse payinReloadPost(payinReloadRequest)

Credit payment account by PayIn SDD B2C

Credit payment account by PayIn SEPA Direct Debit (SDD) for B2C

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PayinReloadRequest payinReloadRequest = new PayinReloadRequest(); // PayinReloadRequest | 
        try {
            PayinReloadResponse result = apiInstance.payinReloadPost(payinReloadRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#payinReloadPost");
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
| **payinReloadRequest** | [**PayinReloadRequest**](PayinReloadRequest.md)|  | |

### Return type

[**PayinReloadResponse**](PayinReloadResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account credit response |  -  |
| **400** | error in request processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## payinTicketGet

> GetTicketResponse payinTicketGet(transactionId, format, type, message)

Get card payment ticket

This API is used to get ticket in JSON or in PDF format

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String transactionId = "{\"transactionId\":\"234352\"}"; // String | Id of the transaction. Must be a card transaction.
        String format = "{\"format\":\"J\"}"; // String | Ticket format : J JSON, P : PDF
        String type = "{\"type\":\"M\"}"; // String | Ticket type : C client, M : merchant
        String message = "{\"message\":\"Message to display in the bottom of the PDF ticket\"}"; // String | Message to set in the bottom of the ticket.
        try {
            GetTicketResponse result = apiInstance.payinTicketGet(transactionId, format, type, message);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#payinTicketGet");
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
| **transactionId** | **String**| Id of the transaction. Must be a card transaction. | |
| **format** | **String**| Ticket format : J JSON, P : PDF | |
| **type** | **String**| Ticket type : C client, M : merchant | |
| **message** | **String**| Message to set in the bottom of the ticket. | [optional] |

### Return type

[**GetTicketResponse**](GetTicketResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get card payment ticket |  -  |
| **400** | error in request processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## paymentAccountCreditPost

> PaymentAccountCreditResponse paymentAccountCreditPost(paymentAccountCreditRequest)



Credit payment account

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PaymentAccountCreditRequest paymentAccountCreditRequest = new PaymentAccountCreditRequest(); // PaymentAccountCreditRequest | 
        try {
            PaymentAccountCreditResponse result = apiInstance.paymentAccountCreditPost(paymentAccountCreditRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#paymentAccountCreditPost");
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
| **paymentAccountCreditRequest** | [**PaymentAccountCreditRequest**](PaymentAccountCreditRequest.md)|  | |

### Return type

[**PaymentAccountCreditResponse**](PaymentAccountCreditResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account credit response |  -  |
| **400** | error in request processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## paymentAccountDisableIBANPost

> PaymentAccountDisableIBANResponse paymentAccountDisableIBANPost(paymentAccountDisableIBANRequest)



Disable current or pending payment method

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PaymentAccountDisableIBANRequest paymentAccountDisableIBANRequest = new PaymentAccountDisableIBANRequest(); // PaymentAccountDisableIBANRequest | 
        try {
            PaymentAccountDisableIBANResponse result = apiInstance.paymentAccountDisableIBANPost(paymentAccountDisableIBANRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#paymentAccountDisableIBANPost");
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
| **paymentAccountDisableIBANRequest** | [**PaymentAccountDisableIBANRequest**](PaymentAccountDisableIBANRequest.md)|  | [optional] |

### Return type

[**PaymentAccountDisableIBANResponse**](PaymentAccountDisableIBANResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Disable IBAN response |  -  |
| **400** | error in request processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## paymentAccountGet

> AccountResponse paymentAccountGet(accountNumber)



Get account details

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String accountNumber = "{\"accountNumber\":\"1300600000EUR01006110\"}"; // String | identifier of the account to get details.
        try {
            AccountResponse result = apiInstance.paymentAccountGet(accountNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#paymentAccountGet");
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
| **accountNumber** | **String**| identifier of the account to get details. | |

### Return type

[**AccountResponse**](AccountResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account Details retrieved |  -  |
| **400** | error in order retireval |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## paymentAccountListPost

> PaymentAccountListResponse paymentAccountListPost(paymentAccountListRequest)



Retrieve the accounts according to the search criteria

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PaymentAccountListRequest paymentAccountListRequest = new PaymentAccountListRequest(); // PaymentAccountListRequest | 
        try {
            PaymentAccountListResponse result = apiInstance.paymentAccountListPost(paymentAccountListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#paymentAccountListPost");
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
| **paymentAccountListRequest** | [**PaymentAccountListRequest**](PaymentAccountListRequest.md)|  | |

### Return type

[**PaymentAccountListResponse**](PaymentAccountListResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response contains account list |  -  |
| **400** | error in order retireval |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## paymentAccountPayoutAutoPost

> PaymentAccountPayautoResponse paymentAccountPayoutAutoPost(paymentAccountPayautoRequest)



the API allows you to configure the automatic payout

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PaymentAccountPayautoRequest paymentAccountPayautoRequest = new PaymentAccountPayautoRequest(); // PaymentAccountPayautoRequest | 
        try {
            PaymentAccountPayautoResponse result = apiInstance.paymentAccountPayoutAutoPost(paymentAccountPayautoRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#paymentAccountPayoutAutoPost");
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
| **paymentAccountPayautoRequest** | [**PaymentAccountPayautoRequest**](PaymentAccountPayautoRequest.md)|  | |

### Return type

[**PaymentAccountPayautoResponse**](PaymentAccountPayautoResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Automatic payout response |  -  |
| **400** | error in request processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## paymentAccountReportGet

> PaymentAccountReportResponse paymentAccountReportGet(type, format, year, accountNumber, month)



Get account details

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String type = "STATEMENT"; // String | Type of report. Can be one of follonging value: - STATEMENT - INVOICE - RAFEC - RMFEC
        String format = "P"; // String | Format of the report: - P: PDF format - C: CSV format (not yet implemented)
        String year = "{\"year\":\"2022\"}"; // String | Year of the report in AAAA format. Must be less or equal to the current year.
        String accountNumber = "{\"accountNumber\":\"1300600000EUR01006110\"}"; // String | identifier of the account to get details. Mandatory if type STATEMENT.
        String month = "01"; // String | Month of the report in MM format. Must be less or equal to the current month. Mandatory if type RMFEC.
        try {
            PaymentAccountReportResponse result = apiInstance.paymentAccountReportGet(type, format, year, accountNumber, month);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#paymentAccountReportGet");
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
| **type** | **String**| Type of report. Can be one of follonging value: - STATEMENT - INVOICE - RAFEC - RMFEC | [enum: STATEMENT, INVOICE, RAFEC, RMFEC] |
| **format** | **String**| Format of the report: - P: PDF format - C: CSV format (not yet implemented) | [enum: P, C] |
| **year** | **String**| Year of the report in AAAA format. Must be less or equal to the current year. | |
| **accountNumber** | **String**| identifier of the account to get details. Mandatory if type STATEMENT. | [optional] |
| **month** | **String**| Month of the report in MM format. Must be less or equal to the current month. Mandatory if type RMFEC. | [optional] [enum: 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12] |

### Return type

[**PaymentAccountReportResponse**](PaymentAccountReportResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Report in base64 |  -  |
| **400** | error in order retireval |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## paymentAccountSetAuthorizedOverdraftPost

> PaymentAccountSetFloorLimitResponse paymentAccountSetAuthorizedOverdraftPost(paymentAccountSetAuthorizedOverdraftRequest)

Function to update authorized OverDraft Amount

Function to update authorized OverDraft Amount

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PaymentAccountSetAuthorizedOverdraftRequest paymentAccountSetAuthorizedOverdraftRequest = new PaymentAccountSetAuthorizedOverdraftRequest(); // PaymentAccountSetAuthorizedOverdraftRequest | 
        try {
            PaymentAccountSetFloorLimitResponse result = apiInstance.paymentAccountSetAuthorizedOverdraftPost(paymentAccountSetAuthorizedOverdraftRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#paymentAccountSetAuthorizedOverdraftPost");
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
| **paymentAccountSetAuthorizedOverdraftRequest** | [**PaymentAccountSetAuthorizedOverdraftRequest**](PaymentAccountSetAuthorizedOverdraftRequest.md)|  | |

### Return type

[**PaymentAccountSetFloorLimitResponse**](PaymentAccountSetFloorLimitResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change account floor limit |  -  |
| **400** | error in request processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## paymentAccountSetFloorLimitPost

> PaymentAccountSetFloorLimitResponse paymentAccountSetFloorLimitPost(paymentAccountSetFloorLimitRequest)

Start change IBAN process

This function start the process to change IBAN. In response a requestID is provided to identify the change process. After validation in tyhe BO, the proprietary of the account will received an email with a link to validate this request.

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PaymentAccountSetFloorLimitRequest paymentAccountSetFloorLimitRequest = new PaymentAccountSetFloorLimitRequest(); // PaymentAccountSetFloorLimitRequest | 
        try {
            PaymentAccountSetFloorLimitResponse result = apiInstance.paymentAccountSetFloorLimitPost(paymentAccountSetFloorLimitRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#paymentAccountSetFloorLimitPost");
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
| **paymentAccountSetFloorLimitRequest** | [**PaymentAccountSetFloorLimitRequest**](PaymentAccountSetFloorLimitRequest.md)|  | |

### Return type

[**PaymentAccountSetFloorLimitResponse**](PaymentAccountSetFloorLimitResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change account floor limit |  -  |
| **400** | error in request processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## paymentAccountSetIBANPost

> PaymentAccountSetIBANResponse paymentAccountSetIBANPost(paymentAccountSetIBANRequest)

Start change IBAN process

This function start the process to change IBAN. In response a requestID is provided to identify the change process. After validation in tyhe BO, the proprietary of the account will received an email with a link to validate this request.

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PaymentAccountSetIBANRequest paymentAccountSetIBANRequest = new PaymentAccountSetIBANRequest(); // PaymentAccountSetIBANRequest | 
        try {
            PaymentAccountSetIBANResponse result = apiInstance.paymentAccountSetIBANPost(paymentAccountSetIBANRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#paymentAccountSetIBANPost");
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
| **paymentAccountSetIBANRequest** | [**PaymentAccountSetIBANRequest**](PaymentAccountSetIBANRequest.md)|  | |

### Return type

[**PaymentAccountSetIBANResponse**](PaymentAccountSetIBANResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Start change iban process response |  -  |
| **400** | error in request processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## paymentMethodGetAliasPost

> GetAliasResponse paymentMethodGetAliasPost(getAliasRequest)



Get a list of the available payment method aliases according to the payer reference and eventually for a specific payment method

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        GetAliasRequest getAliasRequest = new GetAliasRequest(); // GetAliasRequest | All request data are embedded in a json structure in the body
        try {
            GetAliasResponse result = apiInstance.paymentMethodGetAliasPost(getAliasRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#paymentMethodGetAliasPost");
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
| **getAliasRequest** | [**GetAliasRequest**](GetAliasRequest.md)| All request data are embedded in a json structure in the body | |

### Return type

[**GetAliasResponse**](GetAliasResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Available Payment Method Aliases corresponding to criteria |  -  |
| **400** | Error in processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## paymentMethodGetIBANPost

> PaymentMethodGetIBANResponse paymentMethodGetIBANPost(paymentMethodGetIBANRequest)



Get IBAN from a given payment method alias, as saved during an instant payment SCT

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PaymentMethodGetIBANRequest paymentMethodGetIBANRequest = new PaymentMethodGetIBANRequest(); // PaymentMethodGetIBANRequest | API request body to get IBAN from payment method alias
        try {
            PaymentMethodGetIBANResponse result = apiInstance.paymentMethodGetIBANPost(paymentMethodGetIBANRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#paymentMethodGetIBANPost");
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
| **paymentMethodGetIBANRequest** | [**PaymentMethodGetIBANRequest**](PaymentMethodGetIBANRequest.md)| API request body to get IBAN from payment method alias | |

### Return type

[**PaymentMethodGetIBANResponse**](PaymentMethodGetIBANResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The purpose of this API is to get IBAN from Instant SCT payment path done beforehand |  -  |
| **400** | Error in processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## paymentMethodListPost

> PaymentMethodListResponse paymentMethodListPost(paymentMethodListRequest)



List payment methods and eventually aliases, according to the transaction amount and the country of the payer. This API is preferred to payin/paymentMethods if you are not intending to create any order

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PaymentMethodListRequest paymentMethodListRequest = new PaymentMethodListRequest(); // PaymentMethodListRequest | API request body for a payment methods list (and eventually aliases)
        try {
            PaymentMethodListResponse result = apiInstance.paymentMethodListPost(paymentMethodListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#paymentMethodListPost");
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
| **paymentMethodListRequest** | [**PaymentMethodListRequest**](PaymentMethodListRequest.md)| API request body for a payment methods list (and eventually aliases) | |

### Return type

[**PaymentMethodListResponse**](PaymentMethodListResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of available Payment Methods and aliases selected |  -  |
| **400** | Error in processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## paymentMethodRemoveAliasPost

> ResponseSimple paymentMethodRemoveAliasPost(removeAliasRequest)



Remove a given payment method alias id

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        RemoveAliasRequest removeAliasRequest = new RemoveAliasRequest(); // RemoveAliasRequest | 
        try {
            ResponseSimple result = apiInstance.paymentMethodRemoveAliasPost(removeAliasRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#paymentMethodRemoveAliasPost");
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
| **removeAliasRequest** | [**RemoveAliasRequest**](RemoveAliasRequest.md)|  | |

### Return type

[**ResponseSimple**](ResponseSimple.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | error in processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## payoutCreatePost

> PayoutResponse payoutCreatePost(payoutRequest)



From accountNumber to the bank account associated to this account number.

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PayoutRequest payoutRequest = new PayoutRequest(); // PayoutRequest | 
        try {
            PayoutResponse result = apiInstance.payoutCreatePost(payoutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#payoutCreatePost");
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
| **payoutRequest** | [**PayoutRequest**](PayoutRequest.md)|  | |

### Return type

[**PayoutResponse**](PayoutResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payout successful |  -  |
| **400** | error in processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## selfcareInitPost

> SelfcareInitResponse selfcareInitPost(selfcareInitRequest)



Init Selfcare seller enrollment by creating a new request, identified by requestId value

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        SelfcareInitRequest selfcareInitRequest = new SelfcareInitRequest(); // SelfcareInitRequest | 
        try {
            SelfcareInitResponse result = apiInstance.selfcareInitPost(selfcareInitRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#selfcareInitPost");
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
| **selfcareInitRequest** | [**SelfcareInitRequest**](SelfcareInitRequest.md)|  | |

### Return type

[**SelfcareInitResponse**](SelfcareInitResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Seller enrollment request initialized |  -  |
| **400** | error in operation processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |


## transferCreatePost

> TransferResponse transferCreatePost(transferRequest)



Submit a transfer from one account (accountNumber) to another (accountCtpNumber)

### Example

```java
// Import classes:
import com.agorapay.client.ApiClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.Configuration;
import com.agorapay.client.auth.*;
import com.agorapay.client.models.*;
import com.agorapay.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.live.agorapay.com/mkp");
        
        // Configure HTTP bearer authorization: authorization
        HttpBearerAuth authorization = (HttpBearerAuth) defaultClient.getAuthentication("authorization");
        authorization.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: idToken
        ApiKeyAuth idToken = (ApiKeyAuth) defaultClient.getAuthentication("idToken");
        idToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //idToken.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        TransferRequest transferRequest = new TransferRequest(); // TransferRequest | 
        try {
            TransferResponse result = apiInstance.transferCreatePost(transferRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#transferCreatePost");
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
| **transferRequest** | [**TransferRequest**](TransferRequest.md)|  | |

### Return type

[**TransferResponse**](TransferResponse.md)

### Authorization

[authorization](../README.md#authorization), [idToken](../README.md#idToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | transfer done successfully |  -  |
| **400** | error in request processing |  -  |
| **401** | Header id_token with JWT invalid or absent |  -  |

