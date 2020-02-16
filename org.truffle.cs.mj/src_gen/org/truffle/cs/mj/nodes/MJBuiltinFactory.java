// CheckStyle: start generated
package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.dsl.GeneratedBy;
import com.oracle.truffle.api.dsl.UnsupportedSpecializationException;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeCost;
import org.truffle.cs.mj.nodes.MJBuiltin;
import org.truffle.cs.mj.nodes.MJExpr;
import org.truffle.cs.mj.nodes.MJBuiltin.Abs;

@GeneratedBy(MJBuiltin.class)
public final class MJBuiltinFactory {

    @GeneratedBy(Abs.class)
    public static final class AbsNodeGen extends Abs {

        @Child private MJExpr expr_;
        @CompilationFinal private int state_;

        private AbsNodeGen(MJExpr expr) {
            this.expr_ = expr;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object exprValue_ = this.expr_.execute(frameValue);
            if (state != 0 /* is-active abs(int) */ && exprValue_ instanceof Integer) {
                int exprValue__ = (int) exprValue_;
                return abs(exprValue__);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(exprValue_);
        }

        private int executeAndSpecialize(Object exprValue) {
            int state = state_;
            if (exprValue instanceof Integer) {
                int exprValue_ = (int) exprValue;
                this.state_ = state = state | 0b1 /* add-active abs(int) */;
                return abs(exprValue_);
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.expr_}, exprValue);
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

        public static Abs create(MJExpr expr) {
            return new AbsNodeGen(expr);
        }

    }
}
