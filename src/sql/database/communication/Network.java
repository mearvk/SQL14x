package sql.database.communication;

import sql.database.components.ThreadedComponent;
import sql.database.connections.NetworkConnection;
import sql.database.communication.threading.NetworkThread;
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

    public NetworkThread thread = new NetworkThread();

    public Boolean running = true;

    public Network(Name name)
    {
        System.ref.memory.instance.push(name, this);

        try
        {
            this.server_socket = new ServerSocket(80);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        this.start();
    }

    @Override
    public void run()
    {
        while(running)
        {
            try
            {
                NetworkConnection new_network_connection = new NetworkConnection(this.server_socket.accept());

                Parser component = (Parser)System.ref.memory.instance.pull("//parser");

                component.public_instance.push_new_connection(new_network_connection);

                component.public_instance.push_ready_status(Ready);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}
