package sql.database.processor;

import sql.database.components.Component;
import sql.database.memory.Memory;
import sql.database.memory.MemoryInstance;
import sql.database.parser.Parser;

public class Processor extends Component
{
    public String name;

    public MemoryInstance instance;

    public ProcessorPublicInterfaceInstance public_instance;

    public Processor(String name, MemoryInstance instance)
    {
        this.name = name;

        this.instance = instance;
    }

    public class ProcessorPublicInterfaceInstance
    {
        public Processor.ProcessorPublicInterfaceInstance process(String input)
        {
            Parser parser =  (Parser) Memory.ref.instance.pull("//parser");

            parser.public_instance.parse();

            return this;
        }
    }

    public Processor process()
    {
        return this;
    }
}
