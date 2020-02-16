package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MJReturnableCallable extends MJExpr {
    @Child MJCallable callFunc;

    public MJReturnableCallable(MJCallable callFunc) {
        super();
        this.callFunc = callFunc;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        try {
            this.callFunc.execute(frame);
        } catch (MJReturnableException ex) {
            return ex.getResult();
        }
        return null;
    }

}
