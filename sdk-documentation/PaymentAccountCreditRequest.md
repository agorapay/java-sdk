

# PaymentAccountCreditRequest

Data in input of paymentAccount credit request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountNumber** | **String** | A string representing the account number. |  |
|**amount** | **String** | Recharge amount |  |
|**currency** | **String** | Currency code in 3 characters ISO format |  |
|**paymentMethodKey** | [**PaymentMethodKeyEnum**](#PaymentMethodKeyEnum) | Key identifier of the payment method type id. The following method are available: - SCT: Sepa Credit Transfer |  |



## Enum: PaymentMethodKeyEnum

| Name | Value |
|---- | -----|
| SCT | &quot;SCT&quot; |



