package sql.database.network;

import sql.database.memory.Memory;
import sql.database.memory.MemoryInstance;

import java.net.ServerSocket;

public class LocalSocket
{
    public LocalSocket(String name, MemoryInstance instance)
    {
        Memory.ref.instance.push(name, this);
    }
}
