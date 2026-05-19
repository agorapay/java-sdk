

# PaymentMethodGetIBANResponse

IBAN Payment method response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resultCode** | **String** | API operation result. This code is 0 in case of success. If resultCode is not 0, the operation fails. In this case, a resultCodeMessage describe the reason of failure. resultCodeMessage can be absent if no reason is provided for the resultCode. |  |
|**holder** | **String** | Thirdparty name |  [optional] |
|**bic** | **String** | Business Identifier Code allocated to a financial institution by the ISO 9362 Registration Authority, composed by 4 alphanumerics for the business party prefix, 2 alphabetics for the country code as defined in ISO 3166-1, 2 alphanumerics for the business party suffix and 3 optional alphanumerics for the branch designation |  [optional] |
|**iban** | **String** | International Bank Account Number |  [optional] |
|**resultCodeMessage** | **String** | The failure description. The message can be used to understand the failure reason. It must be transmitted to support for diagnostic. |  [optional] |



