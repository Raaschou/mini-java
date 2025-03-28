package dk.dtu.compute.course02324.mini_java.model;

import dk.dtu.compute.course02324.mini_java.semantics.ProgramVisitor;

public class PrintStatement implements SimpleStatement {

    String literal;
    Expression expression;

    public PrintStatement(String literal, Expression expression) {
        this.literal = literal;
        this.expression = expression;
    }

    public String getLiteral() {
        return literal;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void accept(ProgramVisitor visitor) {
        visitor.visit(this);
    }
}
