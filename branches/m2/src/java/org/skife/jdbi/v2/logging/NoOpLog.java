package org.skife.jdbi.v2.logging;

import org.skife.jdbi.v2.Handle;
import org.skife.jdbi.v2.tweak.SQLLog;

/**
 * Default SQLLog implementation, does nothing
 */
public final class NoOpLog implements SQLLog
{

    final static BatchLogger batch = new BatchLogger() {

        public final void add(String sql)
        {
        }

        public final void log(long time)
        {
        }
    };

    public void logBeginTransaction(Handle h)
    {
    }

    public void logCommitTransaction(long time, Handle h)
    {
    }

    public void logRollbackTransaction(long time, Handle h)
    {
    }

    public void logObtainHandle(long time, Handle h)
    {
    }

    public void logReleaseHandle(Handle h)
    {
    }

    public void logSQL(long time, String sql)
    {
    }

    public void logPreparedBatch(long time, String sql, int count)
    {
    }

    public BatchLogger logBatch()
    {
        return batch;
    }

    public void logCheckpointTransaction(Handle h, String name)
    {
    }

    public void logReleaseCheckpointTransaction(Handle h, String name)
    {
    }

    public void logRollbackToCheckpoint(long time, Handle h, String checkpointName)
    {
    }
}
