

# CaptureRequest

The minimal set of properties required to perform a capture

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | Order id obtained in order creation |  |
|**transactionAmount** | [**Amount**](Amount.md) |  |  |
|**metaData** | **Map&lt;String, Object&gt;** | JSON data for the marketplace. This data is not used by payment systems. |  [optional] |
|**breakdownList** | [**List&lt;Breakdown&gt;**](Breakdown.md) |  |  [optional] |
|**transactionId** | **String** | Id of the payment transaction. |  [optional] |



