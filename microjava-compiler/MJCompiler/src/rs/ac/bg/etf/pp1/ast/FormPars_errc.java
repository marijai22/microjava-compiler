// generated with ast extension for cup
// version 0.8
// 19/7/2025 19:14:4


package rs.ac.bg.etf.pp1.ast;

public class FormPars_errc extends FormPars {

    public FormPars_errc () {
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
        buffer.append("FormPars_errc(\n");

        buffer.append(tab);
        buffer.append(") [FormPars_errc]");
        return buffer.toString();
    }
}
