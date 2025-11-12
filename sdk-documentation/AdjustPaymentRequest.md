

# AdjustPaymentRequest

The request to change the amount or submit a new breakdown list

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**breakdownList** | [**List&lt;Breakdown&gt;**](Breakdown.md) | List of breakdown |  [optional] |
|**metaData** | **Map&lt;String, Object&gt;** | JSON data for the marketplace. This data is not used by payment systems. |  [optional] |
|**adjustAmount** | [**AdjustAmount**](AdjustAmount.md) |  |  [optional] |
|**orderId** | **String** | Order id obtained in order creation |  [optional] |
|**transactionId** | **String** | Id of the payment transaction. |  [optional] |



