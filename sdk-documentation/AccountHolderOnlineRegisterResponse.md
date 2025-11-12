

# AccountHolderOnlineRegisterResponse

Start register new account holder response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resultCode** | **String** | API operation result. This code is 0 in case of success. If resultCode is not 0, the operation fails. In this case, a resultCodeMessage describe the reason of failure. resultCodeMessage can be absent if no reason is provided for the resultCode. |  |
|**resultCodeMessage** | **String** | The failure description. The message can be used to understand the failure reason. It must be transmitted to support for diagnostic. |  [optional] |
|**sellerReference** | **String** | Agorapay holder reference |  [optional] |
|**requestId** | **String** | Request identifier for the enrollment |  [optional] |
|**tokenId** | **String** | Id used for futher update function call |  [optional] |



