package com.java.training;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExpression {
	
	   private static final String REGEX = "Abi";
	   private static final String INPUT = "Abirami";
	   private static Pattern pattern;
	   private static Matcher matcher;

	   public static void main( String args[] ) {
	      pattern = Pattern.compile(REGEX);
	      matcher = pattern.matcher(INPUT);

	      System.out.println("Current REGEX is: "+REGEX);
	      System.out.println("Current INPUT is: "+INPUT);

	      System.out.println("lookingAt(): "+matcher.lookingAt());
	      System.out.println("matches(): "+matcher.matches());
	   }
	}


