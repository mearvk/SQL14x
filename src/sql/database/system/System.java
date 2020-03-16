package sql.database.system;
import sql.database.memory.Memory;
import sql.database.nominative.Name;

public class System
{
    public static void main(String...args)
    {
        Memory memory;

        System system = new System(new Memory("//memory"), new Name("//system"));
    }

    public static System ref;

    public SystemInstance instance;

    public Memory memory;

    public System(Memory memory, Name name)
    {
        System.ref = this;

        System.ref.memory = memory;

        System.ref.instance = new SystemInstance("//system.instance");

        System.ref.memory.instance.push(name,this);
    }
}
