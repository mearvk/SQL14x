package sql.database.network;
import sql.database.nominative.Name;
import sql.database.system.System;

public class Local
{
    public Local(Name name)
    {
        System.ref.memory.instance.push(name, this);
    }
}
