package dk.dtu.compute.course02324.mini_java.model;

import dk.dtu.compute.course02324.mini_java.semantics.ProgramVisitor;

public class PrintStatement implements SimpleStatement {

    public final Expression expression;
    public final String stringLit;

    public PrintStatement(String stringLit, Expression expression){
        this.stringLit = stringLit;
        this.expression = expression;
    }
    @Override
    public void accept(ProgramVisitor visitor) {
        visitor.visit(this);
    }
}
