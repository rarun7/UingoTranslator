
//********************************************************************
//  UingRunner.java       Author: Arun/Ganesh
//Version 1.1
//  Driver to exercise the Alphabet class. This functions in the main method by taking a user sentence input (with only words and spaces), using a LinkedList to store all the words separated, and asks the user for the part of speech (specific) of the
//word to conjugate it correctly into Uingo. Once all translated words are placed (replacing old words) in the list, the words are then printed out again using the correct spaces. Specific idiomatic expressions are hardcoded. Advanced topics used are 
//scanners, linkedlist manipulation, substring manipulation and string traversing, for loops, for each loops, while loops, and exploiting method returns and functionality to apply all necessary changes to a word to fully translate it.
//********************************************************************
import java.util.*;
import java.lang.*;
public class Uingo
{
   //-----------------------------------------------------------------
   //  Reads sentences and translates them into Uingo.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      String word, result,type, another = "y";// another sentence
      Scanner scan = new Scanner (System.in);//user input
      
      
      while (another.equalsIgnoreCase("y"))//for another word
      {
         System.out.println ();
         System.out.println ("Enter a sentence without punctuation or numbers, that is more than 0 letters \n(by reading this statement you agree to follow all rules of this program as stated in this sentence and to enter in only valid parameters, \nviolaters will be prosecuted to the fullest extent of the law):");
         word = scan.nextLine();
         int f=0;
         List<String>l=new LinkedList<String>();// to store words ridding spaces
         while(f<word.length())// separates words by spaces and stores them in lists
         {
            if(word.substring(f,f+1).equals(" "))
            {
                l.add(word.substring(0,f));
                String temp=word.substring(f+1,word.length());
                word=temp;
                f=-1;
            }
             
            f++;
             
            }
            l.add(word);
            
            for(String j:l)//prints separated words to show no words are missing or stuck together
            {
                System.out.println(j);
            }
            for(int i=0;i<l.size();i++)//translating by traversing list*****ALL THE FOLLOWING IF STATEMENTS PROVIDE DIFFERENT TRANSLATIONS BASED ON USER INPUT OF PART OF SPEECH***
            {
    Alphabet a= new Alphabet(l.get(i));
    System.out.println("Word: "+l.get(i));
         System.out.println ("Type 1 if it's a verb, 2 if it's an adjective, 3 if it's noun, 4 if it’s adverb, 5 if it’s a conjunction/preposition, 6 if it’s pronoun, 7 if interjection");
       type=scan.nextLine();
    if(type.equals("1"))
{
    System.out.println("Type 0 if indicative, 1 if deverbal (-ing), 2 if imperfect, 3 if preterite, 4 if past perfect, 5 if present perfect, 6 if command, 7 if conditional, 8 if future, 9 if future perfect");
String type2=scan.nextLine();
 a.changeV();
if(type2.equals("0"))// normal verb conj
{
   l.set(i,a.separate());
    System.out.println(l.get(i));
    
}
if(type2.equals("1"))// if verb ends in ing, and ma
{
    l.set(i,a.separate()+"ma");
    System.out.println(l.get(i));
}
if(type2.equals("2"))// if verb is imperfect, add la
{
    l.set(i,a.separate()+"la");
    System.out.println(l.get(i));

}
if(type2.equals("3"))// if verb is preterite add le
{
    l.set(i,a.separate()+"le");
    System.out.println(l.get(i));
}
if(type2.equals("4"))// if verb is past perfect add li
{
    l.set(i,a.separate()+"li");
    System.out.println(l.get(i));
}
if(type2.equals("5"))// if verb is present perfect add lo
{
l.set(i,a.separate()+"lo");
System.out.println(l.get(i));
}
if(type2.equals("6"))// if verb is command add ya
{
l.set(i,a.separate()+"ya");
    System.out.println(l.get(i));
}
if(type2.equals("7"))// if verb is conditional add bo
{
    l.set(i,a.separate()+"bo");
    System.out.println(l.get(i));
}
if(type2.equals("8"))// if verb is future add ba
{
l.set(i,a.separate()+"ba");
    System.out.println(l.get(i));

}

if(type2.equals("9"))// if verb is future perfect add bu
{
    l.set(i,a.separate()+"bu");
    System.out.println(l.get(i));
}
}
if(type.equals("2"))// conjugates adjectives
{
a.changeA();
l.set(i,a.separate());
System.out.println(l.get(i));
}
if(type.equals("3"))//conjugates nouns (special cases included as a backup)
{
    if(l.get(i).equalsIgnoreCase("dingo"))
    {
        l.set(i,"fingum");
        System.out.println("fingum");
    }
    else
    {
        a.changeN();
        l.set(i,a.separate());
        System.out.println(l.get(i));
}
}
if(type.equals("4"))// conjugates adverbs
{
a.changeAdverb();
l.set(i,a.separate());
System.out.println(l.get(i));
}
if(type.equals("5"))// conjugates prepositions and conjunctions
{
a.prepConj();
l.set(i,a.separate());
System.out.println(l.get(i));
}
if(type.equals("6"))// conjugates pronouns
{
    l.set(i,a.pronoun());
    System.out.println(l.get(i));
}
if(type.equals("7"))// conjugates interjections (special cases included as a back up)
{
    if(l.get(i).equalsIgnoreCase("Hello"))
{
    l.set(i,a.inter());
    System.out.println( "ra hereteh va");
}
else if(l.get(i).equalsIgnoreCase("bye") || word.equalsIgnoreCase("goodbye"))
{
    l.set(i,"ra fissemisseh va");
    System.out.println("ra fissemisseh va");
}
else if(l.get(i).equalsIgnoreCase("please"))
{
    l.set(i,"ra cegeh va");
    System.out.println("ra cegeh va");
}
else if(l.get(i).equalsIgnoreCase("oh man"))
{
    l.set(i,"oh woman");
    System.out.println("oh woman");
}
else
{
a.inter();
l.set(i,a.separate());
System.out.println(l.get(i));
}
}
}

     for(String j:l)//printing final sentence with spaces
            {
                System.out.print(j+" ");    
            }
         System.out.println();
            System.out.println ("Translate another word (y/n)? ");
         another = scan.nextLine();
        
      }
   }
}



