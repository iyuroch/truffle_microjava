package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;

@NodeChild(value = "x", type = MJExpr.class)
@NodeChild(value = "y", type = MJExpr.class)
public abstract class MJBinary extends MJExpr {
    public static abstract class OrOp extends MJBinary {
        @Specialization
        public boolean or(boolean x, boolean y) {
            return x || y;
        }
    }

    public static abstract class AndOp extends MJBinary {
        @Specialization
        public boolean and(boolean x, boolean y) {
            return x && y;
        }
    }

    public static abstract class LOp extends MJBinary {
        @Specialization
        public boolean less(int x, int y) {
            return x < y;
        }
    }

    public static abstract class GOp extends MJBinary {
        @Specialization
        public boolean greater(int x, int y) {
            return x > y;
        }
    }

    public static abstract class EOp extends MJBinary {
        @Specialization
        public boolean equal(int x, int y) {
            return x == y;
        }
    }

    public static abstract class LEOp extends MJBinary {
        @Specialization
        public boolean lessequal(int x, int y) {
            return x <= y;
        }
    }

    public static abstract class GEOp extends MJBinary {
        @Specialization
        public boolean greaterequal(int x, int y) {
            return x >= y;
        }
    }

    public static abstract class NEOp extends MJBinary {
        @Specialization
        public boolean notequal(int x, int y) {
            return x != y;
        }
    }

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