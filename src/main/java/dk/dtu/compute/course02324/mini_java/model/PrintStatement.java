package dk.dtu.compute.course02324.mini_java.model;

import dk.dtu.compute.course02324.mini_java.semantics.ProgramVisitor;

public class PrintStatement implements SimpleStatement {

   /* Statement statement;

    public PrintStatement(Statement statement) {
        this.statement = statement;
    }
*/
 /*   public String getLiteral() {
        return literal;
    }

    public Expression getExpression() {
        return expression;
    }*/
    public void println(Statement statement) {
        System.out.println("test: " + statement.toString());
    }

    @Override
    public void accept(ProgramVisitor visitor) {
        visitor.visit(this);
    }
}
