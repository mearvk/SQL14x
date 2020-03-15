package sql.database;

public class Database
{
    public static Database ref;

    public DatabaseInstance instance;

    public static void main(String...args)
    {

    }

    public Database()
    {
        Database.ref = this;

        Database.ref.instance = new DatabaseInstance();
    }
}


