package pjCalcTest;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.FelContext;

/**
 * 变量
 * */
public class Test08 {

	public static void main(String[] args){
		
		System.out.println(System.currentTimeMillis());
		FelEngine fel = new FelEngineImpl();
		System.out.println(System.currentTimeMillis());
		FelContext ctx = fel.getContext();    
		ctx.set("单价", 5000);    
		ctx.set("数量", 12);    
		ctx.set("运费", 7500);    
		Object result = fel.eval("单价*数量+运费");    
		System.out.println(result);
		System.out.println(System.currentTimeMillis());
	}
}
