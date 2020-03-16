package sql.database;

import sql.database.memory.Memory;
import sql.database.network.LocalSocket;
import sql.database.network.NetworkSocket;
import sql.database.parser.Parser;
import sql.database.persistor.Persistor;
import sql.database.processor.Processor;

import java.util.Locale;

public class DatabaseInstance
{
    public Memory memory = new Memory("//memory");

    //

    public Parser parser = new Parser("//parser");

    public Persistor persistor = new Persistor("//persistor");

    public Processor processor = new Processor("//processor");

    public NetworkSocket network = new NetworkSocket("//networksocket");

    public LocalSocket local = new LocalSocket("//localsocket");

    //

    public DatabaseInstance()
    {

    }
}
