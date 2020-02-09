package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;

public abstract class MJStatement extends Node {

    public abstract Object execute(VirtualFrame frame);

}
