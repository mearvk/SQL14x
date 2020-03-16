package sql.database.network;


import sql.database.components.ThreadedComponent;
import sql.database.connections.NetworkConnection;
import sql.database.memory.Memory;
import sql.database.memory.MemoryInstance;
import sql.database.parser.Parser;

import java.net.ServerSocket;
import java.net.Socket;

import static sql.database.components.Component.READY;

public class NetworkSocket extends ThreadedComponent
{
    public ServerSocket server_socket;

    public Boolean running;

    public NetworkSocket(String name)
    {
        Memory.ref.instance.push(name, this);

        try
        {
            Memory.ref.instance.push("//serversocket", this.server_socket = new ServerSocket(80));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void run()
    {
        while(running)
        {
            try
            {
                NetworkConnection network_connection = new NetworkConnection(this.server_socket.accept());

                Parser component = (Parser)Memory.ref.instance.pull("//parser");

                component.public_instance.connection(network_connection);

                component.public_instance.status(READY);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}
