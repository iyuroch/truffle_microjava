package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;

@NodeChild(value = "expr", type = MJExpr.class)
public abstract class MJBuiltin extends MJExpr {
    public static abstract class Abs extends MJBuiltin {
        @Specialization
        public int abs(int expr) {
            return Math.abs(expr);
        }
    }
}
