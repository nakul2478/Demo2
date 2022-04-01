package com.example.SpringBootDemoProject;

public class Item {
	int ItemNo;
	String ItemName;
	public Item(int itemNo, String itemName) {
		super();
		ItemNo = itemNo;
		ItemName = itemName;
	}
	public int getItemNo() {
		return ItemNo;
	}
	public void setItemNo(int itemNo) {
		ItemNo = itemNo;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	
	
}
