package com.vas.training.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Tourist implements Visitor {

	private List<String> travellingDiary = new ArrayList<String>();

	@Override
	public void visit(EnglishPerson person) {
		String whatIDid = "Drank " + person.offerVisitorADrink() + " in English home";
		travellingDiary.add(whatIDid);
	}

	@Override
	public void visit(BrazilianPerson person) {
		String whatIDid = "Drank " + person.offerVisitorADrink() + " in Brazilian home";
		travellingDiary.add(whatIDid);
	}

	@Override
	public void visit(GermanPerson person) {
		String whatIDid = "Drank " + person.offerVisitorADrink() + " in German home";
		travellingDiary.add(whatIDid);
	}

	public List<String> getTravellingDiary() {
		return travellingDiary;
	}

}
