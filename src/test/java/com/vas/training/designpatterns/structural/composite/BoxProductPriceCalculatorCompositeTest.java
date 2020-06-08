package com.vas.training.designpatterns.structural.composite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BoxProductPriceCalculatorCompositeTest {

	@DisplayName("An empty box should have total price 0.0")
	@Test
	void TotalValue_OfEmptyBox_ShouldBeZero() {
		Box box = new Box();
		assertEquals(0.0d, box.calculate());
	}

	@DisplayName("A box with 2 products with prices 2 and 3, should have total price 5.0")
	@Test
	void TotalValue_OfBox_ShouldBe5() {
		Box box = new Box();
		box.getProducts().add(new Product("pencil", 2));
		box.getProducts().add(new Product("pen", 3));
		assertEquals(5.0d, box.calculate());
	}

	@DisplayName("A box with two boxes:"
			+ " one with 2 products with prices 2 and 3,"
			+ " and another with 3 products with prices 1, 7 and 4"
			+ " should have total price 17.0")
	@Test
	void TotalValue_OfBigBoxWIthTwoOtherBoxes_ShouldBe17() {
		Box smallBox1 = new Box();
		smallBox1.getProducts().add(new Product("pencil", 2));
		smallBox1.getProducts().add(new Product("pen", 3));
		Box smallBox2 = new Box();
		smallBox2.getProducts().add(new Product("eraser", 1));
		smallBox2.getProducts().add(new Product("notebook", 7));
		smallBox2.getProducts().add(new Product("scisors", 4));
		Box box = new Box();
		box.getBoxes().add(smallBox1);
		box.getBoxes().add(smallBox2);
		assertEquals(17.0d, box.calculate());
	}

	@DisplayName("A box with two boxes:"
			+ " one with 2 products with prices 2 and 3,"
			+ " and another with 3 products with prices 1, 7 and 4"
			+ " and two other loose products with prices 5 and 6"
			+ " should have total price 17.0")
	@Test
	void TotalValue_OfBigBoxWIthTwoOtherBoxesAnd2LooseProducts_ShouldBe28() {
		Box smallBox1 = new Box();
		smallBox1.getProducts().add(new Product("pencil", 2));
		smallBox1.getProducts().add(new Product("pen", 3));
		Box smallBox2 = new Box();
		smallBox2.getProducts().add(new Product("eraser", 1));
		smallBox2.getProducts().add(new Product("notebook", 7));
		smallBox2.getProducts().add(new Product("scisors", 4));
		Box box = new Box();
		box.getBoxes().add(smallBox1);
		box.getBoxes().add(smallBox2);
		box.getProducts().add(new Product("case", 5));
		box.getProducts().add(new Product("Calculator", 6));
		assertEquals(28.0d, box.calculate());
	}

}
