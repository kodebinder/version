package com.company.eg01.mockinstancemethodwithoutpowermockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void start_should_return_true_when_engine_ok() {
		EngineMock engine = new EngineMock();
		engine.setReturnValue(Engine.STARTED_OK);
		Car car = new Car(engine);
		assertTrue(car.start());
	}

}

class EngineMock extends Engine {
	private int code;

	public void setReturnValue(int value) {
		code = value;
	}

	@Override
	public int start() {
		return code;
	}
}
