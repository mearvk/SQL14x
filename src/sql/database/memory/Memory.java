package sql.database.memory;

import sql.database.components.Component;

import java.util.HashMap;

public class Memory extends Component
{
    public String name;

    public HashMap<String, Object> map = new HashMap();

    public Memory()
    {

    }

    public Memory(String name)
    {
        this.name = name;
    }
}
