package sql.database.communication;

import sql.database.components.ThreadedComponent;
import sql.database.communication.threading.NetworkThread;
import sql.database.nominative.Name;
import sql.database.system.System;

import java.net.ServerSocket;
import java.util.HashMap;

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

            System.ref.memory.instance.push(new Name("//serversocket"), this.server_socket);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void run()
    {

    }
}
