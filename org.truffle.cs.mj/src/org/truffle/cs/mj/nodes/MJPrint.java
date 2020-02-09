package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MJPrint extends MJStatement {

    @Child MJExpr expression;

    public MJPrint(MJExpr expression) {
        this.expression = expression;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        print(this.expression.execute(frame));
        return null;
    }

    public void print(Object o) {
        System.out.println(o);
    }
}
