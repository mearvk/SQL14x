package sql.database.parser;

import sql.database.components.Component;
import sql.database.memory.Memory;
import sql.database.memory.MemoryInstance;

public class ParserComponent extends Component
{
    private String input;

    private ParserThread runnable = new ParserThread();

    public String name;

    public Memory memory;

    public ParserPublicInterfaceInstance public_instance = new ParserPublicInterfaceInstance();

    public ParserPrivateInterfaceInstance private_instance = new ParserPrivateInterfaceInstance();

    public ParserComponent(String name, MemoryInstance instance)
    {
        this.name = name; this.memory = memory;
    }

    public class ParserPublicInterfaceInstance
    {
        public ParserPublicInterfaceInstance push(String input)
        {
            ParserComponent component =  (ParserComponent)Memory.ref.instance.pull("//parser");

            component.input = input;

            return this;
        }

        public Boolean ready()
        {
            ParserComponent component =  (ParserComponent)Memory.ref.instance.pull("//parser");

            return (component.input != null && !component.input.equals(""));
        }

        public ParserPublicInterfaceInstance clear()
        {
            ParserComponent component =  (ParserComponent)Memory.ref.instance.pull("//parser");

            component.input = "";

            return this;
        }

        public ParserPublicInterfaceInstance parse()
        {
            return this;
        }
    }

    public class ParserPrivateInterfaceInstance
    {
        private ParserPrivateInterfaceInstance input(String input)
        {
            ParserComponent component =  (ParserComponent)Memory.ref.instance.pull("//parser");

            component.input = input;

            return this;
        }

        private Boolean ready(String input)
        {
            ParserComponent component =  (ParserComponent)Memory.ref.instance.pull("//parser");

            return (component.input != null && !component.input.equals(""));
        }

        private ParserPrivateInterfaceInstance clear(String input)
        {
            ParserComponent component =  (ParserComponent)Memory.ref.instance.pull("//parser");

            component.input = "";

            return this;
        }



        private ParserPrivateInterfaceInstance parse(String string)
        {
            return this;
        }

    }


}
