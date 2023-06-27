import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	String codClient;
	String credential;
	String email;
	Date subscribe;

	public Client(String codCliente, String credential, String email, String subscribe) {
		this.codClient = codCliente;
		this.credential = credential;
		this.email = email;
		this.subscribe = parseData(subscribe);
	}

	private Date parseData(String dataString) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return dateFormat.parse(dataString);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public String getCodClient() {
		return codClient;
	}

	public String getCredential() {
		return credential;
	}

	public String getEmail() {
		return email;
	}

	public Date getSubscribe() {
		return subscribe;
	}
}
