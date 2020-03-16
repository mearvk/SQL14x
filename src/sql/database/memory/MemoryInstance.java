package sql.database.memory;

import sql.database.nominative.Name;

import java.util.HashMap;

public class MemoryInstance
{
    HashMap<Name, Object> map = new HashMap();

    public Object push(Name name, Object object)
    {
        return map.put(name, object);
    }

    public Object pull(String string)
    {
        return map.get(string);
    }
}
