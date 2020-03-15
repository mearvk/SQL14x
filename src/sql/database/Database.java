package sql.database;

public class Database
{
    public static Database ref;

    public DatabaseInstance instance;

    public static void main(String...args)
    {
        Database.ref = new Database();
    }

    public Database()
    {
        Database.ref.instance = this.instance = new DatabaseInstance();
    }
}
