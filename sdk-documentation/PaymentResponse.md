

# PaymentResponse

Payment response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | Order id obtained in order creation |  [optional] |
|**orderStatus** | **String** | Status of an order. the following status can be provided: - created: The order is created - pending_payment: Payment in progress - complete: Payment is completed - partial_complete: Payment is completed but all order amount is not payed - canceled: The order is canceled |  [optional] |
|**transactionId** | **String** | Id of the payment transaction. |  [optional] |
|**transactionStatus** | **String** | Status of a transaction. The following value may be provided: - created: The transaction is just created. No payment is already made. - in_progress: Payment is in progress - accepted: Payment is accepted - adjusted: Payment having amount been adjusted - completed: Payment confirmation is received - canceled: Payment is canceled - refused: Payment is refused - abandonned: Payment is not performed - refund: Transction is refunded |  [optional] |
|**resultCode** | **String** | API operation result. This code is 0 in case of success. If resultCode is not 0, the operation fails. In this case, a resultCodeMessage describe the reason of failure. resultCodeMessage can be absent if no reason is provided for the resultCode. |  |
|**virtualIban** | **String** | Iban to make payment to for SCT or SWIFT method |  [optional] |
|**redirectUrl** | **String** | Url to redirect the customer to continue the payment flow with an external partner. The marketplace must redirect its customer to this url to continue the payment process |  [optional] |
|**reference** | **String** | Mandate reference |  [optional] |
|**resultCodeMessage** | **String** | The failure description. The message can be used to understand the failure reason. It must be transmitted to support for diagnostic. |  [optional] |
|**redirectInd** | **String** | 1 if user must be redirect to the redirectUrl site |  [optional] |



