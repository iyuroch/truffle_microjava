package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;

@NodeChild(value = "x", type = MJExpr.class)
@NodeChild(value = "y", type = MJExpr.class)
public abstract class MJBinary extends MJExpr {
    public static abstract class AddOp extends MJBinary {
        @Specialization
        public int add(int x, int y) {
            return x + y;
        }
    }

    public static abstract class DiffOp extends MJBinary {
        @Specialization
        public int diff(int x, int y) {
            return x - y;
        }
    }

    public static abstract class MulOp extends MJBinary {
        @Specialization
        public int diff(int x, int y) {
            return x * y;
        }
    }

    public static abstract class DivOp extends MJBinary {
        @Specialization
        public int diff(int x, int y) {
            return x / y;
        }
    }

    public static abstract class RemOp extends MJBinary {
        @Specialization
        public int diff(int x, int y) {
            return x % y;
        }
    }
}