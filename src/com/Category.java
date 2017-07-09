package com;

public class Category {
private int categoryId;
private String categoryName;
private String categoryDesc;

public Category(int categoryId, String categoryName, String categoryDesc) {
	this.categoryId = categoryId;
	this.categoryName = categoryName;
	this.categoryDesc = categoryDesc;

}
public Category() {
	super();
}


public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getCategoryDesc() {
	return categoryDesc;
}
public void setCategoryDesc(String categoryDesc) {
	this.categoryDesc = categoryDesc;
}


}
