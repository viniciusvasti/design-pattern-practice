package com.vas.training.designpatterns.behavioral.observer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConsumerObserverTest {

	@DisplayName("Observers (Consumers) should be notified by Observable (Producers) when new message is broadcasted")
	@Test
	void test() {
		Producer kafkaSoldProductsProducer = new KafkaProducer();
		Consumer kafkaEstoqueConsumer = new KafkaStockConsumer();
		Consumer kafkaBIConsumer = new KafkaBiConsumer();
		kafkaSoldProductsProducer.subscribe(kafkaEstoqueConsumer);
		kafkaSoldProductsProducer.subscribe(kafkaBIConsumer);
		kafkaSoldProductsProducer.broadcast("White T-Shirt");
		assertEquals(1, kafkaBIConsumer.getNumberOfProcessdMessages());
		assertEquals(1, kafkaEstoqueConsumer.getNumberOfProcessdMessages());
	}

}
