

# AccountHolderRegisterRequest

Start register new account holder request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productCode** | **String** | Product Code to subscribe to |  [optional] |
|**naFCode** | **String** | NAF Code |  [optional] |
|**socialReason** | **String** | Holder name |  |
|**companyName** | **String** | Commercial name |  [optional] |
|**currency** | **String** | Currency code in 3 characters ISO format |  |
|**country** | **String** | The ISO country code in 3 characters format |  |
|**legalForm** | **String** |  |  |
|**registrationNumber** | **String** | Identification number for entity. For example, SIRET for France |  |
|**masterAddress** | [**RegisterAddress**](RegisterAddress.md) |  |  |
|**commercialAddress** | [**RegisterAddress**](RegisterAddress.md) |  |  [optional] |
|**turnover** | **String** | Current or last year turnover in account currency code unit |  |
|**regulatedSociety** | [**RegulatedSocietyEnum**](#RegulatedSocietyEnum) | Y or N |  |
|**physicalPersons** | [**List&lt;RegisterPersonRequest&gt;**](RegisterPersonRequest.md) | At least one person must be provided with CP role |  |
|**account** | [**RegisterAccount**](RegisterAccount.md) |  |  |
|**owner** | [**AccountHolderRegisterRequestOwner**](AccountHolderRegisterRequestOwner.md) |  |  |
|**authorizedOverdraft** | **String** | Maximal amount of Short-Term Credit Facilities |  [optional] |



## Enum: RegulatedSocietyEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



