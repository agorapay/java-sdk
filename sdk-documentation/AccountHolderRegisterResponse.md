

# AccountHolderRegisterResponse

Start register new account holder response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resultCode** | **String** | API operation result. This code is 0 in case of success. If resultCode is not 0, the operation fails. In this case, a resultCodeMessage describe the reason of failure. resultCodeMessage can be absent if no reason is provided for the resultCode. |  |
|**resultCodeMessage** | **String** | The failure description. The message can be used to understand the failure reason. It must be transmitted to support for diagnostic. |  [optional] |
|**requestId** | **String** | Id used for futher update function call |  [optional] |
|**accountNumber** | **String** | A string representing the account number. |  [optional] |
|**paymentMethodAlias** | **String** | Alias identifying a previously registered payment method. |  [optional] |
|**requirements** | [**List&lt;RequirementResponseDetail&gt;**](RequirementResponseDetail.md) |  |  [optional] |
|**physicalPersons** | [**List&lt;RegisterPersonResponseDetail&gt;**](RegisterPersonResponseDetail.md) |  |  [optional] |
|**status** | **String** | Document status- Missing - Incomplete - To validate - Validated - To sign - Forced - To read - To screen - Supervise  |  [optional] |



