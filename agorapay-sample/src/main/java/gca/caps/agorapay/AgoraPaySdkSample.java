package gca.caps.agorapay;

import com.agorapay.AgoraPayClient;
import com.agorapay.client.ApiException;
import com.agorapay.client.api.DefaultApi;
import com.agorapay.client.model.AccountHolderRegisterRequest;
import com.agorapay.client.model.AccountHolderRegisterRequest.RegulatedSocietyEnum;
import com.agorapay.client.model.AccountHolderRegisterRequestOwner;
import com.agorapay.client.model.AccountHolderRegisterRequestOwner.GenderEnum;
import com.agorapay.client.model.Amount;
import com.agorapay.client.model.Breakdown;
import com.agorapay.client.model.Capture;
import com.agorapay.client.model.Gender;
import com.agorapay.client.model.GetTicketResponse;
import com.agorapay.client.model.Payer;
import com.agorapay.client.model.PaymentMethod;
import com.agorapay.client.model.PaymentMethodSimple;
import com.agorapay.client.model.PaymentMethodsRequest;
import com.agorapay.client.model.PaymentMethodsResponse;
import com.agorapay.client.model.PaymentRequest;
import com.agorapay.client.model.PaymentResponse;
import com.agorapay.client.model.RegisterAccount;
import com.agorapay.client.model.RegisterAddress;
import com.agorapay.client.model.RegisterPersonRequest;
import com.agorapay.client.model.RegisterPersonRequestRolesInner;
import com.agorapay.client.model.RegisterPersonRequestRolesInner.RoleEnum;
import org.apache.hc.client5.http.utils.Base64;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class AgoraPaySdkSample {

    private static DefaultApi apiInstance = null;

	// URL du serveur AgoraPay, ClientId et ClientSecret
	private static final String SERVER_URL = "https://api.test.agorapay.com";
	private static final String CLIENT_ID = "__VOTRE_CLIENT_ID__";
	private static final String CLIENT_SECRET = "__VOTRE_CLIENT_SECRET__";

    public static void main(String[] args) throws ApiException {

        // Configuration du client http
        var defaultClient = AgoraPayClient.getAutoLoginApiClient(SERVER_URL, CLIENT_ID, CLIENT_SECRET);

        // Chemin racine des API AgoraPay
        defaultClient.setBasePath(SERVER_URL + "/mkp/v1");

        // Création de l'instance du client AgoraPay
        apiInstance = new DefaultApi(defaultClient);

		// Exemples d'appels d'API (décommenter pour tester)
        // Exemple d'initialisation d'un paiement
        testPayment();

        // Exemple d'appel du ticket de paiement
        testTicket();

		// Exemple d'enregistrement d'un client
		testRegisterPersonRequest();
    }

    // Initialisation d'un paiement
    public static void testPayment() throws ApiException {
        String reference = "referenced813dac30d37";
        String countryCode = "FRA";
        Payer payer = new Payer().reference("0cf269ed/80b9/48b1/a");
        Amount amount = new Amount().value("50.00").currency("EUR");

        // 1 - Appel de l'API "payinPaymentMethods" pour récupérer la liste des moyens de paiement disponibles
        // 1.1 - Construction des paramètres de requete
        PaymentMethodsRequest paymentMethodsRequest = new PaymentMethodsRequest();
        paymentMethodsRequest
                .orderReference(reference)
                .orderCountryCode(countryCode)
                .payer(payer)
                .amount(amount);

        // 1.2 - Appel de l'API
        PaymentMethodsResponse paymentMethodsResponse = apiInstance.payinPaymentMethodsPost(paymentMethodsRequest);
        // 1.3 - Filtrage des méthodes pour ne conserver que le paiement par carte
        PaymentMethod paymentMethod = paymentMethodsResponse.getPaymentMethodList().stream().filter((method)->method.getLabel().equals("Carte")).collect(Collectors.toList()).get(0);

        // 2 - Appel de l'API "Payment" pour effectuer un paiement
        // 2.1 - Construction des paramètres de requete
        PaymentMethodSimple paymentMethodSimple = new PaymentMethodSimple()
                .id(paymentMethod.getId());
        Breakdown breakdown = new Breakdown()
                .label("FXNH1GOQDT")
                .sellerAccountNumber("1737800000EUR1021111")
                .amount(amount);
        PaymentRequest requestBody = new PaymentRequest()
                .orderReference(reference)
                .orderReference(countryCode)
                .urlRedirect("http://127.0.0.1/")
                .capture(Capture._1)
                .transactionAmount(amount)
                .payer(payer)
                .transPaymentMethod(paymentMethodSimple)
                .addBreakdownListItem(breakdown)
                .orderCountryCode("FRA");

        // 2.2 - Appel de l'API
        PaymentResponse response = apiInstance.payinPaymentPost(requestBody);

        System.out.println(response);
    }

	public static void testRegisterPersonRequest() throws ApiException {

		var person = new RegisterPersonRequest()
				.firstName("prenom")
				.lastName("nom")
				.gender(Gender.M)
				.birthDate(LocalDate.of(1990, 1, 1))
				.email("noml.prenom@mail.com")
				.phoneNumber("+33612345678")
				.addRolesItem(new RegisterPersonRequestRolesInner().role(RoleEnum.CP));

		var account = new RegisterAccount()
				.country("FRA")
				.currency("EUR")
				.floorLimit("1000.00")
				.iban("FR7630003031000002000221295");

		var address = new RegisterAddress()
				.address("1 RUE DE LA PAIX")
				.country("FRA")
				.city("PARIS")
				.postalCode("75001");

		var owner = new AccountHolderRegisterRequestOwner()
				.firstName("prenom")
				.lastName("nom")
				.gender(GenderEnum.M)
				.address("1 RUE DE LA PAIX")
				.city("PARIS")
				.postalCode("75001")
				.country("FRA");

		var accountHolderRequest = new AccountHolderRegisterRequest()
				.country("FRA")
				.companyName("Test")
				.currency("EUR")
				.addPhysicalPersonsItem(person)
				.account(account)
				.legalForm("SARL")
				.masterAddress(address)
				.owner(owner)
				.registrationNumber("123456789")
				.regulatedSociety(RegulatedSocietyEnum.Y)
				.socialReason("Test")
				.turnover("1000.00")
				;

		apiInstance.accountHolderRegisterPost(accountHolderRequest);
	}

	public static void testTicket() throws ApiException {
        GetTicketResponse ticketResponse = apiInstance.payinTicketGet("918222", "P", "M", "Test AgoraPay");
        byte[] data = Base64.decodeBase64(ticketResponse.getFileContent());
        try (OutputStream stream = new FileOutputStream("ticket.pdf")) {
            stream.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
