package d24_PolyLab;

public class PostgreConnection extends DbConnection{
	
	public void openConnection() {
		System.out.println("Die Postgre-Verbindung wurde geoffnet");
	}
	public void closeConnection() {
		System.out.println("Die Postgre-Verbindung wurde geschlossen");
	}
	public void executeQuery(String sql) {
		System.out.println("Die Postgre-Befehle wurden ausgefuhrt");
	}

}
