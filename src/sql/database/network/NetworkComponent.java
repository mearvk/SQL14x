package sql.database.network;


import sql.database.components.ThreadedComponent;
import sql.database.memory.Memory;
import sql.database.memory.MemoryInstance;

import java.io.IOException;
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
        try
        {
            //this.server_socket = new ServerSocket(80);

            Memory.ref.instance.push("//server_socket", new ServerSocket(80));
        }
        catch (Exception e)
        {

        }
    }
}
