package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.ast.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;

public class CounterParams extends VisitorAdaptor {

	List<Struct> finalActualParams;
	
	Stack<List<Struct>> actualParams = new Stack<>();
	
	@Override
	public void visit(ActParNewList actParNewList) {
		actualParams.push(new ArrayList<>());
	}
	
	@Override
	public void visit(Param param) {
		actualParams.peek().add(param.getExpr().struct);
	}
	
	@Override
	public void visit(ParamsAct_rec paramsAct_rec) {
		finalActualParams = actualParams.pop(); // svaki put ubacujemo poslednje napravljenu; poslednji put ce se ubaciti prva lista
	}
	
	@Override
	public void visit(ParamsAct_e paramsAct_e) {
		finalActualParams = actualParams.pop(); 
	}
}
