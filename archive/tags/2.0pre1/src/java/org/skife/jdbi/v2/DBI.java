/* Copyright 2004-2005 Brian McCallister
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.skife.jdbi.v2;

import org.skife.jdbi.v2.exceptions.UnableToObtainConnectionException;
import org.skife.jdbi.v2.tweak.ConnectionFactory;
import org.skife.jdbi.v2.tweak.StatementRewriter;
import org.skife.jdbi.v2.tweak.StatementLocator;
import org.skife.jdbi.v2.tweak.TransactionHandler;
import org.skife.jdbi.v2.tweak.transactions.LocalTransactionHandler;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.sql.Connection;

public class DBI implements IDBI
{
    private final ConnectionFactory connectionFactory;
    private StatementRewriter statementRewriter = new NamedParameterStatementRewriter();
    private StatementLocator statementLocator = new ClasspathStatementLocator();
    private TransactionHandler transactionhandler = new LocalTransactionHandler();

    public DBI(DataSource dataSource)
    {
        this(new DataSourceConnectionFactory(dataSource));
        assert(dataSource != null);
    }

    public DBI(ConnectionFactory connectionFactory)
    {
        assert(connectionFactory != null);
        this.connectionFactory = connectionFactory;
    }

    public void setStatementLocator(StatementLocator locator)
    {
        this.statementLocator = locator;
    }

    public void setStatementRewriter(StatementRewriter rewriter)
    {
        this.statementRewriter = rewriter;
    }

    public void setTransactionHandler(TransactionHandler handler)
    {
        this.transactionhandler = handler;
    }

    public Handle open()
    {
        try
        {
            Connection conn = connectionFactory.openConnection();
            PreparedStatementCache cache = new PreparedStatementCache(conn);
            return new BasicHandle(transactionhandler,
                                   statementLocator,
                                   cache,
                                   statementRewriter,
                                   conn);
        }
        catch (SQLException e)
        {
            throw new UnableToObtainConnectionException(e);
        }
    }

    public static Handle open(DataSource dataSource)
    {
        return new DBI(dataSource).open();
    }
}
