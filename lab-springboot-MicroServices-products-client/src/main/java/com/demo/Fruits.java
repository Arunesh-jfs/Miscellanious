package com.demo;

public class Fruits {
	public String fruitId;
	public String fruitName;
	
	public Fruits(String productId, String productName) {
		super();
		this.fruitId = productId;
		this.fruitName = productName;
	}
	public String getFruitId() {
		return fruitId;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitId(String productId) {
		this.fruitId = fruitId;
	}
	public void setFruitName(String productName) {
		this.fruitName = fruitName;
	}
	@Override
	public String toString() {
		return "Fruits [fruitId=" + fruitId + ", fruitName="
				+ fruitName + "]";
	}
}
