package pjCalcTest;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;

/**
 * 算术表达式
 * */
public class Test09 {

	public static void main(String[] args){
		
		System.out.println(System.currentTimeMillis());
		FelEngine fel = new FelEngineImpl();    
		System.out.println(System.currentTimeMillis());
		Object result = fel.eval("5000*12+7500");    
		System.out.println(result);  
		System.out.println(System.currentTimeMillis());
		
	}
}
