package sql.database.parser;

import sql.database.components.Component;
import sql.database.memory.Memory;

public class ParserComponent extends Component
{
    public String name;

    public Memory memory;

    public ParserPublicInterface _public;

    public ParserPublicInterface _private;

    public ParserComponent(String name, Memory memory)
    {
        this.name = name; this.memory = memory;


    }

    public class ParserPublicInterface
    {

    }

    public class PrivatePublicInterface
    {

    }

    public ParserComponent parse(String string)
    {
        return this;
    }
}
