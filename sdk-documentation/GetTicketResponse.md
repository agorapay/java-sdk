

# GetTicketResponse

getTicket Response. If format is P, only fields resultCode, transactionId and fileContent are present

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resultCode** | **String** | API operation result. This code is 0 in case of success. If resultCode is not 0, the operation fails. In this case, a resultCodeMessage describe the reason of failure. resultCodeMessage can be absent if no reason is provided for the resultCode. |  [optional] |
|**resultCodeMessage** | **String** | The failure description. The message can be used to understand the failure reason. It must be transmitted to support for diagnostic. |  [optional] |
|**transactionId** | **String** | Id of the payment transaction. |  [optional] |
|**name** | **String** |  |  [optional] |
|**brand** | **String** |  |  [optional] |
|**maskedPan** | **String** | Hidden card number |  [optional] |
|**transactionStatus** | **String** | Status of a transaction. The following value may be provided: - created: The transaction is just created. No payment is already made. - in_progress: Payment is in progress - accepted: Payment is accepted - adjusted: Payment having amount been adjusted - completed: Payment confirmation is received - canceled: Payment is canceled - refused: Payment is refused - abandonned: Payment is not performed - refund: Transction is refunded |  [optional] |
|**operationDate** | **String** | Date of the operation. The format must be YYYYMMDD |  [optional] |
|**operationTime** | **String** | Operation time in HH:MM:SS format |  [optional] |
|**safe** | **String** | Y if 3DS is verified |  [optional] |
|**type** | **String** | 1: DEBIT, 2: CREDIT |  [optional] |
|**authNumber** | **String** |  |  [optional] |
|**transNumber** | **String** | Transaction number in PSP |  [optional] |
|**amount** | [**Amount**](Amount.md) |  |  [optional] |
|**mode** | **String** | PROD or TEST |  [optional] |
|**fileContent** | **String** | PDF file content base64 encoded, if format is P |  [optional] |
|**contract** | **String** | Payment partner contract number |  [optional] |



