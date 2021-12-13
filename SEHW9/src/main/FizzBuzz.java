package main;

public class FizzBuzz {
	
	public String convertNumber(int number) {
		if(number%5==0) {
			if(number%7==0) {
				return"FizzBuzz";
			}else {
				return"Fizz";
			}
		}else if(number%7==0){
			return "Buzz";
		}
		return "";
	}
}
