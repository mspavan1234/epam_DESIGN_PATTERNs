package com.epam.behavioural_patterns;

public class ObserverPatternDemo {
    public void demo() {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(20);
		System.out.println("Second state change: 10");
		subject.setState(30);
	}

}
