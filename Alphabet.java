import java.util.*;
// This class specializes in using methods to manipulate a user input string in the constructor. TSome methods are used to determine specific letter characteristics (which letter? consonant? where in the word?
//relation to surrounding letters?). Other methods are used to change the letter arrangments/compositions in the words accordingly. Each methods purpose will be defined at the method header.
/*Program takes sentences with only words and spaces and puts each word into a list, and displays separated words. For each word, it asks for part of speech, and
 * conjugates each word appropriately, displaying the final translated sentence. In all parts of speech except for adjectives, the first letter is shifted to the next consonant.
 * Change 1st letter to next consonant. Verbs add to end: indicative(-eh), deverbal(-ehma), imperfect(-ehla), preterite(-ehle), past perfect(-ehli), present perfect(-ehlo),
 * command(-ehya), conditional(-ehbo), future(-ehba), future perfect(-ehbu) Adjectives add -ek, shift first letter 2 consonants. Nouns add -um.  Special(Dingo = fingum).
 * Adverb add -ta. Conjunction/Prepostition add -uj. Interjections only shift the first letter consonant.
 */
//Authors: Rahul Arun and Varun Ganesh
//Version 1.1
public class Alphabet
{
    private String x;//word
    private boolean check = true;// boolean comparison for ease of use
    public Alphabet(String a)//constructor
    {
        x=a;

    }

    public String last()// returns last letter in word
    {
        int end = x.length();
        int end2 = x.length()-1;
        return x.substring(end2, end);
    }

    public String first()//returns first letter in word
    {
        return x.substring(0,1);
    }

