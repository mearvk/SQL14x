package sql.database;

import sql.database.memory.Memory;
import sql.database.network.LocalConnection;
import sql.database.network.NetworkConnection;
import sql.database.parser.Parser;
import sql.database.persistor.Persistor;
import sql.database.processor.Processor;

public class DatabaseInstance
{
    public Memory memory = new Memory("//memory");

    //

    public Parser parser = new Parser("//parser");

    public Persistor persistor = new Persistor("//persistor");

    public Processor processor = new Processor("//processor");

    public NetworkConnection network = new NetworkConnection("//network");

    public LocalConnection local = new LocalConnection("//local");

    //

    public DatabaseInstance()
    {

    }
}
