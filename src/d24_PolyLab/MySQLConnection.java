package d24_PolyLab;

public class MySQLConnection extends DbConnection{
	
	public void openConnection() {
		System.out.println("Die MySQL-Verbindung wurde geoffnet");
	}
	public void closeConnection() {
		System.out.println("Die MySQL-Verbindung wurde geschlossen");
	}
	public void executeQuery(String sql) {
		System.out.println("Die MySQL-Befehle wurden ausgefuhrt");
	}

}
