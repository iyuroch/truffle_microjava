package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MJContinue extends MJStatement {
    // TODO: add check if in loop

    @Override
    public Object execute(VirtualFrame frame) {
        throw MJContinueException.SINGLETON;
    }

}
