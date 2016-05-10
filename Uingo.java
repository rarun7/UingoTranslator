
//********************************************************************
//  UingRunner.java       Author: Arun/Ganesh
//
//  Driver to exercise the Uingo class.
//********************************************************************
import java.util.*;
public class Uingo
{
   //-----------------------------------------------------------------
   //  Reads sentences and translates them into Pig Latin.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      String word, result,type, another = "y";
      Scanner scan = new Scanner (System.in);
      
      
      while (another.equalsIgnoreCase("y"))
      {
         System.out.println ();
         System.out.println ("Enter a sentence:");
         word = scan.nextLine();
         int f=0;
         List<String>l=new LinkedList<String>();
         while(f<word.length())
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
            
            for(String j:l)
            {
                System.out.println(j);
            }
            for(int i=0;i<l.size();i++)
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
if(type2.equals("0"))
{
   l.set(i,a.separate());
    System.out.println(l.get(i));
    
}
if(type2.equals("1"))
{
    l.set(i,a.separate()+"ma");
    System.out.println(l.get(i));
}
if(type2.equals("2"))
{
    l.set(i,a.separate()+"la");
    System.out.println(l.get(i));

}
if(type2.equals("3"))
{
    l.set(i,a.separate()+"le");
    System.out.println(l.get(i));
}
if(type2.equals("4"))
{
    l.set(i,a.separate()+"li");
    System.out.println(l.get(i));
}
if(type2.equals("5"))
{
l.set(i,a.separate()+"lo");
System.out.println(l.get(i));
}
if(type2.equals("6"))
{
l.set(i,a.separate()+"ya");
    System.out.println(l.get(i));
}
if(type2.equals("7"))
{
    l.set(i,a.separate()+"bo");
    System.out.println(l.get(i));
}
if(type2.equals("8"))
{
l.set(i,a.separate()+"ba");
    System.out.println(l.get(i));

}

if(type2.equals("9"))
{
    l.set(i,a.separate()+"bu");
    System.out.println(l.get(i));
}
}
if(type.equals("2"))
{
a.changeA();
l.set(i,a.separate());
System.out.println(l.get(i));
}
if(type.equals("3"))
{
    if(a.changeN().equalsIgnoreCase("fingum"))
    {
        l.set(i,"fingum");
        System.out.println("fingum");
    }
    else
    {
        l.set(i,a.separate());
        System.out.println(l.get(i));
}
}
if(type.equals("4"))
{
a.changeAdverb();
l.set(i,a.separate());
System.out.println(l.get(i));
}
if(type.equals("5"))
{
a.prepConj();
l.set(i,a.separate());
System.out.println(l.get(i));
}
if(type.equals("6"))
{
    l.set(i,a.pronoun());
    System.out.println(l.get(i));
}
if(type.equals("7"))
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

     for(String j:l)
            {
                System.out.print(j+" ");    
            }
         System.out.println();
            System.out.println ("Translate another word (y/n)? ");
         another = scan.nextLine();
        
      }
   }
}



