

# PaymentRequest

Payment request. if orderId is not provided, the following fields are mandatory : - orderReference - orderCountryCode - payer  if orderId is present, it must be obtain from previous call to paymentMethods

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transPaymentMethod** | [**PaymentMethodSimple**](PaymentMethodSimple.md) |  |  [optional] |
|**orderId** | **String** | Order id obtained in order creation |  [optional] |
|**orderReference** | **String** | Marketplace reference for this order. Characters authorized are: a to z, A to Z, 0 to 9 and - / . + : and space |  [optional] |
|**orderCountryCode** | **String** | The ISO country code in 3 characters format |  [optional] |
|**breakdownList** | [**List&lt;Breakdown&gt;**](Breakdown.md) | List of breakdown for this payment |  [optional] |
|**alias** | [**AliasOption**](AliasOption.md) |  |  [optional] |
|**metaData** | **Map&lt;String, Object&gt;** | JSON data for the marketplace. This data is not used by payment systems. |  [optional] |
|**payer** | [**Payer**](Payer.md) |  |  [optional] |
|**details** | [**Details**](Details.md) |  |  [optional] |
|**capture** | **Capture** |  |  [optional] |
|**transactionAmount** | [**Amount**](Amount.md) |  |  |
|**urlRedirect** | **String** | Url where the customer must be redirected at the end of the payment with the partner. This URL is completed by /success, /error or /cancel according to the partner response status. When the customer will be redirected to the marketPlace at the end of the partner payment process, the paymentDetails function must be called to terminate payment with the data transmitted by the partner. For development purpose, you can use http://127.0.0.1 (localhost is not supported) |  |
|**registerAlias** | **RegisterAlias** |  |  [optional] |
|**reason** | **String** | Operation label transmitted in payment system. Maximum length of 140 characters. |  [optional] |
|**endToEndId** | **String** | Use to identify transaction in SEPA transfer. Autorized characters are alpha numeric, - and /.  Characters / and space are authorized but not in first and last position. Also, two // are not allowed. |  [optional] |
|**cart** | [**Cart**](Cart.md) |  |  [optional] |
|**operationDate** | **String** | Date of the operation. The format must be YYYYMMDD |  [optional] |
|**cbChallenge** | **CbChallenge** |  |  [optional] |
|**paymentOptions** | **PaymentOptions** |  |  [optional] |
|**instantPayment** | [**InstantPaymentEnum**](#InstantPaymentEnum) | The only purpose of this flag is to force Instant Payment for SCT. |  [optional] |
|**unsignificantAmount** | **UnsignificantAmount** |  |  [optional] |



## Enum: InstantPaymentEnum

| Name | Value |
|---- | -----|
| EXPECTED | &quot;EXPECTED&quot; |



