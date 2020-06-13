package com.vas.training.designpatterns.behavioral.observer;

public class Main {
	
	public static void main(String[] args) {
		Producer kafkaSoldProductsProducer = new KafkaProducer();
		Consumer kafkaEstoqueConsumer = new KafkaStockConsumer();
		Consumer kafkaBIConsumer = new KafkaBiConsumer();
		kafkaSoldProductsProducer.subscribe(kafkaEstoqueConsumer);
		kafkaSoldProductsProducer.subscribe(kafkaBIConsumer);
		kafkaSoldProductsProducer.broadcast("White T-Shirt");
	}

}
