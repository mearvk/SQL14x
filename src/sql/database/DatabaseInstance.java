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

    public Parser parser = new Parser("//parser", memory.instance);

    public Persistor persistor = new Persistor("//persistor", memory.instance);

    public Processor processor = new Processor("//processor", memory.instance);

    public NetworkSocket network = new NetworkSocket("//networksocket", memory.instance);

    public LocalSocket local = new LocalSocket("//localsocket", memory.instance);

    //

    public DatabaseInstance()
    {

    }
}
