package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;

public abstract class MJExpr extends Node {
    public abstract Object execute(VirtualFrame frame);
}
