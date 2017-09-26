package pjCalcTest;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.FelContext;

/**
 * 编译执行
 * */
public class Test03 {
	
	public static void main(String[] args){
		System.out.println(System.currentTimeMillis());
		FelEngine fel = new FelEngineImpl();   
		FelContext ctx = fel.getContext();   
		ctx.set("单价", 5000);   
		ctx.set("数量", 12);   
		ctx.set("运费", 7500);   
		Expression exp = fel.compile("单价*数量+运费",ctx);   
		Object result = exp.eval(ctx);   
		System.out.println(result);  
		System.out.println(System.currentTimeMillis());
	}

}
