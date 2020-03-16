package sql.database.system;

import sql.database.Database;
import sql.database.memory.Memory;

import java.util.HashMap;

public class System
{
    public static System ref;

    public SystemInstance instance = new SystemInstance();

    public Memory memory = new Memory("//memory");

    public static void main(String...args)
    {
        System system = new System("//system");
    }

    public System(String name)
    {
        Memory.ref.instance.push(name, this);

        System.ref = this;
    }
}
