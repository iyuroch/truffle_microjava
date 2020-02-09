package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.dsl.Specialization;

public abstract class MJConst extends MJExpr {
    public final int constant;

    public MJConst(int constant) {
        this.constant = constant;
    }

    @Specialization
    public int doInt() {
        return this.constant;
    }
}
