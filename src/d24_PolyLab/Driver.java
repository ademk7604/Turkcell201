package d24_PolyLab;

public class Driver {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		// OPEN-CLOSE PRENSIBLE WURDE AUFGEACTET
		DbConnection dbConnection = (DbConnection) Class.forName(args[0]).newInstance();
		dbConnection.openConnection();
		dbConnection.executeQuery("SELECT ** FROM student");
		dbConnection.closeConnection();

		/*
		 * DbConnection dbConnection = new DbConnection(); dbConnection.opeConnection();
		 * dbConnection.executeQuery("SELECT * FROM student");
		 * dbConnection.closeConnection();
		 * 
		 * MySQLConnection mySQLConnection = new MySQLConnection();
		 * mySQLConnection.opeConnection();
		 * mySQLConnection.executeQuery("SELECT * FROM student");
		 * mySQLConnection.closeConnetion();
		 * 
		 * MsSQLConnection msSQLConnection = new MsSQLConnection();
		 * msSQLConnection.openConnetion();
		 * msSQLConnection.executeQuery("SELECT * FROM student");
		 * msSQLConnection.closeConnection();
		 */
		/*
		 * OPEN-CLOSE PRENSIBLE WURDE NICHT AUFGEPASST. Scanner scanner = new
		 * Scanner(System.in); System.out.
		 * println("Database type auswahlen bitte: [1=MsSQL, 2=MySQL, 3=Oracle SQL]");
		 * DbConnection dbConnection = null; int dbType=scanner.nextInt(); switch
		 * (dbType) { case 1: dbConnection= new MsSQLConnection(); break; case 2:
		 * dbConnection = new MySQLConnection(); break; case 3: dbConnection = new
		 * OracleConnection(); break;
		 * 
		 * default: System.out.println("Die falsche Db-Verbindung wurde ausgewahlt");
		 * break; }
		 * 
		 * if (dbConnection != null) { dbConnection.openConnection();
		 * dbConnection.executeQuery("SELECT * FROM student");
		 * dbConnection.closeConnection(); }
		 */

	}

}
