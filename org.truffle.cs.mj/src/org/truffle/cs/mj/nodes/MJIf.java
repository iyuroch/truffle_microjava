package org.truffle.cs.mj.nodes;

import java.util.Optional;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MJIf extends MJStatement {

    @Child MJExpr condition;
    @Child MJStatement truePath;
    @Child MJStatement falsePath;

    public MJIf(MJExpr condition, MJStatement truePath, MJStatement falsePath) {
        super();
        this.condition = condition;
        this.truePath = truePath;
        this.falsePath = falsePath;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        if ((boolean) condition.execute(frame)) {
            this.truePath.execute(frame);
        } else {
            if (this.falsePath != null) {
                this.falsePath.execute(frame);
            }
        }
        return null;
    }

}
