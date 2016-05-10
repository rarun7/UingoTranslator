import java.util.*;
public class Alphabet2
{
    private String x;
    private boolean check = true;
    public Alphabet2(String a)
    {
        x=a;

    }

    public String last()
    {
        int end = x.length()-1;
        int end2 = x.length()-2;
        return x.substring(end2, end);
    }

    public String first()
    {
        return x.substring(0,1);
    }

    public boolean isCons()
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

    public boolean isConsWithString(String b)
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

    public String changeV()
    {
        String temp;
        if(first().equalsIgnoreCase("a"))
        {
            temp = x.substring(1,x.length());
            x = "b"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="eh";
            }
            else
            {
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("d"))
        {
            temp = x.substring(1,x.length());
            x = "f"+temp;

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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
                x+="eh";
            }
        }
        else if(first().equalsIgnoreCase("t"))
        {
            temp = x.substring(1,x.length());
            x = "v"+temp;
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
                x+="eh";
            }
        }
        return x;
    }
    //*
    public String changeA()
    {
        String temp;
        if(first().equalsIgnoreCase("a"))
        {
            temp = x.substring(0,x.length());
            x = "c"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("e"))
        {
            temp = x.substring(0,x.length());
            x = "g"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("i"))
        {
            temp = x.substring(0,x.length());
            x = "k"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("o"))
        {
            temp = x.substring(0,x.length());
            x = "q"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
                x+="ek";
            }
        }
        else if(first().equalsIgnoreCase("u"))
        {
            temp = x.substring(0,x.length());
            x = "w"+temp;
            if(isConsWithString(last()) == check)
            {
                x+="ek";
            }
            else
            {
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
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
                x = x.substring(0,x.length());
                x+="ek";
            }
        }
        return x;
    }

    public String test()
    {
        if(isConsWithString(last()) == check)
        {
            x+="um";
        }
        else
        {
            x = x.substring(0,x.length());
            x+="um";
        }
        return x;
    }

    public String changeN()
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("i"))
            {
                temp = x.substring(1,x.length());
                x = "j"+temp;
                if(isConsWithString(last()) == check)
                {
                    x+="um";
                }
                else
                {
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
                    x+="um";
                }
            }
            else if(first().equalsIgnoreCase("t"))
            {
                temp = x.substring(1,x.length());
                x = "v"+temp;
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
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
                    x = x.substring(0,x.length());
                    x+="um";
                }
            }
        }
        return x;
    }

    public String separate()
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
        return test;
    }

    private void vowels(int a, List<String> l)
    {
        String k = "";
        int m=a+1;
        int x=0;
        int y=0;
        while(m<l.size())
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
        if(k.equals("") && a!=1)
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
        else if(k.equals(""))
        {
            k = "a";
        }

        l.add(a,k);
    }

    
    public String changeAdverb()
    {
        String y=changeV().substring(0,x.length()-2);
        y+="ta";
        x=y;
        return x;

    }

    public String pronoun()
    {
        if (x.equalsIgnoreCase("me") || x.equalsIgnoreCase("my"))
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
    public String prepConj()
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
            x=y.substring(y.length()-2,y.length());
            x+="uj";
            return x;
        }
    }//endmethod

    public String inter()
    {
        if(x.equalsIgnoreCase("Hello"))
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
            x=y.substring(y.length()-2,y.length());
            x+=z;
            return x;
        }//endelse
    }//endmethod
}//endclass




