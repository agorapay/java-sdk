

# RefundRequest

Refund request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | Order id obtained in order creation |  |
|**transactionAmount** | [**Amount**](Amount.md) |  |  |
|**transactionId** | **String** | Id of the payment transaction. |  [optional] |
|**metaData** | **Map&lt;String, Object&gt;** | JSON data for the marketplace. This data is not used by payment systems. |  [optional] |
|**reason** | **String** | Operation label transmitted in payment system. Maximum length of 140 characters. |  [optional] |
|**breakdownList** | [**List&lt;Breakdown&gt;**](Breakdown.md) |  |  [optional] |
|**orderReference** | **String** | Marketplace reference for this order. Characters authorized are: a to z, A to Z, 0 to 9 and - / . + : and space |  |
|**payer** | [**PayerSimple**](PayerSimple.md) |  |  |



