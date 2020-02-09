package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.RootNode;

@NodeInfo
public class MJMethod extends RootNode {

    final String name;
    @Child MJBlock body;

    public MJMethod(String name, MJBlock block, FrameDescriptor frameDescriptor) {
        super(null, frameDescriptor);

        this.body = block;
        this.name = name;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        this.body.execute(frame);
        return null;
    }

    @Override
    public String getName() {
        return name;
    }
}
