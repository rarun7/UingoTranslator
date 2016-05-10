
//********************************************************************
//  UingRunner.java       Author: Arun/Ganesh
//
//  Driver to exercise the Uingo class.
//********************************************************************
import java.util.*;
public class Uingo2
{
    //-----------------------------------------------------------------
    //  Reads sentences and translates them into Uingo.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        String word, result,type, another = "y";
        Scanner scan = new Scanner (System.in);
        
        
     

        while (another.equalsIgnoreCase("y"))
        {
            List<String> l=new LinkedList<String>();
            System.out.println ();
            System.out.println ("Enter a word:");
            word = scan.nextLine();
            String cheese = "";
            
            for(int i=0;i<word.length();i++)
            {
               
                if(!word.substring(i,i+1).equals(" "))
                {
                   if
                }
                
            }
            Iterator i= l.iterator();
            while(i.hasNext())
            {
            
            
            
           
               
                Alphabet a= new Alphabet((String)i.next());
            System.out.println ("Type 1 if it's a verb, 2 if it's an adjective, 3 if it's noun, 4 if it’s adverb, 5 if it’s a conjunction/preposition, 6 if it’s pronoun, 7 if interjection");
            type=scan.nextLine();
            if(type.equals("1"))
            {
                System.out.println("Type 0 if indicative, 1 if deverbal (-ing), 2 if imperfect, 3 if preterite, 4 if past perfect, 5 if present perfect, 6 if command, 7 if conditional, 8 if future, 9 if future perfect");
                String type2=scan.nextLine();
                a.changeV();
                if(type2.equals("0"))
                {
                    System.out.println(a.separate());
                }
                if(type2.equals("1"))
                {
                    a=new Alphabet(word.substring(0,word.length()-3));
                    System.out.println(a.separate()+"ma");
                }
                if(type2.equals("2"))
                {
                    System.out.println(a.separate()+"la");

                }
                if(type2.equals("3"))
                {
                    System.out.println(a.separate()+"le");
                }
                if(type2.equals("4"))
                {
                    System.out.println(a.separate()+"li");
                }
                if(type2.equals("5"))
                {
                    System.out.println(a.separate()+"lo");
                }
                if(type2.equals("6"))
                {
                    System.out.println(a.separate()+"ya");
                }
                if(type2.equals("7"))
                {
                    System.out.println(a.separate()+"bo");
                }
                if(type2.equals("8"))
                {
                    System.out.println(a.separate()+"ba");

                }

                if(type2.equals("9"))
                {
                    System.out.println(a.separate()+"bu");
                }
            }
            if(type.equals("2"))
            {
                a.changeA();
                System.out.println(a.separate());
            }
            if(type.equals("3"))
            {
                if(a.changeN().equalsIgnoreCase("fingum"))
                {
                    System.out.println("fingum");
                }
                else
                {
                    System.out.println(a.separate());
                }
            }
            if(type.equals("4"))
            {
                a.changeAdverb();
                System.out.println(a.separate());
            }
            if(type.equals("5"))
            {
                a.prepConj();
                System.out.println(a.separate());
            }
            if(type.equals("6"))
            {
                System.out.println(a.pronoun());
            }
            if(type.equals("7"))
            {
                if(word.equalsIgnoreCase("Hello"))
                {
                    System.out.println( "ra hereteh va");
                }
                else if(word.equalsIgnoreCase("bye") || word.equalsIgnoreCase("goodbye"))
                {
                    System.out.println("ra fissemisseh va");
                }
                else if(word.equalsIgnoreCase("please"))
                {
                    System.out.println("ra cegeh va");
                }
                else if(word.equalsIgnoreCase("oh man"))
                {
                    System.out.println("oh woman");
                }
                else
                {
                    a.inter();
                    System.out.println(a.separate());
                }
            
       
        
        }
    }
            System.out.print ("Translate another word/sentence (y/n)? ");
            another = scan.nextLine();
          
            
    }


}}
