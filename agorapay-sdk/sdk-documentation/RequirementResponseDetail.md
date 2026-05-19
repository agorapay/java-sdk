

# RequirementResponseDetail

Requirement for registration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Requirement identification number |  |
|**mandatory** | **String** | -Y if document must be provided -N if document is not mandatory. May be absent in this case. |  |
|**label** | **String** | Requirement description |  |
|**code** | **String** | Requirement code identification |  [optional] |
|**status** | **String** | Document status- Missing - Incomplete - To validate - Validated - To sign - Forced - To read - To screen - Supervise  |  [optional] |
|**fileExt** | **String** | Type of file provided in fileContent (PDF) |  [optional] |
|**fileContent** | **String** | Content of the document base64 encoded |  [optional] |
|**documents** | [**List&lt;RequirementResponseDetailDocument&gt;**](RequirementResponseDetailDocument.md) | List of documents |  [optional] |



