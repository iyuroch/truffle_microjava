package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MJReturnable extends MJStatement {
    @Child MJExpr expression;

    public MJReturnable(MJExpr expression) {
        super();
        this.expression = expression;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        try {
            this.expression.execute(frame);
        } catch (MJReturnableException ex) {
            return ex.getResult();
        }
        return null;
    }

}
