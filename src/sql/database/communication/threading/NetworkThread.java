package sql.database.communication.threading;

import sql.database.connections.RemoteConnection;
import sql.database.nominative.Name;
import sql.database.parser.Parser;
import sql.database.system.System;

import java.net.ServerSocket;

import static sql.database.components.Component.Ready;

public class NetworkThread extends Thread
{
    public boolean running = true;

    public NetworkThread()
    {

    }

    @Override
    public void run()
    {
        while(running)
        {
            try
            {
                ServerSocket server_socket = (ServerSocket)System.ref.memory.instance.pull(new Name("//serversocket"));

                RemoteConnection new_socket_connection = new RemoteConnection(server_socket.accept());

                Parser component = (Parser) System.ref.memory.instance.pull(new Name("//parser"));

                component.public_instance.push_new_connection(new_socket_connection);

                component.public_instance.push_ready_status(Ready);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
