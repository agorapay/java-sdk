

# PaymentAccountPayautoRequest

Payout auto request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountNumber** | **String** | A string representing the account number. |  |
|**amount** | **String** | Recharge amount |  |
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) | 0: deactivate 1: once a day 2: once a week 3: once a month 10: automatic on threshold 11: On cashing |  |
|**dayOfWeek** | [**DayOfWeekEnum**](#DayOfWeekEnum) | Selected day of the week. Between 0 and 6 If frequency is set to 2, dayOfWeek is a mandatory field. 0: Sunday 1: Monday 2: Tuesday 3: Wednesday 4: Thursday 5: Friday 6: Saturday |  [optional] |
|**dayOfMonth** | [**DayOfMonthEnum**](#DayOfMonthEnum) | Selected day of the month. Between 1 and 31. If frequency is set to 3, dayOfMonth is a mandatory field |  [optional] |
|**paymentMethodAlias** | **String** | Alias identifying a previously registered payment method. |  |



## Enum: FrequencyEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _10 | &quot;10&quot; |
| _11 | &quot;11&quot; |



## Enum: DayOfWeekEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _6 | &quot;6&quot; |



## Enum: DayOfMonthEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _6 | &quot;6&quot; |
| _7 | &quot;7&quot; |
| _8 | &quot;8&quot; |
| _9 | &quot;9&quot; |
| _10 | &quot;10&quot; |
| _11 | &quot;11&quot; |
| _12 | &quot;12&quot; |
| _13 | &quot;13&quot; |
| _14 | &quot;14&quot; |
| _15 | &quot;15&quot; |
| _16 | &quot;16&quot; |
| _17 | &quot;17&quot; |
| _18 | &quot;18&quot; |
| _19 | &quot;19&quot; |
| _20 | &quot;20&quot; |
| _21 | &quot;21&quot; |
| _22 | &quot;22&quot; |
| _23 | &quot;23&quot; |
| _24 | &quot;24&quot; |
| _25 | &quot;25&quot; |
| _26 | &quot;26&quot; |
| _27 | &quot;27&quot; |
| _28 | &quot;28&quot; |
| _29 | &quot;29&quot; |
| _30 | &quot;30&quot; |
| _31 | &quot;31&quot; |



