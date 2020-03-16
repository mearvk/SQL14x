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

    public Boolean running;

    public NetworkComponent(String name, MemoryInstance instance)
    {
        Memory.ref.instance.push(name, this);

        try
        {
            Memory.ref.instance.push("//serversocket", new ServerSocket(80));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void run()
    {
        ServerSocket serversocket = (ServerSocket)Memory.ref.instance.pull("//serversocket");

        while(running)
        {
            try
            {
                this.socket = serversocket.accept();


            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