    public boolean isCons()//determines if the first letter in the word is a consonant
    {
        if(!first().equalsIgnoreCase("a") && !first().equalsIgnoreCase("e") && !first().equalsIgnoreCase("i")  && !first().equalsIgnoreCase("o") && !first().equalsIgnoreCase("u"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isConsWithString(String b)//determines if a specific letter input is a consonant (2 methods with same purpose to achieve same goal for different inputs available)
    {
        if(!b.equalsIgnoreCase("a") && !b.equalsIgnoreCase("e") && !b.equalsIgnoreCase("i")  && !b.equalsIgnoreCase("o") && !b.equalsIgnoreCase("u"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String changeV()// conjugates verbs
    {
        String temp;
        if(first().equalsIgnoreCase("a"))
        {
            temp = x.substring(0,x.length());
            x = "b"+temp;
            if(isConsWithString(last()) == check)
            {
               
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }

        else if(first().equalsIgnoreCase("b"))
        {
            temp = x.substring(1,x.length());
            x = "c"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("c"))
        {
            temp = x.substring(1,x.length());
            x = "d"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("d"))
        {
            temp = x.substring(1,x.length());
            x = "f"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }

        }
        else if(first().equalsIgnoreCase("e"))
        {
            temp = x.substring(0,x.length());
            x = "f"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("f"))
        {
            temp = x.substring(1,x.length());
            x = "g"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("g"))
        {
            temp = x.substring(1,x.length());
            x = "h"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("h"))
        {
            temp = x.substring(1,x.length());
            x = "j"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("i"))
        {
            temp = x.substring(0,x.length());
            x = "j"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("j"))
        {
            temp = x.substring(1,x.length());
            x = "k"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("k"))
        {
            temp = x.substring(1,x.length());
            x = "l"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("l"))
        {
            temp = x.substring(1,x.length());
            x = "m"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("m"))
        {
            temp = x.substring(1,x.length());
            x = "n"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("n"))
        {
            temp = x.substring(1,x.length());
            x = "p"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("o"))
        {
            temp = x.substring(0,x.length());
            x = "p"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("p"))
        {
            temp = x.substring(1,x.length());
            x = "q"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("q"))
        {
            temp = x.substring(1,x.length());
            x = "r"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("r"))
        {
            temp = x.substring(1,x.length());
            x = "s"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("s"))
        {
            temp = x.substring(1,x.length());
            x = "t"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("t"))
        {
            temp = x.substring(1,x.length());
            x = "v"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("u"))
        {
            temp = x.substring(0,x.length());
            x = "v"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("v"))
        {
            temp = x.substring(1,x.length());
            x = "w"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("w"))
        {
            temp = x.substring(1,x.length());
            x = "x"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("x"))
        {
            temp = x.substring(1,x.length());
            x = "y"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("y"))
        {
            temp = x.substring(1,x.length());
            x = "z"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("z"))
        {
            temp = x.substring(1,x.length());
            x = "b"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="eh";
            }
        }
        return x;
    }
    //*
    public String changeA()//conjugates adjectives
    {
        String temp;
        if(first().equalsIgnoreCase("a"))
        {
            temp = x.substring(0,x.length()-1);
            x = "c"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }

        else if(first().equalsIgnoreCase("b"))
        {
            temp = x.substring(1,x.length());
            x = "d"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("c"))
        {
            temp = x.substring(1,x.length());
            x = "f"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("d"))
        {
            temp = x.substring(1,x.length());
            x = "g"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("e"))
        {
            temp = x.substring(0,x.length()-1);
            x = "g"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("f"))
        {
            temp = x.substring(1,x.length());
            x = "h"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("g"))
        {
            temp = x.substring(1,x.length());
            x = "j"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("h"))
        {
            temp = x.substring(1,x.length());
            x = "k"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("i"))
        {
            temp = x.substring(0,x.length()-1);
            x = "k"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("j"))
        {
            temp = x.substring(1,x.length());
            x = "l"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("k"))
        {
            temp = x.substring(1,x.length());
            x = "m"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("l"))
        {
            temp = x.substring(1,x.length());
            x = "n"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("m"))
        {
            temp = x.substring(1,x.length());
            x = "p"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("n"))
        {
            temp = x.substring(1,x.length());
            x = "q"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("o"))
        {
            temp = x.substring(0,x.length()-1);
            x = "q"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("p"))
        {
            temp = x.substring(1,x.length());
            x = "r"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("q"))
        {
            temp = x.substring(1,x.length());
            x = "s"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("r"))
        {
            temp = x.substring(1,x.length());
            x = "t"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("s"))
        {
            temp = x.substring(1,x.length());
            x = "v"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("t"))
        {
            temp = x.substring(1,x.length());
            x = "w"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("u"))
        {
            temp = x.substring(0,x.length()-1);
            x = "w"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("v"))
        {
            temp = x.substring(1,x.length());
            x = "x"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("w"))
        {
            temp = x.substring(1,x.length());
            x = "y"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("x"))
        {
            temp = x.substring(1,x.length());
            x = "z"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("y"))
        {
            temp = x.substring(1,x.length());
            x = "b"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("z"))
        {
            temp = x.substring(1,x.length());
            x = "c"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length()-1);
                x+="ek";
            }
        }
        return x;
    }

    

    public String changeN()//conjugates nouns
    {
        String temp;
        if(x.equalsIgnoreCase("dingo"))
        {
            x = "fingum";
        }
        else
        {
            if(first().equalsIgnoreCase("a"))
            {
                temp = x.substring(0,x.length());
                x = "b"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }

            else if(first().equalsIgnoreCase("b"))
            {
                temp = x.substring(1,x.length());
                x = "c"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("c"))
            {
                temp = x.substring(1,x.length());
                x = "d"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("d"))
            {
                temp = x.substring(1,x.length());
                x = "f"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("e"))
            {
                temp = x.substring(0,x.length());
                x = "f"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("f"))
            {
                temp = x.substring(1,x.length());
                x = "g"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("g"))
            {
                temp = x.substring(1,x.length());
                x = "h"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("h"))
            {
                temp = x.substring(1,x.length());
                x = "j"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("i"))
            {
                temp = x.substring(0,x.length());
                x = "j"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("j"))
            {
                temp = x.substring(1,x.length());
                x = "k"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("k"))
            {
                temp = x.substring(1,x.length());
                x = "l"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("l"))
            {
                temp = x.substring(1,x.length());
                x = "m"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("m"))
            {
                temp = x.substring(1,x.length());
                x = "n"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("n"))
            {
                temp = x.substring(1,x.length());
                x = "p"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("o"))
            {
                temp = x.substring(0,x.length());
                x = "p"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("p"))
            {
                temp = x.substring(1,x.length());
                x = "q"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("q"))
            {
                temp = x.substring(1,x.length());
                x = "r"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("r"))
            {
                temp = x.substring(1,x.length());
                x = "s"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("s"))
            {
                temp = x.substring(1,x.length());
                x = "t"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("t"))
            {
                temp = x.substring(1,x.length());
                x = "v"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("u"))
            {
                temp = x.substring(0,x.length());
                x = "v"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("v"))
            {
                temp = x.substring(1,x.length());
                x = "w"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("w"))
            {
                temp = x.substring(1,x.length());
                x = "x"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("x"))
            {
                temp = x.substring(1,x.length());
                x = "y"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("y"))
            {
                temp = x.substring(1,x.length());
                x = "z"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("z"))
            {
                temp = x.substring(1,x.length());
                x = "b"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length()-1);
                    x+="um";
                }
            }
        }
        return x;
    }

    public String separate()//separates all non-fluid consonants in the word with the closest vowel in the word, or a default vowel if no such vowel exists, this is normaly performed after all conjugation has occured.
    {
        String test = "";
        String k = "";
        List<String> l = new LinkedList<String>();
        for(int i = 1; i<=x.length(); i++)
        {
            l.add(x.substring(i-1,i));
        }
        for(int i = 1; i<l.size(); i++)
        {
            if(isConsWithString(l.get(i-1)) && isConsWithString(l.get(i)))
            {
                if(l.get(i-1).equalsIgnoreCase(l.get(i)))
                {
                    i=i;
                }

                else if(l.get(i-1).equalsIgnoreCase("c") && l.get(i).equalsIgnoreCase("h"))
                {
                    i=i;
                }
                else if(l.get(i-1).equalsIgnoreCase("c") && l.get(i).equalsIgnoreCase("k"))
                {
                    i=i;
                }
                else if(l.get(i-1).equalsIgnoreCase("s") && l.get(i).equalsIgnoreCase("h"))
                {
                    i=i;
                }
                else if(l.get(i-1).equalsIgnoreCase("t") && l.get(i).equalsIgnoreCase("h"))
                {
                    i=i;
                }
                else if(l.get(i-1).equalsIgnoreCase("g") && l.get(i).equalsIgnoreCase("h"))
                {
                    i=i;
                }
                else
                {
                    vowels(i,l);
                }
            }
        }
        for(int i = 0; i<l.size(); i++)
        {
            test+=l.get(i);
        }
        return x=test;
    }

    private void vowels(int a, List<String> l)//determines the correct vowel in the list of vowels to use in seprating specific consonants
    {
        String k = "";
        int m=a+1;
        int x=0;
        int y=0;
        while(m<l.size())//traversing list w/vowels.
        {
            if(!isConsWithString(l.get(m)))
            {
                k=l.get(m);
                m=l.size();

            }
            else
            {

                m++;
            }
        }
        if(k.equals("") && a!=1)//determines correct vowel
        {
            m=a-2;
            while(m>=0)
            {
                if(!isConsWithString(l.get(m)))
                {
                    k=l.get(m);
                    m=-1;
                }
                else
                {

                    m--;
                }
            }

        }
        else if(k.equals(""))//if no such vowel exists
        {
            k = "a";
        }

        l.add(a,k);
    }

    
    public String changeAdverb()//conjugates adverbs
    {
        String y=changeV().substring(0,x.length()-2);
        y+="ta";
        x=y;
        return x;

    }

    public String pronoun()//conjugates specific pronouns
    {
        if (x.equalsIgnoreCase("me") || x.equalsIgnoreCase("my") || x.equalsIgnoreCase("I"))
        {
            return x="ra";
        }
        else if(x.equalsIgnoreCase("you") || x.equalsIgnoreCase("your"))
        {
            return x="va";
        }
        else if (x.equalsIgnoreCase("him") || x.equalsIgnoreCase("her") || x.equalsIgnoreCase("his") || x.equalsIgnoreCase("hers") || x.equalsIgnoreCase("it") || x.equalsIgnoreCase("its") || x.equalsIgnoreCase("that") || x.equalsIgnoreCase("this"))
        {
            return x="da";
        }
        else if (x.equalsIgnoreCase("we") || x.equalsIgnoreCase("us") || x.equalsIgnoreCase("our"))
        {
            return x="sa";
        }
        else if (x.equalsIgnoreCase("them") || x.equalsIgnoreCase("they") || x.equalsIgnoreCase("their") || x.equalsIgnoreCase("those") || x.equalsIgnoreCase("y’all"))
        {
            return x="dada";
        }
        else
        {
            return null;
        }
    }//endmethod
    public String prepConj()//conjugates prepositions and conjunctions
    {
        if(x.equalsIgnoreCase("and"))
        {
            return x="n";
        }
        else if(x.equalsIgnoreCase("a"))
        {
            return x="ba";
        }
        else if(x.equalsIgnoreCase("to"))
        {
            return x="voej";
        }
        else
        {
            String y=changeV(); 
            x=y.substring(0,y.length()-2);
            x+="uj";
            return x;
        }
    }//endmethod

    public String inter()//conjugates idiomatic phrases and interjections (redone in runner class)
    {
        if(x.equalsIgnoreCase("Hello") || x.equalsIgnoreCase("hi"))
        {
            return "ra hereteh va";
        }
        else if(x.equalsIgnoreCase("bye") || x.equalsIgnoreCase("goodbye"))
        {
            return "ra fissemisseh va";
        }
        else if(x.equalsIgnoreCase("please"))
        {
            return "ra cegeh va";
        }
        else if(x.equalsIgnoreCase("oh man"))
        {
            return "oh woman";
        }
        else
        {
            String z="";
            if(!isConsWithString(x.substring(x.length()-1,x.length())))
            {
                z=x.substring(x.length()-1,x.length());
            }
            String y=changeV();
            x=y.substring(0,y.length()-2);
            x+=z;
            return x;
        }//endelse
    }//endmethod
}//endclass




