package sql.database.network;

import sql.database.memory.Memory;
import sql.database.memory.MemoryInstance;
import sql.database.system.System;

import java.net.ServerSocket;

public class Local
{
    public Local(String name)
    {
        System.ref.memory.instance.push(name, this);
    }
}
