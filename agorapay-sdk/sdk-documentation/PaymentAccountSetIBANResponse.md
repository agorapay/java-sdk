

# PaymentAccountSetIBANResponse

Start change IBAN process response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resultCode** | **String** | API operation result. This code is 0 in case of success. If resultCode is not 0, the operation fails. In this case, a resultCodeMessage describe the reason of failure. resultCodeMessage can be absent if no reason is provided for the resultCode. |  [optional] |
|**resultCodeMessage** | **String** | The failure description. The message can be used to understand the failure reason. It must be transmitted to support for diagnostic. |  [optional] |
|**requestId** | **String** | ID to identify processing request |  [optional] |
|**paymentMethodAlias** | **String** | Alias identifying a previously registered payment method. |  [optional] |



