

# MandateCreateResponse

New direct debit mandate generation response. If ok, either reference (UMR) or mandateId (withour UMR) should be present

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resultCode** | **String** | API operation result. This code is 0 in case of success. If resultCode is not 0, the operation fails. In this case, a resultCodeMessage describe the reason of failure. resultCodeMessage can be absent if no reason is provided for the resultCode. |  |
|**resultCodeMessage** | **String** | The failure description. The message can be used to understand the failure reason. It must be transmitted to support for diagnostic. |  [optional] |
|**reference** | **String** | Mandate reference |  [optional] |
|**redirectUrl** | **String** | Url to redirect the customer to continue the payment flow with an external partner. The marketplace must redirect its customer to this url to continue the payment process |  [optional] |
|**redirectInd** | **String** | 1 if user must be redirect to the redirectUrl site |  [optional] |
|**mandateId** | **String** | Mandate identifier, should be present if the Unique Mandate Reference (UMR) is not set yet (field reference is absent) |  [optional] |



