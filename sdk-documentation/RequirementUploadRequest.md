

# RequirementUploadRequest

Upload document information for registration. Upload must be done in multipart/form-data mime type. One part must be a valid JSON with required fields in content-disposition named 'json'. Second part must be the file base64 encoded in content-disposition named 'file'. fileExt is defined in content-type of file part.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Requirement identification number |  |
|**fileExt** | [**FileExtEnum**](#FileExtEnum) | Type of file provided (JPEG, PNG, PDF, DOC, XLS, XLSX) This type is defined in content-type header of file part in multipart request. - image/jpeg: JPEG - image/png: PNG - application/pdf: PDF - application/msword: DOC - application/vnd.ms-excel: XLS - application/vnd.openxmlformats-officedocument.spreadsheetml.sheet: XLSX |  [optional] |
|**fileType** | [**FileTypeEnum**](#FileTypeEnum) | File type allowed based on requirement code. The following value are allowed : - INDIVIDUAL_IDENTIFICATION   - PASSPORT: Passeport   - IDCARD_FRONT_BACK: Identity document   - IDCARD_FRONT: Identity document   - IDCARD_BACK: Identity document   - PERMANENT_RES: Permanent residence permit - BUSINESS_IDENTIFICATION     - COMPANY_REG: Proof of registration - NONPROFIT_IDENTICIATION   - NONPROFIT_REG: Proof of existence of the association   - NONPROFIT_OJ: JOAFE publication - BUSINESS_ARTICLES     - COMPANY_ART: Final status - NONPROFIT_DIRECTORS     - REPORT_GEN_ASS: Minutes of last general assembly - BUSINESS_UBO   - UBO_REG: Register of beneficial owners filed with the registry - LEGAL_EXISTENCE   - SIRENE_REG: INSEE file less than 3 months old   - RECEIPT_APP: Receipt of prefecture   - SIRENE_NOT: Notice of situation - REGISTRATION_PROOF     - INDIVIDUAL_REG: Registration with the Trade and Companies Register or Trades and Crafts Register - ADDRESS_PROOF   - PROPERTY_TAX: Property tax less than a year old   - HOUSING_TAX: Housing tax less than a year old   - INVOICE: Energy or telephony supplier bill (less than 3 months old) - COOPERATIVE_APPROUVAL   - COOP_APP: Approval of the High Council of the agricultural cooperative (if agricultural cooperative) - SUBSCRIPTION_PROOF   - PROOF_REG: Proof of registration for SCs and SCPs - BUSINESS_IDENTIFICATION_WORLD   - COMPANY_REG_WORLD: Extract from the commercial register (original + translation)   - COMPANY_CER_WORLD: Certificate of legal validity of the company (original + translation) - BUSINESS_ARTICLES_WORLD   - COMPANY_ART_WORLD: Definitive statutes or equivalent (original + translation) - BUSINESS_UBO_WORLD   - UBO_REG_WORLD: Beneficial ownership declaration form (original + translation) - BANK_ID                 - BANK_ID: Bank Account Proof - OTHER_DOC   - OTHER_DOC: Additional supporting documents - ACCOUNT_AGR   - ACCOUNT_AGR: Account Agreement - QUESTIONNAIRE   - QUESTIONNAIRE: Country Questionnaire (FR) - SYNDICATE_IDENTIFICATION   - SYND_ID: Condominium summary sheet - REPORT_GENERAL_SYNDICATE   - REPORT_GEN_SYND: Minutes of the last Ordinary General Meeting of the condominium - ACTIVITY_PROOF :   - CPS_CARD   - RPPS_CARD   - DEGREE_CARD   - CPP_CARD CERTIFIED_STATUS:   - CERTIFIED_STATUS PROC_OR_MANDATE:   - PROCURATION   - MGR_MANDATE |  |



## Enum: FileExtEnum

| Name | Value |
|---- | -----|
| JPEG | &quot;JPEG&quot; |
| PNG | &quot;PNG&quot; |
| PDF | &quot;PDF&quot; |
| DOC | &quot;DOC&quot; |
| XLS | &quot;XLS&quot; |
| XLSX | &quot;XLSX&quot; |



## Enum: FileTypeEnum

| Name | Value |
|---- | -----|
| PASSPORT | &quot;PASSPORT&quot; |
| IDCARD_FRONT_BACK | &quot;IDCARD_FRONT_BACK&quot; |
| COMPANY_REG | &quot;COMPANY_REG&quot; |
| BANK_ID | &quot;BANK_ID&quot; |
| COMPANY_REG_WORLD | &quot;COMPANY_REG_WORLD&quot; |
| OTHER_DOC | &quot;OTHER_DOC&quot; |
| ACCOUNT_AGR | &quot;ACCOUNT_AGR&quot; |
| QUESTIONNAIRE | &quot;QUESTIONNAIRE&quot; |
| IDCARD_FRONT | &quot;IDCARD_FRONT&quot; |
| IDCARD_BACK | &quot;IDCARD_BACK&quot; |
| NONPROFIT_REG | &quot;NONPROFIT_REG&quot; |
| NONPROFIT_OJ | &quot;NONPROFIT_OJ&quot; |
| COMPANY_ART | &quot;COMPANY_ART&quot; |
| REPORT_GEN_ASS | &quot;REPORT_GEN_ASS&quot; |
| PERMANENT_RES | &quot;PERMANENT_RES&quot; |
| UBO_REG | &quot;UBO_REG&quot; |
| SIRENE_REG | &quot;SIRENE_REG&quot; |
| RECEIPT_APP | &quot;RECEIPT_APP&quot; |
| SIRENE_NOT | &quot;SIRENE_NOT&quot; |
| INDIVIDUAL_REG | &quot;INDIVIDUAL_REG&quot; |
| PROPERTY_TAX | &quot;PROPERTY_TAX&quot; |
| HOUSING_TAX | &quot;HOUSING_TAX&quot; |
| INVOICE | &quot;INVOICE&quot; |
| COOP_APP | &quot;COOP_APP&quot; |
| PROOF_REG | &quot;PROOF_REG&quot; |
| COMPANY_CER_WORLD | &quot;COMPANY_CER_WORLD&quot; |
| COMPANY_ART_WORLD | &quot;COMPANY_ART_WORLD&quot; |
| UBO_REG_WORLD | &quot;UBO_REG_WORLD&quot; |
| SYND_ID | &quot;SYND_ID&quot; |
| REPORT_GEN_SYND | &quot;REPORT_GEN_SYND&quot; |
| CPS_CARD | &quot;CPS_CARD&quot; |
| RPPS_CARD | &quot;RPPS_CARD&quot; |
| DEGREE_CARD | &quot;DEGREE_CARD&quot; |
| CPP_CARD | &quot;CPP_CARD&quot; |
| CERTIFIED_STATUS | &quot;CERTIFIED_STATUS&quot; |
| PROCURATION | &quot;PROCURATION&quot; |
| MGR_MANDATE | &quot;MGR_MANDATE&quot; |



