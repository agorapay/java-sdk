

# DetailsNoIban

Payment details information For some payment methods, additional details are needed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**address** | **String** | Road name and number |  [optional] |
|**city** | **String** |  |  [optional] |
|**postalCode** | **String** |  |  [optional] |
|**country** | **String** | Country in 3 letters ISO format |  [optional] |
|**email** | **String** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**gender** | **String** |  |  [optional] |
|**phoneNumber** | **String** |  |  [optional] |
|**sequence** | [**SequenceEnum**](#SequenceEnum) | For payment method with mandate, the sequence is  - FRST for first use of recurrent mandate - RCUR for use of recurrent mandate - FNAL for last use of recurrent mandate - OOFF for a mandate used only one time |  [optional] |
|**reference** | **String** | In case of a card recurring payment, put the transactionId of the initial payment.  As for SDD, it corresponds to the Unique Mandate Reference (UMR). For some use cases for SDD, where UMR is not intended at mandate generation, please set ‘NOK’ value to prevent the platform from generating default UMR |  [optional] |
|**socialReason** | **String** | Compagny name |  [optional] |
|**address2** | **String** | Additional address |  [optional] |
|**bic** | **String** | Business Identifier Code allocated to a financial institution by the ISO 9362 Registration Authority, composed by 4 alphanumerics for the business party prefix, 2 alphabetics for the country code as defined in ISO 3166-1, 2 alphanumerics for the business party suffix and 3 optional alphanumerics for the branch designation |  [optional] |



## Enum: SequenceEnum

| Name | Value |
|---- | -----|
| FRST | &quot;FRST&quot; |
| RCUR | &quot;RCUR&quot; |
| FNAL | &quot;FNAL&quot; |
| OOFF | &quot;OOFF&quot; |



