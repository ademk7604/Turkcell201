package d24_PolyLab;

public class MsSQLConnection extends DbConnection {

	public void openConnection() {
		System.out.println("Die MsSQL- Verbindung wurde geoffnet ");
	}

	public void closeConnection() {
		System.out.println("Die MsSQL-Verbindung wurde geschlossen");
	}

	public void executeQuery(String sql) {
		System.out.println("Die MsSQL-Befehle wurden ausgefuhrt");
	}

}
