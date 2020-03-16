package sql.database.network;


import sql.database.components.ThreadedComponent;
import sql.database.memory.Memory;
import sql.database.memory.MemoryInstance;

import java.net.ServerSocket;
import java.net.Socket;

public class NetworkComponent extends ThreadedComponent
{
    public Socket socket;

    public ServerSocket server_socket;

    public NetworkComponent(String name, MemoryInstance instance)
    {
        Memory.ref.instance.push(name, this);
    }

    @Override
    public void run()
    {

    }
}
