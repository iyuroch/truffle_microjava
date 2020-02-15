package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.nodes.ControlFlowException;

public class MJReturnableException extends ControlFlowException {
    private static final long serialVersionUID = 11982031205L;

    private final Object result;

    public MJReturnableException(Object result) {
        this.result = result;
    }

    public Object getResult() {
        return result;
    }

}