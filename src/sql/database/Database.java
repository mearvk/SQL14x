package sql.database;

public class Database
{
    public static void main(String...args)
    {
        Database database = new Database();
    }

    public DatabaseInstance instance;

    public Database()
    {
        this.instance = new DatabaseInstance();
    }
}
