

# AccountHolderOnlineRegisterRequest

Start register new account holder request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productCode** | **String** | Product Code to subscribe to |  |
|**sellerReference** | **String** | Agorapay holder reference |  [optional] |
|**externalReference** | **String** | External holder reference |  |
|**naFCode** | **String** | NAF Code |  |
|**vaTCode** | **String** | VAT Code |  |
|**socialReason** | **String** | Holder name |  |
|**companyName** | **String** | Commercial name |  [optional] |
|**currency** | **String** | Currency code in 3 characters ISO format |  |
|**country** | **String** | The ISO country code in 2 characters format |  |
|**legalForm** | **String** | Legal form |  |
|**registrationNumber** | **String** | Identification number for entity. For example, SIRET for France |  |
|**masterAddress** | [**RegisterAddress2**](RegisterAddress2.md) |  |  |
|**commercialAddress** | [**RegisterAddress2**](RegisterAddress2.md) |  |  [optional] |
|**turnover** | **String** | Current or last year turnover in account currency code unit |  |
|**regulatedSociety** | [**RegulatedSocietyEnum**](#RegulatedSocietyEnum) | Y or N |  |
|**physicalPersons** | [**List&lt;OnlineRegisterPersonRequest&gt;**](OnlineRegisterPersonRequest.md) | At least one person must be provided with CP role |  |
|**account** | [**RegisterAccount2**](RegisterAccount2.md) |  |  |
|**owner** | [**AccountHolderOnlineRegisterRequestOwner**](AccountHolderOnlineRegisterRequestOwner.md) |  |  |



## Enum: RegulatedSocietyEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



