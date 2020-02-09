package org.truffle.cs.mj.nodes;

import java.util.ArrayList;
import java.util.List;

import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.VirtualFrame;

public class MJCallable extends MJStatement {
    @Children MJExpr arguments[];
    private RootCallTarget callNode;

    public MJCallable(List<MJExpr> arguments, MJMethod targetNode) {
        super();
        this.callNode = Truffle.getRuntime().createCallTarget(targetNode);
        this.arguments = arguments.toArray(new MJExpr[arguments.size()]);
    }

    public MJExpr[] getArguments() {
        return arguments;
    }

    public void setArguments(List<MJExpr> arguments) {
        this.arguments = arguments.toArray(new MJExpr[arguments.size()]);
    }

    @Override
    public Object execute(VirtualFrame frame) {
        List<Object> result = new ArrayList<>();
        for (MJExpr arg : arguments) {
            result.add(arg.execute(frame));
        }
        return this.callNode.call(result.toArray());
    }

}
