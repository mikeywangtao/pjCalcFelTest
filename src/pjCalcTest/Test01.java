package pjCalcTest;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.common.FelBuilder;
/**
 * 大数值计算功能
 * */
public class Test01 {

	public static void main(String[] args) {
		FelEngine fel = FelBuilder.bigNumberEngine();
		String input = "111111111111111111111111111111+22222222222222222222222222222222";
		Object value = fel.eval(input);
		Object compileValue = fel.compile(input, fel.getContext()).eval(fel.getContext());
		System.out.println("大数值计算（解释执行）:" + value);
		System.out.println("大数值计算（编译执行）:" + compileValue);

	}
}
