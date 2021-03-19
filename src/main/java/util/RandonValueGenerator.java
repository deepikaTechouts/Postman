package util;

import java.util.Random;

import org.springframework.web.servlet.DispatcherServlet;

public class RandonValueGenerator {

	
	
	public static long generateRandom(int length) {
	    Random random = new Random();
	    char[] digits = new char[length];
	    digits[0] = (char) (random.nextInt(9) + '1');
	    for (int i = 1; i < length; i++) {
	        digits[i] = (char) (random.nextInt(10) + '0');
	    }
	    System.out.println(Long.parseLong(new String(digits)));
	    return Long.parseLong(new String(digits));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=12;
		//RandonValueGenerator obj=new RandonValueGenerator();
		//obj.generateRandom(num);
		
		
		
		
		
		
		
		
		
	}

}
