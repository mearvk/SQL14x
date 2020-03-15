package sql.database.parser;

import sql.database.components.Component;
import sql.database.memory.Memory;

public class Parser extends Component
{
    public String name;

    public Memory memory;

    public Parser(String name, Memory memory)
    {
        this.name = name; this.memory = memory;
    }
}
