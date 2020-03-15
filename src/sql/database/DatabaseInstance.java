package sql.database;

import sql.database.memory.Memory;
import sql.database.parser.Parser;
import sql.database.processor.Processor;

public class DatabaseInstance
{
    public Memory memory = new Memory("//memory");

    public Parser parser = new Parser("//parser", memory);

    public Processor processor = new Processor("//processor", memory);

    public DatabaseInstance()
    {

    }
}
