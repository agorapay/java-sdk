

# PaymentAccountCreditResponse

Payment account credit response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resultCode** | **String** | API operation result. This code is 0 in case of success. If resultCode is not 0, the operation fails. In this case, a resultCodeMessage describe the reason of failure. resultCodeMessage can be absent if no reason is provided for the resultCode. |  |
|**resultCodeMessage** | **String** | The failure description. The message can be used to understand the failure reason. It must be transmitted to support for diagnostic. |  [optional] |
|**transactionId** | **String** | Id of the payment transaction. |  [optional] |
|**virtualIban** | **String** | Iban to make payment to for SCT or SWIFT method |  [optional] |



