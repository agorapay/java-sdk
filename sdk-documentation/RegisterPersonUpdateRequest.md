

# RegisterPersonUpdateRequest

Person information for register update

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Previous ID provided in register response of physical person to update. If absent, a new person is added. |  [optional] |
|**gender** | **Gender** |  |  |
|**firstName** | **String** |  |  |
|**lastName** | **String** |  |  |
|**email** | **String** |  |  [optional] |
|**phoneNumber** | **String** |  |  [optional] |
|**roles** | [**List&lt;RolesInner&gt;**](RolesInner.md) |  |  |
|**birthDate** | **LocalDate** | Date of birth in YYYYMMDD format |  [optional] |
|**physicalAddress** | [**PhysicalAddress**](PhysicalAddress.md) |  |  [optional] |



