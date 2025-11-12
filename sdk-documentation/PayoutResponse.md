

# PayoutResponse

Payout response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resultCode** | **String** | API operation result. This code is 0 in case of success. If resultCode is not 0, the operation fails. In this case, a resultCodeMessage describe the reason of failure. resultCodeMessage can be absent if no reason is provided for the resultCode. |  |
|**resultCodeMessage** | **String** | The failure description. The message can be used to understand the failure reason. It must be transmitted to support for diagnostic. |  [optional] |
|**transactionId** | **String** | Id of the payment transaction. |  [optional] |
|**transactionStatus** | **String** | Status of a transaction. The following value may be provided: - created: The transaction is just created. No payment is already made. - in_progress: Payment is in progress - accepted: Payment is accepted - adjusted: Payment having amount been adjusted - completed: Payment confirmation is received - canceled: Payment is canceled - refused: Payment is refused - abandonned: Payment is not performed - refund: Transction is refunded |  [optional] |



