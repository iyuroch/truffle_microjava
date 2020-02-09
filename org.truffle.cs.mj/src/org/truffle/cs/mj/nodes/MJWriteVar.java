package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;

public class MJWriteVar extends MJStatement {

    @Child MJExpr value;
    FrameSlot slot;

    public MJWriteVar(MJExpr value, FrameSlot slot) {
        super();
        this.value = value;
        this.slot = slot;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        frame.setObject(this.slot, this.value.execute(frame));
        return null;
    }

}
