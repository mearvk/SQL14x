package sql.database;

import sql.database.memory.Memory;
import sql.database.network.NetworkComponent;
import sql.database.parser.ParserComponent;
import sql.database.persistor.PersistorComponent;
import sql.database.processor.ProcessorComponent;

public class DatabaseInstance
{
    public Memory memory = new Memory("//memory");

    //

    public ParserComponent parser = new ParserComponent("//parser", memory.instance);

    public PersistorComponent persistor = new PersistorComponent("//persistor", memory.instance);

    public NetworkComponent network = new NetworkComponent("//network", memory.instance);

    public ProcessorComponent processor = new ProcessorComponent("//processor", memory.instance);

    //

    public DatabaseInstance()
    {

    }
}
