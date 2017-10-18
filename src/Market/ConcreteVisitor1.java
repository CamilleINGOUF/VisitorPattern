package Market;

import VisitorPattern.IVisitor;

public class ConcreteVisitor1 implements IVisitor 
{
	@Override
	public void visit(ConcreteVisitable1 c) 
	{
		System.out.println("Visitot1 - Visitable1");
	}

	@Override
	public void visit(ConcreteVisitable2 c) 
	{
		System.out.println("Visitot1 - Visitable2");
	}
}
