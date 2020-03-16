package sql.database.network;


import sql.database.components.ThreadedComponent;
import sql.database.memory.Memory;
import sql.database.parser.Parser;

import java.net.ServerSocket;
import java.util.HashMap;

import static sql.database.components.Component.READY;

public class NetworkConnection extends ThreadedComponent
{
    public static HashMap<Integer, Object> connections = new HashMap<>();

    public ServerSocket server_socket;

    public Boolean running;

    public NetworkConnection(String name)
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
                sql.database.connections.NetworkConnection network_connection = new sql.database.connections.NetworkConnection(this.server_socket.accept());

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
