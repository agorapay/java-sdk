

# Transaction

Details of a transaction

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentMethodId** | **String** | id of the payment Method used for the transaction |  [optional] |
|**id** | **String** | Id of the payment transaction. |  |
|**status** | **String** | Status of a transaction. The following value may be provided: - created: The transaction is just created. No payment is already made. - in_progress: Payment is in progress - accepted: Payment is accepted - adjusted: Payment having amount been adjusted - completed: Payment confirmation is received - canceled: Payment is canceled - refused: Payment is refused - abandonned: Payment is not performed - refund: Transction is refunded |  |
|**amount** | [**Amount**](Amount.md) |  |  |
|**type** | **String** | Type of the operation - 1: Purchase - 2: Refund - 3: Manual - 4: Transfer - 5: Payment - 6: Reload/Payout - 7: Authorization - 8: Pre-authorization - 9: Unpaid - 11: Fees |  [optional] |



