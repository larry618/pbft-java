package com.gmail.woodyc40.pbft;

import com.gmail.woodyc40.pbft.protocol.*;

public interface StateMachine<Op, R, T> extends Node<Op, R, T> {
    State state();

    void primaryRecvReq(Request<Op> request);

    void sendPrePrepare(Request<Op> request);

    void recvPrePrepare(PrePrepare prePrepare);

    void sendPrepare(Prepare prepare);

    void recvPrepare(Prepare prepare);

    boolean prepared(int replica);

    void sendCommit(Commit commit);

    void recvCommit(Commit commit);

    boolean commitedLocal(int replica);

    void sendReply(Reply<R> reply);

    void sendCheckpoint(Checkpoint checkpoint);

    void recvCheckpoint(Checkpoint checkpoint);

    void sendViewChange(ViewChange viewChange);

    void recvViewChange(ViewChange viewChange);

    void sendNewView(NewView newView);

    void recvNewView(NewView newView);
}
