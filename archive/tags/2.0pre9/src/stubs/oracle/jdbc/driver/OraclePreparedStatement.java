package oracle.jdbc.driver;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Ref;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Array;
import java.sql.ResultSetMetaData;
import java.sql.ParameterMetaData;
import java.sql.SQLWarning;
import java.sql.Connection;
import java.math.BigDecimal;
import java.io.InputStream;
import java.io.Reader;
import java.util.Calendar;
import java.net.URL;

/**
 *
 */
public class OraclePreparedStatement implements PreparedStatement
{
    public ResultSet executeQuery() throws SQLException
    {
        return null;
    }

    public int executeUpdate() throws SQLException
    {
        return 0;
    }

    public void setNull(int parameterIndex, int sqlType) throws SQLException
    {
    }

    public void setBoolean(int parameterIndex, boolean x) throws SQLException
    {
    }

    public void setByte(int parameterIndex, byte x) throws SQLException
    {
    }

    public void setShort(int parameterIndex, short x) throws SQLException
    {
    }

    public void setInt(int parameterIndex, int x) throws SQLException
    {
    }

    public void setLong(int parameterIndex, long x) throws SQLException
    {
    }

    public void setFloat(int parameterIndex, float x) throws SQLException
    {
    }

    public void setDouble(int parameterIndex, double x) throws SQLException
    {
    }

    public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException
    {
    }

    public void setString(int parameterIndex, String x) throws SQLException
    {
    }

    public void setBytes(int parameterIndex, byte x[]) throws SQLException
    {
    }

    public void setDate(int parameterIndex, Date x) throws SQLException
    {
    }

    public void setTime(int parameterIndex, Time x) throws SQLException
    {
    }

    public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException
    {
    }

    public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException
    {
    }

    @Deprecated
    public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException
    {
    }

    public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException
    {
    }

    public void clearParameters() throws SQLException
    {
    }

    public void setObject(int parameterIndex, Object x, int targetSqlType, int scale) throws SQLException
    {
    }

    public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException
    {
    }

    public void setObject(int parameterIndex, Object x) throws SQLException
    {
    }

    public boolean execute() throws SQLException
    {
        return false;
    }

    public void addBatch() throws SQLException
    {
    }

    public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException
    {
    }

    public void setRef(int i, Ref x) throws SQLException
    {
    }

    public void setBlob(int i, Blob x) throws SQLException
    {
    }

    public void setClob(int i, Clob x) throws SQLException
    {
    }

    public void setArray(int i, Array x) throws SQLException
    {
    }

    public ResultSetMetaData getMetaData() throws SQLException
    {
        return null;
    }

    public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException
    {
    }

    public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException
    {
    }

    public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException
    {
    }

    public void setNull(int paramIndex, int sqlType, String typeName) throws SQLException
    {
    }

    public void setURL(int parameterIndex, URL x) throws SQLException
    {
    }

    public ParameterMetaData getParameterMetaData() throws SQLException
    {
        return null;
    }

    public ResultSet executeQuery(String sql) throws SQLException
    {
        return null;
    }

    public int executeUpdate(String sql) throws SQLException
    {
        return 0;
    }

    public void close() throws SQLException
    {
    }

    public int getMaxFieldSize() throws SQLException
    {
        return 0;
    }

    public void setMaxFieldSize(int max) throws SQLException
    {
    }

    public int getMaxRows() throws SQLException
    {
        return 0;
    }

    public void setMaxRows(int max) throws SQLException
    {
    }

    public void setEscapeProcessing(boolean enable) throws SQLException
    {
    }

    public int getQueryTimeout() throws SQLException
    {
        return 0;
    }

    public void setQueryTimeout(int seconds) throws SQLException
    {
    }

    public void cancel() throws SQLException
    {
    }

    public SQLWarning getWarnings() throws SQLException
    {
        return null;
    }

    public void clearWarnings() throws SQLException
    {
    }

    public void setCursorName(String name) throws SQLException
    {
    }

    public boolean execute(String sql) throws SQLException
    {
        return false;
    }

    public ResultSet getResultSet() throws SQLException
    {
        return null;
    }

    public int getUpdateCount() throws SQLException
    {
        return 0;
    }

    public boolean getMoreResults() throws SQLException
    {
        return false;
    }

    public void setFetchDirection(int direction) throws SQLException
    {
    }

    public int getFetchDirection() throws SQLException
    {
        return 0;
    }

    public void setFetchSize(int rows) throws SQLException
    {
    }

    public int getFetchSize() throws SQLException
    {
        return 0;
    }

    public int getResultSetConcurrency() throws SQLException
    {
        return 0;
    }

    public int getResultSetType() throws SQLException
    {
        return 0;
    }

    public void addBatch(String sql) throws SQLException
    {
    }

    public void clearBatch() throws SQLException
    {
    }

    public int[] executeBatch() throws SQLException
    {
        return new int[0];
    }

    public Connection getConnection() throws SQLException
    {
        return null;
    }

    public boolean getMoreResults(int current) throws SQLException
    {
        return false;
    }

    public ResultSet getGeneratedKeys() throws SQLException
    {
        return null;
    }

    public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException
    {
        return 0;
    }

    public int executeUpdate(String sql, int columnIndexes[]) throws SQLException
    {
        return 0;
    }

    public int executeUpdate(String sql, String columnNames[]) throws SQLException
    {
        return 0;
    }

    public boolean execute(String sql, int autoGeneratedKeys) throws SQLException
    {
        return false;
    }

    public boolean execute(String sql, int columnIndexes[]) throws SQLException
    {
        return false;
    }

    public boolean execute(String sql, String columnNames[]) throws SQLException
    {
        return false;
    }

    public int getResultSetHoldability() throws SQLException
    {
        return 0;
    }

    public void registerReturnParameter(int i, int i1)
    {

    }

    public ResultSet getReturnResultSet() throws SQLException
    {
        return null;
    }
}
