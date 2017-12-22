package com.zed.retrocloudantmvp.service;

import com.cloudant.sync.replication.Replicator;

/**
 * Created by airfi on 09/12/17.
 */

public interface AllReplicators {

    void onAvailableReplicators(Replicator reps[]);
}
