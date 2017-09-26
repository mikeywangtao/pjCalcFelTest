package pjCalcTest;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.ContextChain;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.context.MapContext;

/**
 * 多层上下文环境（命名空间）
 * */
public class Test04 {

	public static void main(String[] args){
		
		System.out.println(System.currentTimeMillis());
		FelEngine fel = new FelEngineImpl();   
		String costStr = "成本";   
		String priceStr="价格";   
		FelContext baseCtx = fel.getContext();   
		//父级上下文中设置成本和价格   
		baseCtx.set(costStr, 50);   
		baseCtx.set(priceStr,100);   
		   
		String exp = priceStr+"-"+costStr;   
		Object baseCost = fel.eval(exp);   
		System.out.println("期望利润：" + baseCost);   
		   
		FelContext ctx = new ContextChain(baseCtx, new MapContext());   
		//通货膨胀导致成本增加（子级上下文 中设置成本，会覆盖父级上下文中的成本）   
		ctx.set(costStr,50+20 );   
		Object allCost = fel.eval(exp, ctx);   
		System.out.println("实际利润：" + allCost); 
		System.out.println(System.currentTimeMillis());
	}
}
