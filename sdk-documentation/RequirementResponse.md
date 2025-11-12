

# RequirementResponse

Document requirement for registration in response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Requirement identification number |  |
|**label** | **String** | Requirement description |  [optional] |
|**code** | **String** | Requirement code identification |  [optional] |
|**fileExt** | **String** | Type of form file provided (JPEG, JPG, PNG, PDF, DOC) |  [optional] |
|**fileContent** | **String** | Content of the form document base64 encoded |  [optional] |
|**fileType** | **String** | Type of document (BANK_ID, COMPANY_REG, ...) |  [optional] |
|**mandatory** | **String** | Y or N. May be absent if N |  [optional] |
|**status** | **String** | Document status- Missing - Incomplete - To validate - Validated - To sign - Forced - To read - To screen - Supervise  |  [optional] |



