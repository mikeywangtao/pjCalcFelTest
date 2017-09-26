package pjCalcTest;

import java.util.Random;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.parser.FelNode;

public class Test00 {
	public static void main(String[] args) {
		System.out.println("hello world!");

		Random random = new Random();
		Object result = null;
		long time = System.nanoTime();
		for (int i = 0; i < 200000000; i++) {
			result = random.nextInt(1000) * random.nextInt(1000) + random.nextInt(1000);
		}
		System.out.println(((float) (System.nanoTime() - time) / 1000000) + "ms");

		FelEngine fel1 = new FelEngineImpl();
		FelContext ctx1 = fel1.getContext();
		time = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			ctx1.set("a", random.nextInt(1000));
			ctx1.set("b", random.nextInt(1000));
			ctx1.set("c", random.nextInt(1000));
			result = fel1.eval("a * b + c");
		}
		System.out.println(((float) (System.nanoTime() - time) / 1000000) + "ms");

		FelEngine fel2 = new FelEngineImpl();
		FelNode node = fel2.parse("a * b + c");
		FelContext ctx2 = fel2.getContext();
		time = System.nanoTime();
		for (int i = 0; i < 200000000; i++) {
			ctx2.set("a", random.nextInt(1000));
			ctx2.set("b", random.nextInt(1000));
			ctx2.set("c", random.nextInt(1000));
			result = node.eval(ctx2);
		}
		System.out.println(((float) (System.nanoTime() - time) / 1000000) + "ms");

		FelEngine fel3 = new FelEngineImpl();
		Expression exp = fel3.parse("a * b + c");
		FelContext ctx3 = fel3.getContext();
		time = System.nanoTime();
		for (int i = 0; i < 200000000; i++) {
			ctx3.set("a", random.nextInt(1000));
			ctx3.set("b", random.nextInt(1000));
			ctx3.set("c", random.nextInt(1000));
			result = exp.eval(ctx3);
		}
		System.out.println(((float) (System.nanoTime() - time) / 1000000) + "ms");
	}

}
