package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.frame.VirtualFrame;

public class MJReadVar extends MJExpr {

    FrameSlot slot;

    public MJReadVar(FrameSlot slot) {
        super();
        this.slot = slot;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        try {
            return frame.getObject(this.slot);
        } catch (FrameSlotTypeException e) {
            throw new Error(e);
        }
    }

}
