package com.vas.training.designpatterns.behavioral.visitor;

import java.util.List;

public interface Visitor {

	void visit(EnglishPerson person);

	void visit(BrazilianPerson person);

	void visit(GermanPerson person);

	List<String> getTravellingDiary();

}
