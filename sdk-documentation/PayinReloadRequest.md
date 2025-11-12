

# PayinReloadRequest

Data in input of payin reload request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountNumber** | **String** | A string representing the account number. |  |
|**paymentMethodAlias** | **String** | Alias identifying a previously registered payment method. |  |
|**reason** | **String** | Reason of the actual reload |  [optional] |
|**endToEndId** | **String** | Use to identify transaction in SEPA transfer. Autorized characters are alpha numeric, - and /.  Characters / and space are authorized but not in first and last position. Also, two // are not allowed. |  [optional] |
|**amount** | **String** | Recharge amount |  |
|**currency** | **String** | Currency code in 3 characters ISO format |  |
|**sequence** | [**SequenceEnum**](#SequenceEnum) | 2 options:  - RCUR for use of recurrent mandate - FNAL for last use of recurrent mandate |  |
|**reference** | **String** | Mandate reference |  |



## Enum: SequenceEnum

| Name | Value |
|---- | -----|
| RCUR | &quot;RCUR&quot; |
| FNAL | &quot;FNAL&quot; |



