package com.hotel.app.data;

public class Message {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "Message [text=" + text + "]";
	}
}