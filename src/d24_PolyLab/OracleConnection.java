package d24_PolyLab;

public class OracleConnection extends DbConnection{

	public void openConnection() {
		System.out.println("Die Oracle-Verbindung wurde geoffnet");
	}
	
	public void closeConnection() {
		System.out.println("Die Oracle-Verbindung wurde geschlossen");
	}
	public void executeQuery(String sql) {
		System.out.println("Die Oracle-Befehle wurden ausgefuhrt");
	}
	
}
