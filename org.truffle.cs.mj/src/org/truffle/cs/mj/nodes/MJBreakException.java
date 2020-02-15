package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.nodes.ControlFlowException;

public class MJBreakException extends ControlFlowException {
    public static final MJBreakException SINGLETON = new MJBreakException();
    private static final long serialVersionUID = 1230817235098123L;

    private MJBreakException() {
    }
}
