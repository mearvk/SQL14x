package sql.database.network;

import sql.database.components.ThreadedComponent;
import sql.database.connections.NetworkConnection;
import sql.database.memory.Memory;
import sql.database.parser.Parser;

import java.net.ServerSocket;
import java.util.HashMap;

import static sql.database.components.Component.ready;

public class Network extends ThreadedComponent
{
    public static HashMap<Integer, Object> connections = new HashMap<>();

    public ServerSocket server_socket;

    public Boolean running;

    public Network(String name)
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

                component.public_instance.status(ready);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}
