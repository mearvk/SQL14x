package sql.database.system;
import sql.database.memory.Memory;

public class System
{
    public static void main(String...args)
    {
        System system = new System("//system");
    }

    public static System ref;

    public SystemInstance instance = new SystemInstance();

    public Memory memory = new Memory("//memory");

    public System(String name)
    {
        Memory.ref.instance.push(name, this);

        System.ref = this;
    }
}
