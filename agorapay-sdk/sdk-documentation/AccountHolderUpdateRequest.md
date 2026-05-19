

# AccountHolderUpdateRequest

Update holder registration request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**socialReason** | **String** | Holder name |  [optional] |
|**companyName** | **String** | Commercial name |  [optional] |
|**country** | **String** | The ISO country code in 3 characters format |  [optional] |
|**masterAddress** | [**RegisterAddress**](RegisterAddress.md) |  |  [optional] |
|**commercialAddress** | [**RegisterAddress**](RegisterAddress.md) |  |  [optional] |
|**turnover** | **String** | Current or last year turnover in account currency code unit |  [optional] |
|**regulatedSociety** | [**RegulatedSocietyEnum**](#RegulatedSocietyEnum) | Y or N |  [optional] |
|**physicalPersons** | [**List&lt;RegisterPersonUpdateRequest&gt;**](RegisterPersonUpdateRequest.md) | At least one person must be provided with CP role |  [optional] |
|**account** | [**RegisterAccount**](RegisterAccount.md) |  |  [optional] |
|**owner** | [**AccountHolderUpdateRequestOwner**](AccountHolderUpdateRequestOwner.md) |  |  [optional] |
|**currency** | **String** | Currency code in 3 characters ISO format |  [optional] |
|**requestId** | **String** | ID to identify processing request |  |



## Enum: RegulatedSocietyEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



