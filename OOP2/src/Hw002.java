// 2. รับชื่อนามสกุล เป็นภาษาอังกฤษ แล้วมาเช็คว่า ชื่อนามสกุลมีสระกี่ตัว
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Hw002 
{
	public static void main(String[] args) 
	{
		String name;
		Scanner n = new Scanner(System.in);
		name = JOptionPane.showInputDialog("Enter name : ");
		name = n.nextLine();
		JOptionPane.showMessageDialog(null,"Your name is : " + name,"Results",JOptionPane.PLAIN_MESSAGE); // แสดงผลข้อความที่รับเข้ามา
		
	      int count = 0;
	      for (int i = 0; i < name.length(); i++) 
	      {
	         if(name.charAt(i) == 'A' || name.charAt(i) == 'a' || 
	        	name.charAt(i) == 'E' || name.charAt(i) == 'e' ||
	            name.charAt(i) == 'I' || name.charAt(i) == 'i' || 
	            name.charAt(i) == 'O' || name.charAt(i) == 'o' ||  
	            name.charAt(i) == 'U' || name.charAt(i) == 'u' ) 
	         {
	            count++; // ทำการนับเมื่อเป็น A E I O U 
	         }
	      }	
	      
	      JOptionPane.showMessageDialog(null,"Number of AEIOU = " + count,"Results",JOptionPane.PLAIN_MESSAGE); // แสดงจำนวนสระที่นับและเก็บไว้ในตัวแปร count
	   }
	}


