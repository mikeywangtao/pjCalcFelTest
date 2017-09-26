package pjCalcTest;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.FelContext;

/**
 * 调用JAVA方法
 * */
public class Test05 {

	public static void main(String[] args) {

		System.out.println(System.currentTimeMillis());
		FelEngine fel = new FelEngineImpl();
		FelContext ctx = fel.getContext();
		ctx.set("out", System.out);
		fel.eval("out.println('Hello Everybody'.substring(6))");
		System.out.println(System.currentTimeMillis());
	}
}
