package sql.database.processor;

import sql.database.components.Component;
import sql.database.memory.Memory;
import sql.database.memory.MemoryInstance;
import sql.database.parser.ParserComponent;

public class ProcessorComponent extends Component
{
    public String name;

    public MemoryInstance instance;

    public ProcessorPublicInterfaceInstance public_instance;

    public ProcessorComponent(String name, MemoryInstance instance)
    {
        this.name = name;

        this.instance = instance;
    }

    public class ProcessorPublicInterfaceInstance
    {
        public ProcessorComponent.ProcessorPublicInterfaceInstance process(String input)
        {
            ParserComponent parser =  (ParserComponent) Memory.ref.instance.pull("//parser");

            parser.public_instance.parse();

            return this;
        }
    }

    public ProcessorComponent process()
    {
        return this;
    }
}
