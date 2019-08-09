package practice.algo.datastructure;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "ashish";  
	    String str2 = "hsihsa";  
	    if (areAnagram(str1, str2))  
	        System.out.println("The two strings are anagram of each other");  
	    else
	        System.out.println("The two strings are not anagram of each other"); 
	}
	
	static boolean areAnagram(String str1, String str2)  
	{  
	    if (str1.length() != str2.length())  
	    {  
	        return false;  
	    }  
	  
	    int value = 0;  
	  
	    for (int i = 0; i < str1.length(); i++)  
	    {  
	        value = value ^ (int) str1.charAt(i);  
	        value = value ^ (int) str2.charAt(i);  
	    }  
	  
	    return value == 0;  
	  
	}

}
