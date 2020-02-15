package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.LoopNode;

public class MJWhile extends MJStatement {

    @Child LoopNode loopNode;

    public MJWhile(MJExpr condition, MJStatement body) {
        super();
        this.loopNode = Truffle.getRuntime().createLoopNode(new MJRepeat(condition, body));
    }

    @Override
    public Object execute(VirtualFrame frame) {
        return this.loopNode.execute(frame);
    }

}
