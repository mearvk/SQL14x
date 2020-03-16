package sql.database.connections;

import java.net.Socket;

public class NetworkConnection extends Thread
{
    public Socket socket;

    public NetworkConnection(Socket socket)
    {
        this.socket = socket;
    }

}
