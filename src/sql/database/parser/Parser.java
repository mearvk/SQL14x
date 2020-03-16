package sql.database.parser;

import sql.database.components.Component;
import sql.database.connections.NetworkConnection;
import sql.database.memory.Memory;
import sql.database.system.System;

public class Parser extends Component
{
    private String input;

    public String name;

    public PublicParserInterface public_instance = new PublicParserInterface();

    //public ParserPrivateInterfaceInstance private_instance = new ParserPrivateInterfaceInstance();

    public Parser(String name)
    {
        this.name = name;

        System.ref.memory.instance.push(name, this);
    }

    public class PublicParserInterface
    {
        public PublicParserInterface connection(NetworkConnection connection)
        {
            System.ref.instance.database_instance.network.connections.put(connection.hashCode(), connection);

            return this;
        }

        public PublicParserInterface status(String status)
        {
            Parser component =  (Parser)System.ref.memory.instance.pull("//parser");

            component.input = "";

            return this;
        }

        public PublicParserInterface parse()
        {
            return this;
        }
    }

    public class PrivateParserInterface
    {
        private PrivateParserInterface input(String input)
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

        private PrivateParserInterface clear(String input)
        {
            Parser component =  (Parser)Memory.ref.instance.pull("//parser");

            component.input = "";

            return this;
        }



        private PrivateParserInterface parse(String string)
        {
            return this;
        }

    }


}
