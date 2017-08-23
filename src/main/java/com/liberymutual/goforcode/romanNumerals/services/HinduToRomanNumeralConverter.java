package com.liberymutual.goforcode.romanNumerals.services;

import java.util.ArrayList;

public class HinduToRomanNumeralConverter {
	
//	private int numberToConvert;
//	private String romanNumeral;
//	private int numberToConvertDigits;
	//ArrayList al;
	// private int numberToConvert;
	public HinduToRomanNumeralConverter() {

	}
	
	
	 public String convert(int number) {
		
		 String rn = "";
		 
		 if (number >= 10 && number < 20) {
		 rn += "X";
		 number = number - 10;
		 } 
		 if (number >= 20 && number < 30) {
			 rn += "XX";
			 number = number - 20;
		 }
		 if (number >= 30 && number < 40) {
			 rn += "XXX";
			 number = number - 30;
		 }
		 
		 if (number >= 40 && number < 50) {
			 rn += "XL";
			 number = number - 40;
		 }
		 
		 if (number >= 50 && number < 60) {
			 rn += "L";
			 number = number - 50;
		 }
		 
		 if (number >= 60 && number < 70) {
			 rn += "LX";
			 number = number - 60;
		 }
		 
		 if (number >= 70 && number < 80) {
			 rn += "LXX";
			 number = number - 70;
		 }
		 if (number >= 80 && number < 90) {
			 rn += "LXXX";
			 number = number - 80;
		 }
		 if (number >= 90 && number < 100) {
			 rn += "XC";
			 number = number - 90;
		 }
		 
		 if (number >= 100 && number < 110) {
			 rn += "C";
			 number = number - 100;
		 }
		 if (number >= 110 && number < 120) {
			 rn += "CX";
			 number = number - 110;
		 }
		 
		switch (number) {
			case 1:  rn += "I";
			break;
			case 2:  rn += "II";
			break;
			case 3:  rn += "III";
			break;
			case 4:  rn += "IV";
			break;
			case 5:  rn += "V";
			break;
			case 6:  rn += "VI";
			break;
			case 7:  rn += "VII";
			break;
			case 8:  rn += "VIII";
			break;
			case 9:  rn += "IX";
			break;
			}
			return rn;
	 }
}

	 
	 



      
	
