package sql.database.network;

import sql.database.components.ThreadedComponent;
import sql.database.connections.NetworkConnection;
import sql.database.nominative.Name;
import sql.database.parser.Parser;
import sql.database.system.System;

import java.net.ServerSocket;
import java.util.HashMap;

import static sql.database.components.Component.Ready;

public class Network extends ThreadedComponent
{
    public static HashMap<Integer, Object> connections = new HashMap<>();

    public ServerSocket server_socket;

    public Boolean running = true;

    public Network(Name name)
    {
        System.ref.memory.instance.push(name, this);

        try
        {
            System.ref.memory.instance.push(new Name("//serversocket"), this.server_socket = new ServerSocket(80));
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
                NetworkConnection Network_connection = new NetworkConnection(this.server_socket.accept());

                Parser component = (Parser)System.ref.memory.instance.pull("//parser");

                component.public_instance.push_connection(Network_connection);

                component.public_instance.push_status(Ready);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}
