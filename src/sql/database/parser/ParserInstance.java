package sql.database.parser;

import sql.database.components.Component;

public class ParserInstance extends Component
{
    ParserPublicInterface public_facet;

    ParserPrivateInterface private_facet;

    private class ParserPublicInterface
    {
        public ParserPublicInterface setSQL(String input){return this;}
    }

    private class ParserPrivateInterface
    {

    }
}
