package pjCalcTest;

import com.greenpineyu.fel.FelEngine;

/**
 * 调用静态方法
 * */
public class Test02 {
	public static void main(String[] args){
		
		  //调用Math.min(1,2)
		  System.out.println(FelEngine.instance.eval("$('Math').min(1,2)"));
		  //调用new Foo().toString();
//		  FelEngine.instance.eval("$('com.greenpineyu.test.Foo.new').toString());
	}

}
