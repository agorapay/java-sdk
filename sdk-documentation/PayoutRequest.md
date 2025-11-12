

# PayoutRequest

Payout request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endToEndId** | **String** | Use to identify transaction in SEPA transfer. Autorized characters are alpha numeric, - and /.  Characters / and space are authorized but not in first and last position. Also, two // are not allowed. |  [optional] |
|**payoutAmount** | [**Amount**](Amount.md) |  |  |
|**paymentMethodAlias** | **String** | Alias identifying a previously registered payment method. |  |
|**accountNumber** | **String** | A string representing the account number. |  |
|**commission** | [**Commission**](Commission.md) |  |  [optional] |
|**metaData** | **Map&lt;String, Object&gt;** | JSON data for the marketplace. This data is not used by payment systems. |  [optional] |
|**reason** | **String** | Operation label transmitted in payment system. Maximum length of 140 characters. |  [optional] |



