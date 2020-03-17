package sql.database.connections;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class RemoteConnection extends Thread
{
    public Socket socket;

    public InputStream in;

    public OutputStream out;

    public RemoteConnection(Socket socket)
    {
        this.socket = socket;

        try
        {
            this.in = socket.getInputStream();

            this.out = socket.getOutputStream();
        }
        catch(Exception e)
        {

        }
    }

}
