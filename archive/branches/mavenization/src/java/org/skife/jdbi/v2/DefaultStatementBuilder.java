package org.skife.jdbi.v2;

import org.skife.jdbi.v2.tweak.StatementBuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * A StatementBuilder which will always create a new PreparedStatement
 */
public class DefaultStatementBuilder implements StatementBuilder
{
    /**
     * Create a new DefaultStatementBuilder which will always create a new PreparedStatement from
     * the Connection
     *
     * @param conn Used to prepare the statement
     * @param sql  Translated SQL statement
     * @param ctx  Unused
     *
     * @return a new PreparedStatement
     */
    public PreparedStatement create(Connection conn, String sql, StatementContext ctx) throws SQLException
    {
        return conn.prepareStatement(sql);
    }

    /**
     * Called to close an individual prepared statement created from this builder.
     * In this case, it closes imemdiately
     *
     * @param sql  the translated SQL which was prepared
     * @param stmt the statement
     *
     * @throws java.sql.SQLException if anything goes wrong closing the statement
     */
    public void close(Connection conn, String sql, Statement stmt) throws SQLException
    {
        stmt.close();
    }

    /**
     * In this case, a NOOP
     */
    public void close(Connection conn)
    {
    }
}
