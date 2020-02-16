package org.truffle.cs.mj.nodes;

import java.util.List;
import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotKind;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.RootNode;

@NodeInfo
public class MJMethod extends RootNode {

    final String name;
    FrameSlotKind returnType;
    @Child MJBlock body;

    public MJMethod(String name, MJBlock block, FrameDescriptor frameDescriptor,
                    FrameSlotKind returnType) {
        super(null, frameDescriptor);

        this.returnType = returnType;
        this.body = block;
        this.name = name;
    }

    public void setBody(MJBlock body) {
        this.body = body;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        int len = frame.getArguments().length;

        for (int i = 0; i < len; i++) {
            frame.setObject(this.getFrameDescriptor().getSlots().get(i), frame.getArguments()[i]);
        }

        this.body.execute(frame);
        return null;
    }

    @Override
    public String getName() {
        return name;
    }
}
