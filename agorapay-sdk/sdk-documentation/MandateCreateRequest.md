

# MandateCreateRequest

Generate a new direct debit mandate without payment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transPaymentMethod** | [**PaymentMethodSimple**](PaymentMethodSimple.md) |  |  |
|**payer** | [**Payer**](Payer.md) |  |  |
|**details** | [**Details**](Details.md) |  |  |
|**urlRedirect** | **String** | Url where the customer must be redirected at the end of the payment with the partner. This URL is completed by /success, /error or /cancel according to the partner response status. When the customer will be redirected to the marketPlace at the end of the partner payment process, the paymentDetails function must be called to terminate payment with the data transmitted by the partner. For development purpose, you can use http://127.0.0.1 (localhost is not supported) |  [optional] |
|**otp** | [**OtpEnum**](#OtpEnum) | Force signature by OTP |  [optional] |



## Enum: OtpEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| Y | &quot;Y&quot; |



