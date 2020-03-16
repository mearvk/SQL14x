package sql.database.network;

import sql.database.memory.Memory;
import sql.database.memory.MemoryInstance;

import java.net.ServerSocket;

public class Local
{
    public Local(String name)
    {
        Memory.ref.instance.push(name, this);
    }
}
