package d24_PolyLab;

public class DbConnection {
	
	public void openConnection() {
		System.out.println("Die Db-Verbindung wurde geoffnet");
	}
	
	public void closeConnection() {
		System.out.println("Die Db-Verbindung wurde abgeschlossen");
	}
	
	public void executeQuery(String sql) {
		System.out.println("Die SQL-Befehle wurden ausgefuhrt");
	}

}
