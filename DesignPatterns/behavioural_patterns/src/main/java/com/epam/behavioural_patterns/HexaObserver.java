package com.epam.behavioural_patterns;

public class HexaObserver extends Observer{
    public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	public HexaObserver(javax.security.auth.Subject subject) {
	}

	@Override
	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
	}

}
