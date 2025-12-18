// generated with ast extension for cup
// version 0.8
// 19/7/2025 19:14:4


package rs.ac.bg.etf.pp1.ast;

public class Condition_err extends Condition {

    public Condition_err () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Condition_err(\n");

        buffer.append(tab);
        buffer.append(") [Condition_err]");
        return buffer.toString();
    }
}
