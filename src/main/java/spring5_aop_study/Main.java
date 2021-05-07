package spring5_aop_study;

import spring5_aop_study.aop.Calculator;
import spring5_aop_study.aop.ExeTimeCalculator;
import spring5_aop_study.aop.ImpeCalculator;
import spring5_aop_study.aop.RecCalculator;

public class Main {

	public static void main(String[] args) {
		int num = 5;
		
//		test01(num);
		
		
		// 프록시로 출력형식을 currentTimeMillis() or nanoTime() 으로 변경할 수 있다.
		long result = 0;
		ExeTimeCalculator impeCalculator = new ExeTimeCalculator(new ImpeCalculator());
		result = impeCalculator.factorial(num);
		System.out.printf("%d! = %d%n", num, result);
		
		ExeTimeCalculator recCalculator = new ExeTimeCalculator(new RecCalculator());
		result = recCalculator.factorial(num);
		System.out.printf("%d! = %d%n", num, result);
	}

	private static void test01(int num) {
		long res;
//		long start;
//		long end;
		Calculator impeCal = new ImpeCalculator();
//		start = System.currentTimeMillis();
		res = impeCal.factorial(num);
//		end = System.currentTimeMillis();
		
//		System.out.printf("ImpeCalculator.factorial(%d) 실행시간 = %d%n", num, (end - start));
		System.out.printf("%d! = %d%n", num, res);
		
		Calculator recCal = new RecCalculator();
//		start = System.currentTimeMillis();
		res = recCal.factorial(num);
//		end = System.currentTimeMillis();
		
//		System.out.printf("RecCalculator.factorial(%d) 실행시간 = %d%n", num, (end - start));
		System.out.printf("%d! = %d%n", num, res);
	}
}
