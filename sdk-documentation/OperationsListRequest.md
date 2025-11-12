

# OperationsListRequest

Criteria to list operation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pagination** | **String** | Number of lines in reporting. Limited to 50. |  [optional] |
|**startDate** | **LocalDate** | Begin date of operation reporting in YYYYMMDD format |  [optional] |
|**endDate** | **LocalDate** | ended Date of operation Reporting in YYYYMMDD format |  [optional] |
|**maxAmount** | **String** |  |  [optional] |
|**minAmount** | **String** |  |  [optional] |
|**offset** | **String** | Start response line. Set to 0 when not indicated |  [optional] |
|**orderReference** | **String** | Order reference. Characters authorized are: a to z, A to Z, 0 to 9 and - / . +  : _ and space |  [optional] |
|**currency** | **String** | Currency code in 3 characters ISO format |  [optional] |
|**transactionId** | **String** | Id of the payment transaction. |  [optional] |
|**paymentMethodKey** | **PaymentMethodKey** |  |  [optional] |
|**sellerAccountNumber** | **String** | Account number of the merchant or marketplace. |  [optional] |
|**parentAccountNumber** | **String** | A string representing the account number. |  [optional] |



