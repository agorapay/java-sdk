

# OrderDetailsResponse

Details of an order

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderAmount** | [**Amount**](Amount.md) |  |  [optional] |
|**orderRemainingAmount** | [**Amount**](Amount.md) |  |  [optional] |
|**orderId** | **String** | Order id obtained in order creation |  [optional] |
|**resultCode** | **String** | API operation result. This code is 0 in case of success. If resultCode is not 0, the operation fails. In this case, a resultCodeMessage describe the reason of failure. resultCodeMessage can be absent if no reason is provided for the resultCode. |  |
|**resultCodeMessage** | **String** | The failure description. The message can be used to understand the failure reason. It must be transmitted to support for diagnostic. |  [optional] |
|**orderStatus** | **String** | Status of an order. the following status can be provided: - created: The order is created - pending_payment: Payment in progress - complete: Payment is completed - partial_complete: Payment is completed but all order amount is not payed - canceled: The order is canceled |  [optional] |
|**transactionList** | [**List&lt;Transaction&gt;**](Transaction.md) | List of transaction for the order |  [optional] |



