// generated with ast extension for cup
// version 0.8
// 19/7/2025 19:14:4


package rs.ac.bg.etf.pp1.ast;

public class Statement_cn extends Statement {

    public Statement_cn () {
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
        buffer.append("Statement_cn(\n");

        buffer.append(tab);
        buffer.append(") [Statement_cn]");
        return buffer.toString();
    }
}
