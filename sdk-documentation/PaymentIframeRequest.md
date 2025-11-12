

# PaymentIframeRequest

Payment with iFrame request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderReference** | **String** | Marketplace reference for this order. Characters authorized are: a to z, A to Z, 0 to 9 and - / . + : and space |  |
|**orderCountryCode** | **String** | The ISO country code in 3 characters format |  |
|**amount** | [**Amount**](Amount.md) |  |  |
|**breakdownList** | [**List&lt;Breakdown&gt;**](Breakdown.md) | breakdown list |  [optional] |
|**payer** | [**PayerSimple**](PayerSimple.md) |  |  |
|**capture** | **Capture** |  |  [optional] |
|**metaData** | **Map&lt;String, Object&gt;** | JSON data for the marketplace. This data is not used by payment systems. |  [optional] |
|**recurrent** | **Recurrent** |  |  [optional] |
|**endToEndId** | **String** | Use to identify transaction in SEPA transfer. Autorized characters are alpha numeric, - and /.  Characters / and space are authorized but not in first and last position. Also, two // are not allowed. |  [optional] |
|**paymentMethodId** | **String** | Identifier of the payment method. If given, the end-user will be redirected to the corresponding payment method iFrame. If not given, the end-user will be redirected to the payment method selection iFrame. |  [optional] |
|**urlRedirect** | **String** | Url where the customer must be redirected at the end of the payment with the partner. This URL is completed by /success, /error or /cancel according to the partner response status. When the customer will be redirected to the marketPlace at the end of the partner payment process, the paymentDetails function must be called to terminate payment with the data transmitted by the partner. For development purpose, you can use http://127.0.0.1 (localhost is not supported) |  [optional] |
|**cart** | [**Cart**](Cart.md) |  |  [optional] |
|**paymentAccount** | **String** |  |  [optional] |
|**cbChallenge** | **CbChallenge** |  |  [optional] |
|**details** | [**DetailsNoIban**](DetailsNoIban.md) |  |  [optional] |
|**page** | [**PageEnum**](#PageEnum) | Type of page to display. - iframe: integrated in marketplace site (default) - full: full page  |  [optional] |
|**paymentOptions** | **PaymentOptions** |  |  [optional] |
|**reason** | **String** | Operation label transmitted in payment system. Maximum length of 140 characters. |  [optional] |
|**registerAlias** | **RegisterAlias** |  |  [optional] |
|**alias** | [**AliasOption**](AliasOption.md) |  |  [optional] |
|**unsignificantAmount** | **UnsignificantAmount** |  |  [optional] |



## Enum: PageEnum

| Name | Value |
|---- | -----|
| FULL | &quot;full&quot; |
| IFRAME | &quot;iframe&quot; |



