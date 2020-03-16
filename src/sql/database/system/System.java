package sql.database.system;
import sql.database.memory.Memory;

public class System
{
    public static void main(String...args)
    {
        System system = new System(new Memory("//memory"), "//system");
    }

    public static System ref;

    public SystemInstance instance = new SystemInstance();

    public Memory memory;

    public System(Memory memory, String name)
    {
        System.ref = this;

        System.ref.memory = memory;

        System.ref.memory.instance.push(name,this);
    }
}
