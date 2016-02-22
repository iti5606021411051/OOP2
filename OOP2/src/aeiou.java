import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class aeiou
{
	int a,e,i,o,u;
	public String getData()
	{
		String sara = JOptionPane.showInputDialog(null,"Enter 'AEIOU' : ","InputData",JOptionPane.QUESTION_MESSAGE);
		sara = sara.toUpperCase();
		return sara;
	}
public void Calc (String sara)
	{
		a=e=i=o=u= 0;
	for (int i = 0; i < sara.length(); i++) 
    {
		if(sara.charAt(i) == 'a') 
		{
			a=a+1;
		}else if(sara.charAt(i) == 'e')
      	{
			e=e+1;
      	}else if(sara.charAt(i) == 'i')
        {
      		i=i+1; 
        }else if(sara.charAt(i) == 'o') 
        {
        	o=o+1;
        }else if(sara.charAt(i) == 'u')
        {
        	u=u+1;
        }
    }	
}
	

public void Print()
	{
	JOptionPane.showMessageDialog(null,"Number   'AEIOU'\n" +"=======================================\n"+"A    >>   "+a+"\nE    >>   "+e+"\nI     >>   "+i+"\nO   >>   "+o+"\nU   >>   "+u+"\n==============End Program==============\n","Message",JOptionPane.PLAIN_MESSAGE);
	}

public static void main(String[] args) 
	{
		String name;
		aeiou n = new aeiou();	
		name = n.getData();
		n.Calc(name);
		n.Print();
	}
}