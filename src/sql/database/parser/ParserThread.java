package sql.database.parser;

import sql.database.memory.Memory;

public class ParserThread extends Thread
{
    public ParserThread()
    {

    }

    @Override
    public void run()
    {
        while(true)
        {
            ParserComponent component =  (ParserComponent) Memory.ref.instance.pull("//parser");

            if(!component.publicinstance.ready()) return;
        }
    }
}
