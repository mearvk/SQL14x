package sql.database.network;


import sql.database.components.ThreadedComponent;
import sql.database.memory.Memory;
import sql.database.memory.MemoryInstance;
import sql.database.parser.Parser;

import java.net.ServerSocket;
import java.net.Socket;

import static sql.database.components.Component.READY;

public class NetworkSocket extends ThreadedComponent
{
    public Socket socket;

    public ServerSocket server_socket;

    public Boolean running;

    public NetworkSocket(String name, MemoryInstance instance)
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
                Socket socket = serversocket.accept();

                Parser component = (Parser)Memory.ref.instance.pull("//parser");

                if(component==null) throw new NullPointerException();

                component.public_instance.inputstream(socket.getInputStream());

                component.public_instance.outputstream(socket.getOutputStream());

                component.public_instance.status(READY);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}
