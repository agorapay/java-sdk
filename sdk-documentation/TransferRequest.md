

# TransferRequest

Transfer Resquest

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountCptNumber** | **String** | A string representing the account number. |  |
|**transferAmount** | [**Amount**](Amount.md) |  |  |
|**accountNumber** | **String** | A string representing the account number. |  |
|**orderRef** | **String** | Marketplace reference for this order. Characters authorized are: a to z, A to Z, 0 to 9 and - / . + : and space |  [optional] |
|**metaData** | **Map&lt;String, Object&gt;** | JSON data for the marketplace. This data is not used by payment systems. |  [optional] |
|**reason** | **String** | Operation label transmitted in payment system. Maximum length of 140 characters. |  |



