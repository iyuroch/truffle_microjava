// CheckStyle: start generated
package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.dsl.GeneratedBy;
import com.oracle.truffle.api.dsl.UnsupportedSpecializationException;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeCost;
import org.truffle.cs.mj.nodes.MJBinary;
import org.truffle.cs.mj.nodes.MJExpr;
import org.truffle.cs.mj.nodes.MJBinary.AddOp;
import org.truffle.cs.mj.nodes.MJBinary.DiffOp;
import org.truffle.cs.mj.nodes.MJBinary.DivOp;
import org.truffle.cs.mj.nodes.MJBinary.MulOp;
import org.truffle.cs.mj.nodes.MJBinary.RemOp;

@GeneratedBy(MJBinary.class)
public final class MJBinaryFactory {

    @GeneratedBy(AddOp.class)
    public static final class AddOpNodeGen extends AddOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private AddOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active add(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return add(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private int executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active add(int, int) */;
                    return add(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static AddOp create(MJExpr x, MJExpr y) {
            return new AddOpNodeGen(x, y);
        }

    }
    @GeneratedBy(DiffOp.class)
    public static final class DiffOpNodeGen extends DiffOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private DiffOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active diff(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return diff(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private int executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active diff(int, int) */;
                    return diff(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static DiffOp create(MJExpr x, MJExpr y) {
            return new DiffOpNodeGen(x, y);
        }

    }
    @GeneratedBy(MulOp.class)
    public static final class MulOpNodeGen extends MulOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private MulOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active diff(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return diff(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private int executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active diff(int, int) */;
                    return diff(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static MulOp create(MJExpr x, MJExpr y) {
            return new MulOpNodeGen(x, y);
        }

    }
    @GeneratedBy(DivOp.class)
    public static final class DivOpNodeGen extends DivOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private DivOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active diff(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return diff(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private int executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active diff(int, int) */;
                    return diff(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static DivOp create(MJExpr x, MJExpr y) {
            return new DivOpNodeGen(x, y);
        }

    }
    @GeneratedBy(RemOp.class)
    public static final class RemOpNodeGen extends RemOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private RemOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active diff(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return diff(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private int executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active diff(int, int) */;
                    return diff(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static RemOp create(MJExpr x, MJExpr y) {
            return new RemOpNodeGen(x, y);
        }

    }
}
