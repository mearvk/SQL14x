package sql.database.system;
import sql.database.memory.Memory;
import sql.database.nominative.Name;

public class System
{
    public Memory memory;

    public SystemInstance instance;

    public static System ref;

    public static void main(String...args)
    {
        System system = new System(new Memory("//memory"), new Name("//system"));
    }
    
    public System(Memory memory, Name name)
    {
        System.ref = this;

        System.ref.memory = memory;

        System.ref.instance = new SystemInstance("//system/instance");

        System.ref.memory.instance.push(name,this);
    }
}
