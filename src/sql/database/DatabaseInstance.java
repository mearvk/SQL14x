package sql.database;

import sql.database.memory.Memory;
import sql.database.network.NetworkComponent;
import sql.database.parser.ParserComponent;
import sql.database.persistor.PersistenceComponent;
import sql.database.processor.ProcessorComponent;

public class DatabaseInstance
{
    public Memory memory = new Memory("//memory");

    //

    public ParserComponent parser = new ParserComponent("//parser", memory.instance);

    public PersistenceComponent persistor = new PersistenceComponent("//persistor", memory.instance);

    public NetworkComponent network = new NetworkComponent("//network", memory.instance);

    public ProcessorComponent processor = new ProcessorComponent("//processor", memory.instance);

    //

    public DatabaseInstance()
    {

    }
}
