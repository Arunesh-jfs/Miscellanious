package com.fruits.model;

public class Groffers {
	int fruitId;
	String fruitNmame;
	float fruitPrice;
	
	public Groffers(int fruitId, String fruitNmame, float fruitPrice) {
		super();
		this.fruitId = fruitId;
		this.fruitNmame = fruitNmame;
		this.fruitPrice = fruitPrice;
	}
	public int getFruitId() {
		return fruitId;
	}
	public void setFruitId(int fruitId) {
		this.fruitId = fruitId;
	}
	public String getFruitNmame() {
		return fruitNmame;
	}
	public void setFruitNmame(String fruitNmame) {
		this.fruitNmame = fruitNmame;
	}
	public float getFruitPrice() {
		return fruitPrice;
	}
	public void setFruitPrice(float fruitPrice) {
		this.fruitPrice = fruitPrice;
	}
	
	
}
