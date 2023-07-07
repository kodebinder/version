package com.company.javaeightfeatures.nashornjavascriptengine;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ClientTester {

	public static void main(String[] args) throws FileNotFoundException, NoSuchMethodException {

		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");

		try {
			engine.eval(new FileReader("demo1.js"));
			Invocable invocable = (Invocable) engine;

			Object result = invocable.invokeFunction("fun1", "Sean Murphy");
			System.out.println(result);
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}

}
