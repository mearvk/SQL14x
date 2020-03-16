package sql.database;

public class Database
{
    public static Database ref;

    public DatabaseInstance instance;



    public Database()
    {
        Database.ref = this;

        Database.ref.instance = new DatabaseInstance();
    }
}


