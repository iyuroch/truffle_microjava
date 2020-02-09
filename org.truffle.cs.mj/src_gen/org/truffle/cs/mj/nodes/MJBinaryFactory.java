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
import org.truffle.cs.mj.nodes.MJBinary.AndOp;
import org.truffle.cs.mj.nodes.MJBinary.DiffOp;
import org.truffle.cs.mj.nodes.MJBinary.DivOp;
import org.truffle.cs.mj.nodes.MJBinary.EOp;
import org.truffle.cs.mj.nodes.MJBinary.GEOp;
import org.truffle.cs.mj.nodes.MJBinary.GOp;
import org.truffle.cs.mj.nodes.MJBinary.LEOp;
import org.truffle.cs.mj.nodes.MJBinary.LOp;
import org.truffle.cs.mj.nodes.MJBinary.MulOp;
import org.truffle.cs.mj.nodes.MJBinary.NEOp;
import org.truffle.cs.mj.nodes.MJBinary.OrOp;
import org.truffle.cs.mj.nodes.MJBinary.RemOp;

@GeneratedBy(MJBinary.class)
public final class MJBinaryFactory {

    @GeneratedBy(OrOp.class)
    public static final class OrOpNodeGen extends OrOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private OrOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active or(boolean, boolean) */ && xValue_ instanceof Boolean) {
                boolean xValue__ = (boolean) xValue_;
                if (yValue_ instanceof Boolean) {
                    boolean yValue__ = (boolean) yValue_;
                    return or(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Boolean) {
                boolean xValue_ = (boolean) xValue;
                if (yValue instanceof Boolean) {
                    boolean yValue_ = (boolean) yValue;
                    this.state_ = state = state | 0b1 /* add-active or(boolean, boolean) */;
                    return or(xValue_, yValue_);
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

        public static OrOp create(MJExpr x, MJExpr y) {
            return new OrOpNodeGen(x, y);
        }

    }
    @GeneratedBy(AndOp.class)
    public static final class AndOpNodeGen extends AndOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private AndOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active and(boolean, boolean) */ && xValue_ instanceof Boolean) {
                boolean xValue__ = (boolean) xValue_;
                if (yValue_ instanceof Boolean) {
                    boolean yValue__ = (boolean) yValue_;
                    return and(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Boolean) {
                boolean xValue_ = (boolean) xValue;
                if (yValue instanceof Boolean) {
                    boolean yValue_ = (boolean) yValue;
                    this.state_ = state = state | 0b1 /* add-active and(boolean, boolean) */;
                    return and(xValue_, yValue_);
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

        public static AndOp create(MJExpr x, MJExpr y) {
            return new AndOpNodeGen(x, y);
        }

    }
    @GeneratedBy(LOp.class)
    public static final class LOpNodeGen extends LOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private LOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active less(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return less(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active less(int, int) */;
                    return less(xValue_, yValue_);
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

        public static LOp create(MJExpr x, MJExpr y) {
            return new LOpNodeGen(x, y);
        }

    }
    @GeneratedBy(GOp.class)
    public static final class GOpNodeGen extends GOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private GOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active greater(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return greater(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active greater(int, int) */;
                    return greater(xValue_, yValue_);
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

        public static GOp create(MJExpr x, MJExpr y) {
            return new GOpNodeGen(x, y);
        }

    }
    @GeneratedBy(EOp.class)
    public static final class EOpNodeGen extends EOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private EOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active equal(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return equal(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active equal(int, int) */;
                    return equal(xValue_, yValue_);
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

        public static EOp create(MJExpr x, MJExpr y) {
            return new EOpNodeGen(x, y);
        }

    }
    @GeneratedBy(LEOp.class)
    public static final class LEOpNodeGen extends LEOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private LEOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active lessequal(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return lessequal(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active lessequal(int, int) */;
                    return lessequal(xValue_, yValue_);
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

        public static LEOp create(MJExpr x, MJExpr y) {
            return new LEOpNodeGen(x, y);
        }

    }
    @GeneratedBy(GEOp.class)
    public static final class GEOpNodeGen extends GEOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private GEOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active greaterequal(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return greaterequal(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active greaterequal(int, int) */;
                    return greaterequal(xValue_, yValue_);
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

        public static GEOp create(MJExpr x, MJExpr y) {
            return new GEOpNodeGen(x, y);
        }

    }
    @GeneratedBy(NEOp.class)
    public static final class NEOpNodeGen extends NEOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private NEOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active notequal(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return notequal(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active notequal(int, int) */;
                    return notequal(xValue_, yValue_);
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

        public static NEOp create(MJExpr x, MJExpr y) {
            return new NEOpNodeGen(x, y);
        }

    }
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
