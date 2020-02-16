package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MJReturnable extends MJStatement {
    @Child MJExpr expression;

    public MJReturnable(MJExpr mjExpr) {
        super();
        this.expression = mjExpr;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        throw new MJReturnableException(this.expression.execute(frame));
    }

}
