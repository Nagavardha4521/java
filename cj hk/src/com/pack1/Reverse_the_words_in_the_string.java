package com.pack1;

/*Develop a program to reverse the words in the string
* 	I/P: How Are You?
* 	O/P: You? Are How
*
* Algorithm to develop above program
*
* 		//"How Are You?"				<- s1
*			//"How" "Are" "You?"		<- s1.split(" "); => String[] words
*
			//"You? "						<- words[i=length()-1]
			//"You? " + "Are "				<- words[i=length()-1] + words[i-1]
			//"You? " + "Are " + "How "		<- words[i=length()-1] + words[i-1] + words[i-2]
			  
		//"You? Are How "			<- s1.trim()
		//"You? Are How"

*/
public class Reverse_the_words_in_the_string
{
	public static void main(String [] args)
	{
		 String s1="How are you?";
		 System.out.println("original string:"+s1);
		 
		 String[] words=s1.split(" ");//["How","are","you"]
		 String resString="";
		 for(int i=words.length-1;i>=0;i--)
		 {
			 resString=resString.concat(words[i]+" ");
		 }
		 resString=resString.trim();
		 System.out.println("reverse string:"+resString);
		 
	}

}
