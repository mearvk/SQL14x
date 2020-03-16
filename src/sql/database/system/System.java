package sql.database.system;

import sql.database.Database;
import sql.database.memory.Memory;

import java.util.HashMap;

public class System
{
    public String name = "//system";

    public SystemInstance instance = new SystemInstance();

    public static System ref;

    public static void main(String...args)
    {
        System system = new System("//system");
    }

    public System(String name)
    {
        //Memory memory = new Memory("//memory");

        Memory.ref.instance.push(name, this);

        System.ref = this;
    }
}
