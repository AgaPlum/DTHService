package com;

public class Chanel {
	private int channelId;
	private String channelName;
	private double channelCost;
	private float channelRating;
	private char channelStatus;
	private Category category;
	public Chanel(int channelId, String channelName, double channelCost,
			float channelRating, char channelStatus, Category category) {
		this.channelId = channelId;
		this.channelName = channelName;
		this.channelCost = channelCost;
		this.channelRating = channelRating;
		this.channelStatus = channelStatus;
		this.category = category;
	}
	public Chanel() {
		super();
	}
	public int getChannelId() {
		return channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public double getChannelCost() {
		return channelCost;
	}
	public void setChannelCost(double channelCost) {
		this.channelCost = channelCost;
	}
	public float getChannelRating() {
		return channelRating;
	}
	public void setChannelRating(float channelRating) {
		this.channelRating = channelRating;
	}
	public char getChannelStatus() {
		return channelStatus;
	}
	public void setChannelStatus(char channelStatus) {
		this.channelStatus = channelStatus;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
