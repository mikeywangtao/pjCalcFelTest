package pjCalcTest;

import java.util.HashMap;
import java.util.Map;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.FelContext;

/**
 * 访问对象属性
 * */
public class Test07 {
	
	public static void main(String[] args){
		
		System.out.println(System.currentTimeMillis());
		FelEngine fel = new FelEngineImpl();
		FelContext ctx = fel.getContext();
		Foo foo = new Foo();
		ctx.set("foo", foo);
		Map<String,String> m = new HashMap<String,String>();
		m.put("ElName", "fel");
		ctx.set("m",m);
		        
		//调用foo.getSize()方法。
		Object result = fel.eval("foo.size");
		System.out.println("foo.size : " + result);
		System.out.println(System.currentTimeMillis());

		//调用foo.isSample()方法。
		result = fel.eval("foo.sample");
		System.out.println("foo.sample : " + result);
		System.out.println(System.currentTimeMillis());
		                
		//foo没有name、getName、isName方法
		//foo.name会调用foo.get("name")方法。
		result = fel.eval("foo.name");
		System.out.println("foo.name : " + result);
		System.out.println(System.currentTimeMillis());
		                
		//m.ElName会调用m.get("ElName");
		result = fel.eval("m.ElName");
		System.out.println("m.ElName : " + result);
		System.out.println(System.currentTimeMillis());
	}

}

