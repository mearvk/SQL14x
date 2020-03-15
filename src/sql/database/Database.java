package sql.database;

public class Database
{
    public static Database ref;

    public DatabaseInstance instance;

    public static void main(String...args)
    {
        Database.ref = new Database();

        Database.ref.instance =  new DatabaseInstance();
    }

    public Database()
    {

    }
}
