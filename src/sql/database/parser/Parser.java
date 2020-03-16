package sql.database.parser;

import sql.database.components.Component;
import sql.database.memory.Memory;
import sql.database.memory.MemoryInstance;

import java.io.InputStream;
import java.io.OutputStream;

public class Parser extends Component
{
    private String input;

    private ParserThread runnable = new ParserThread();

    public String name;

    public MemoryInstance instance;

    public ParserPublicInterfaceInstance public_instance = new ParserPublicInterfaceInstance();

    public ParserPrivateInterfaceInstance private_instance = new ParserPrivateInterfaceInstance();

    public Parser(String name)
    {
        this.name = name;

        Memory.ref.instance.push(name, this);
    }

    public class ParserPublicInterfaceInstance
    {
        public ParserPublicInterfaceInstance inputstream(InputStream in)
        {
            Parser component =  (Parser)Memory.ref.instance.pull("//parser");

            component.input = input;

            return this;
        }

        public Boolean outputstream(OutputStream out)
        {
            Parser component =  (Parser)Memory.ref.instance.pull("//parser");

            return (component.input != null && !component.input.equals(""));
        }

        public ParserPublicInterfaceInstance status(String status)
        {
            Parser component =  (Parser)Memory.ref.instance.pull("//parser");

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
            Parser component =  (Parser)Memory.ref.instance.pull("//parser");

            component.input = input;

            return this;
        }

        private Boolean ready(String input)
        {
            Parser component =  (Parser)Memory.ref.instance.pull("//parser");

            return (component.input != null && !component.input.equals(""));
        }

        private ParserPrivateInterfaceInstance clear(String input)
        {
            Parser component =  (Parser)Memory.ref.instance.pull("//parser");

            component.input = "";

            return this;
        }



        private ParserPrivateInterfaceInstance parse(String string)
        {
            return this;
        }

    }


}
