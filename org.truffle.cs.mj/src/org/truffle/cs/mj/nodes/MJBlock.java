package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;

public class MJBlock extends MJStatement {

    @Children MJStatement statements[];

    public MJBlock(MJStatement[] statements) {
        this.statements = statements;
    }

    @Override
    @ExplodeLoop
    public Object execute(VirtualFrame frame) {
        for (MJStatement statement : statements) {
            statement.execute(frame);
        }
        return null;
    }

}
