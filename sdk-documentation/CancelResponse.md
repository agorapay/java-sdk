

# CancelResponse

Cancel response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resultCode** | **String** | API operation result. This code is 0 in case of success. If resultCode is not 0, the operation fails. In this case, a resultCodeMessage describe the reason of failure. resultCodeMessage can be absent if no reason is provided for the resultCode. |  |
|**orderStatus** | **String** | Status of an order. the following status can be provided: - created: The order is created - pending_payment: Payment in progress - complete: Payment is completed - partial_complete: Payment is completed but all order amount is not payed - canceled: The order is canceled |  [optional] |
|**transactionList** | [**List&lt;Transaction&gt;**](Transaction.md) | List of transaction for the order |  [optional] |
|**transactionId** | **String** | Id of the payment transaction. |  [optional] |
|**resultCodeMessage** | **String** | The failure description. The message can be used to understand the failure reason. It must be transmitted to support for diagnostic. |  [optional] |



