package sql.database.memory;

import sql.database.components.Component;

import java.util.HashMap;

public class Memory extends Component
{
    public static Memory ref;

    public MemoryInstance instance;

    public String name;

    public HashMap<String, Object> map = new HashMap();

    public Memory()
    {
        Memory.ref.instance = this.instance = new MemoryInstance();

        this.name = "//memory";
    }

    public Memory(String name)
    {
        Memory.ref.instance = this.instance = new MemoryInstance();

        this.name = name;
    }
}
