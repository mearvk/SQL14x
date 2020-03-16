package sql.database;

import sql.database.network.Local;
import sql.database.network.Network;
import sql.database.parser.Parser;
import sql.database.persistor.Persistor;
import sql.database.processor.Processor;

public class DatabaseInstance
{
    public Parser parser = new Parser("//parser");

    public Persistor persistor = new Persistor("//persistor");

    public Processor processor = new Processor("//processor");

    public Network network = new Network("//network");

    public Local local = new Local("//local");

    //

    public DatabaseInstance()
    {

    }
}
