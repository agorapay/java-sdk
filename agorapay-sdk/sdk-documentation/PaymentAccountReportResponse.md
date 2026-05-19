

# PaymentAccountReportResponse

Get report response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resultCode** | **String** | API operation result. This code is 0 in case of success. If resultCode is not 0, the operation fails. In this case, a resultCodeMessage describe the reason of failure. resultCodeMessage can be absent if no reason is provided for the resultCode. |  [optional] |
|**resultCodeMessage** | **String** | The failure description. The message can be used to understand the failure reason. It must be transmitted to support for diagnostic. |  [optional] |
|**type** | **String** | Type of the report |  [optional] |
|**accountNumber** | **String** | Account number |  [optional] |
|**year** | **String** | Year of the report |  [optional] |
|**month** | **String** | Month of the report |  [optional] |
|**fileContent** | **String** | Content of the report in base64 |  [optional] |



