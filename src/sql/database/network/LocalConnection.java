package sql.database.network;

import sql.database.memory.Memory;
import sql.database.memory.MemoryInstance;

import java.net.ServerSocket;

public class LocalConnection
{
    public LocalConnection(String name)
    {
        Memory.ref.instance.push(name, this);
    }
}
