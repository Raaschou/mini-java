package dk.dtu.compute.course02324.mini_java.model;

import dk.dtu.compute.course02324.mini_java.semantics.ProgramVisitor;

public class PrintStatement implements SimpleStatement {

    Statement println;

    public void println(Statement println) {
        this.println = println;

    }

    @Override
    public void accept(ProgramVisitor visitor) {
        visitor.visit(this);
    }
}
