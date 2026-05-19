

# Operation

Operation information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | [**Amount**](Amount.md) |  |  |
|**date** | **String** | operation Date  |  [optional] |
|**side** | **OperationSide** |  |  |
|**type** | **String** | Type of the operation - 1: Purchase - 2: Refund - 3: Manual - 4: Transfer - 5: Payment - 6: Reload/Payout - 7: Authorization - 8: Pre-authorization - 9: Unpaid - 11: Fees |  |
|**status** | **String** | Status of the operation - registered: operation is registered - waiting: operation is waiting for funds - cashed: funds are received - cancelled: operation is canceled - suspended: operation is temporay suspended - rejected: operation is rejeted by peer |  |
|**breakdownList** | [**List&lt;BreakdownSimple&gt;**](BreakdownSimple.md) | List of breakdown |  [optional] |
|**metaData** | **Map&lt;String, Object&gt;** | JSON data for the marketplace. This data is not used by payment systems. |  [optional] |
|**transactionId** | **String** | Reference for the operation |  |
|**creationDateTime** | **String** | ISO 8601 format (ex: 20210325T082300+01:00) |  [optional] |
|**accountNumber** | **String** | A string representing the account number. |  [optional] |
|**cashedCumulAmount** | **String** | Amount already cached |  [optional] |
|**orderReference** | **String** | Marketplace reference for this order. Characters authorized are: a to z, A to Z, 0 to 9 and - / . + : and space |  [optional] |
|**accountCurrencyCode** | **String** | Currency code in 3 characters ISO format |  [optional] |
|**operationLabel** | **String** | Label of the operation |  [optional] |
|**relatedMsgStatusLabel** | **String** | Status explanation |  [optional] |
|**thirdPartyName** | **String** |  |  [optional] |
|**accountType** | **String** | Type of account - 1: principal - 2: collection - 3: waiting - 4: suspense - 5: change - 6: commission - 7: collect - 8: cantonment - 9: technical - 10: reconciliation - 11: cancel - 12: freeze - 13: voucher - 14: reliquat - 15: autorization - 16: pre-autorization - 17: counter autorization - 18: counter pre-autorization - 19: waiting refund - 20: disbursement - 21: tva - 22: hit |  [optional] |
|**accountCptNumber** | **String** | A string representing the account number. |  [optional] |
|**accountCptTypeLabel** | **String** | Type of account - 1: principal - 2: collection - 3: waiting - 4: suspense - 5: change - 6: commission - 7: collect - 8: cantonment - 9: technical - 10: reconciliation - 11: cancel - 12: freeze - 13: voucher - 14: reliquat - 15: autorization - 16: pre-autorization - 17: counter autorization - 18: counter pre-autorization - 19: waiting refund - 20: disbursement - 21: tva - 22: hit |  [optional] |
|**accountCptCurrencyCode** | **String** | Currency code in 3 characters ISO format |  [optional] |
|**thirdPartyCptName** | **String** |  |  [optional] |
|**paymentMethodKey** | **PaymentMethodKey** |  |  [optional] |
|**internalRemittance** | **String** | Internal Remittance information |  [optional] |
|**iban** | **String** | International Bank Account Number |  [optional] |
|**bic** | **String** | Business Identifier Code allocated to a financial institution by the ISO 9362 Registration Authority, composed by 4 alphanumerics for the business party prefix, 2 alphabetics for the country code as defined in ISO 3166-1, 2 alphanumerics for the business party suffix and 3 optional alphanumerics for the branch designation |  [optional] |
|**payerRef** | **String** |  |  [optional] |
|**endToEndId** | **String** | Use to identify transaction in SEPA transfer. Autorized characters are alpha numeric, - and /.  Characters / and space are authorized but not in first and last position. Also, two // are not allowed. |  [optional] |
|**remittanceInformation** | **String** |  |  [optional] |



