package org.skywalking.apm.collector.agentstream.worker.segment;

import org.skywalking.apm.network.proto.SpanObject;

/**
 * @author pengys5
 */
public interface LocalSpanListener extends SpanListener {
    void parseLocal(SpanObject spanObject, int applicationId, int applicationInstanceId, String segmentId);
}
