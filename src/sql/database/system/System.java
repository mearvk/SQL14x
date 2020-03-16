package sql.database.system;

import sql.database.memory.Memory;

import java.util.HashMap;

public class System
{
    public String name = "//system";

    public SystemInstance instance = new SystemInstance();

    public static System ref;

    public Memory memory = new Memory("//memory");





    public System(String name)
    {
        Memory.ref.instance.push(name, this);

        System.ref = this;
    }
}
