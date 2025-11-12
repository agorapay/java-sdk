

# PaymentAccountSetIBANRequest

Start the change IBAN process request Upload must be done in multipart/form-data mime type. One part must be a valid JSON with required fields in content-disposition named 'json'. Second part must be the file base64 encoded in content-disposition named 'file'. fileExt is defined in content-type of file part.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountNumber** | **String** | A string representing the account number. |  [optional] |
|**firstName** | **String** | The first name of the IBAN account&#39;s owner |  [optional] |
|**lastName** | **String** | The last name of the IBAN account&#39;s owner |  [optional] |
|**socialReason** | **String** | The name of the IBAN account&#39;s owner if compagny |  [optional] |
|**address** | **String** | The road name and number of the IBAN account&#39;s owner |  |
|**city** | **String** | The city of the IBAN account&#39;s owner |  |
|**postalCode** | **String** | The postal code of the IBAN account&#39;s owner |  |
|**country** | **String** | The country code (in 3 letter format) of the IBAN account&#39;s owner |  |
|**iban** | **String** | The new IBAN |  |
|**currency** | **String** | Currency code in 3 characters ISO format |  |
|**paymentMethodAlias** | **String** | Current payment method alias to update. If not provided a new payment method is added. |  [optional] |
|**paymentMethodKey** | [**PaymentMethodKeyEnum**](#PaymentMethodKeyEnum) | Type of payment method - SCT - SCT INST |  [optional] |



## Enum: PaymentMethodKeyEnum

| Name | Value |
|---- | -----|
| SCT | &quot;SCT&quot; |
| SCT_INST | &quot;SCT INST&quot; |



