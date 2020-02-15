package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.nodes.ControlFlowException;

public class MJContinueException extends ControlFlowException {
    public static final MJContinueException SINGLETON = new MJContinueException();
    private static final long serialVersionUID = 1230498712039857123L;

    private MJContinueException() {
    }
}
