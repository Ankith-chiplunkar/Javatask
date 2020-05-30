package com.ITO.Assign2.one;

public class NumberToWords {
	
	static String singledigit[]= {"", "one ", "two ", "three ", "four ", 
			"five ", "six ", "seven ", "eight ", 
			"nine ", "ten ", "eleven ", "twelve ", 
			"thirteen ", "fourteen ", "fifteen ", 
			"sixteen ", "seventeen ", "eighteen ", 
			"nineteen "};
	static String tenmultiple[]= { "", "", "twenty ", "thirty ", "fourty ", 
			"fifty ", "sixty ", "seventy ", "eighty ", 
			"ninety "};

	public static void main(String[] args) {
		int number = 1000000;
		System.out.println(convert(number));

	}

	 public static String convert(int number) {
		String output="";
		
		if(number==0) {
			return "zero";
			}
		if(number>100000000 || number<0) {
			return "please enter the number between 0-100000000";
		}
		output=output + numtowords((int)(number/10000000),"crore ");
		output=output + numtowords((int)((number/100000)%100), "lakh ");
		output=output + numtowords((int)((number/1000)%100),"thousand ");
		output=output + numtowords((int)((number/100)%10), "hundred ");
		output=output + numtowords((int)(number%100), " ");
		return output;
	}

	 	static String numtowords(int i, String string) {
		String st="";
		if(i>19) {
			st=st+ tenmultiple[i/10]+ singledigit[i%10];
		}
		else {
			st=st+ singledigit[i];
			}
		if(i!=0) {
			st=st+ string;
		}
		return st;
	}
	 	

}
