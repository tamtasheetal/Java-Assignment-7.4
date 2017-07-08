package StrngHandling;
//This java file is inside package named StrngHandling inside src folder.
	import java.util.*;       
//importing all classes from java's util library.
	
	public class Anagrams
	{
		
		private static void stringPermutation(String prefString, String originalString)
		{
			int stringLength = originalString.length();     
		//This int variable will store the length of original string.
			
			if(stringLength == 0)   
				System.out.println(prefString);     
			else          
			{
				for(int i = 0 ; i < stringLength ; i++)
				{
					 
					stringPermutation(prefString + originalString.charAt(i), originalString.substring(0,i) + originalString.substring(i+1,stringLength));
		//Original String size reduces by one and prefString size increases by one character.
				}
			}
		} 
//End of String Function.
		
		public static void main(String[] args)       
	  //main function declaration. 
		{
			Scanner sc=new Scanner(System.in);       
			
			System.out.print("This is a Example of String Handling :- \n\n");   
			
			for(int i = 0 ; i < 10 ; i++)
			{
				System.out.print("Please Enter String : ");
				String inputString = sc.next();      
				char[] charArray = inputString.toCharArray();    
		  //This will create character array out of String.
				
				Arrays.sort(charArray);   
				
				String stringToPermute = new String(charArray);   
				
				System.out.println("All anagrams of String "+inputString+" are :");    
				stringPermutation("",stringToPermute);     
				//String is paased.
				
				System.out.println("");      
			}   
			
			sc.close();   
			
		}   
	
	}    

