package sql.database.memory;

import java.util.HashMap;

public class MemoryInstance
{
    HashMap<String, Object> map = new HashMap();

    public Object push(String string, Object object)
    {
        return map.put(string,object);
    }

    public Object pull(String string)
    {
        return map.get(string);
    }
}
