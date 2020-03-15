package sql.database.parser;

import sql.database.components.Component;
import sql.database.memory.Memory;

public class ParserComponent extends Component
{
    private String input;

    private Boolean run = false;

    private ParserThread runnable;

    public String name;

    public Memory memory;

    public ParserPublicInterfaceInstance publicinstance = new ParserPublicInterfaceInstance();

    public ParserPrivateInterfaceInstance privateinstance = new ParserPrivateInterfaceInstance();

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

        public ParserPublicInterfaceInstance clear(String input)
        {
            ParserComponent component =  (ParserComponent)Memory.ref.instance.pull("//parser");

            component.input = "";

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
