package DesignPatterns.SOLID;

// D: Dependency Inversion Principle (DIP)
interface Database {
    void connect();
}

class MySQL implements Database {
    public void connect() {
        System.out.println("MySQL connected");
    }
}

class PostgreSQLDatabase implements Database {
    public void connect() {
        System.out.println("PostgreSQL connected");
    }
}

class Application
{
    private Database db;

   public Application(Database db)
{
    this.db = db;
}

void start()
{
    db.connect();
}

}

class DIPExample
{
    public static void main(String[] args) {
        Database database = new MySQL();
        Application application = new Application(database);
        application.start();



    }
}
