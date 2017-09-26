package pjCalcTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.FelContext;

/**
 * 访问数组、集合、Map
 * */
public class Test06 {
	
	public static void main(String[] args){
		
		System.out.println(System.currentTimeMillis());
		FelEngine fel = new FelEngineImpl();
		FelContext ctx = fel.getContext();

		//数组
		int[] intArray = {1,2,3};
		ctx.set("intArray",intArray);
		//获取intArray[0]
		String exp = "intArray[0]";
		System.out.println(exp+"->"+fel.eval(exp));
		System.out.println(System.currentTimeMillis());
		//List
		List<Integer> list = Arrays.asList(1,2,3);
		ctx.set("list",list);
		//获取list.get(0)
		exp = "list[0]";
		System.out.println(exp+"->"+fel.eval(exp));
		System.out.println(System.currentTimeMillis());
		//集合
		Collection<String> coll = Arrays.asList("a","b","c");
		ctx.set("coll",coll);
		//获取集合最前面的元素。执行结果为"a"
		exp = "coll[0]";
		System.out.println(exp+"->"+fel.eval(exp));
		System.out.println(System.currentTimeMillis());
		//迭代器
		Iterator<String> iterator = coll.iterator();
		ctx.set("iterator", iterator);
		//获取迭代器最前面的元素。执行结果为"a"
		exp = "iterator[0]";
		System.out.println(exp+"->"+fel.eval(exp));
		System.out.println(System.currentTimeMillis());
		//Map
		Map<String,String> m = new HashMap<String, String>();
		m.put("name", "HashMap");
		ctx.set("map",m);
		exp = "map.name";
		System.out.println(exp+"->"+fel.eval(exp));
		System.out.println(System.currentTimeMillis());
		//多维数组
		int[][] intArrays= {{11,12},{21,22}};
		ctx.set("intArrays",intArrays);
		exp = "intArrays[0][0]";
		System.out.println(exp+"->"+fel.eval(exp));
		System.out.println(System.currentTimeMillis());
		//多维综合体，支持数组、集合的任意组合。
		List<int[]> listArray = new ArrayList<int[]>();
		listArray.add(new int[]{1,2,3});
		listArray.add(new int[]{4,5,6});
		ctx.set("listArray",listArray);
		exp = "listArray[0][0]";
		System.out.println(exp+"->"+fel.eval(exp));
		System.out.println(System.currentTimeMillis());
	}

}
