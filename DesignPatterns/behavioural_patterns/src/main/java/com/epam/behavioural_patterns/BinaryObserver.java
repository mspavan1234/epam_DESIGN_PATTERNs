package com.epam.behavioural_patterns;

public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	public BinaryObserver(javax.security.auth.Subject subject) {
	}

	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}

}
