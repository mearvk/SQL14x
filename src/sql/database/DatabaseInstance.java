package sql.database;

import sql.database.communication.Local;
import sql.database.communication.Network;
import sql.database.nominative.Name;
import sql.database.parser.Parser;
import sql.database.persistor.Persistor;
import sql.database.processor.Processor;

public class DatabaseInstance
{
    public Parser parser = new Parser(new Name("//parser"));

    public Persistor persistor = new Persistor(new Name("//persistor"));

    public Processor processor = new Processor(new Name("//processor"));

    public Network network = new Network(new Name("//network"));

    public Local local = new Local(new Name("//local"));

    //

    public DatabaseInstance()
    {

    }
}
