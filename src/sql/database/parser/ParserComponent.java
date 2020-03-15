package sql.database.parser;

import sql.database.components.Component;
import sql.database.memory.Memory;

public class ParserComponent extends Component
{
    private String input;

    private Boolean run = false;

    private Runnable runnable;

    public String name;

    public Memory memory;

    public ParserPublicInterfaceInstance publicinstance;

    public ParserPrivateInterfaceInstance privateinstance;

    public ParserComponent(String name, Memory memory)
    {
        this.name = name; this.memory = memory;
    }

    public class ParserPublicInterfaceInstance
    {
        public ParserPublicInterfaceInstance input(String input)
        {
            ParserComponent component =  (ParserComponent)Memory.ref.instance.pull("//parser");

            component.input = input;

            return this;
        }

        public ParserPublicInterfaceInstance parse(String string)
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

        public ParserPrivateInterfaceInstance parse(String string)
        {
            return this;
        }

    }


}
