// 2. �Ѻ���͹��ʡ�� �������ѧ��� ����������� ���͹��ʡ������С����
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
		JOptionPane.showMessageDialog(null,"Your name is : " + name,"Results",JOptionPane.PLAIN_MESSAGE); // �ʴ��Ţ�ͤ�������Ѻ�����
		
	      int count = 0;
	      for (int i = 0; i < name.length(); i++) 
	      {
	         if(name.charAt(i) == 'A' || name.charAt(i) == 'a' || 
	        	name.charAt(i) == 'E' || name.charAt(i) == 'e' ||
	            name.charAt(i) == 'I' || name.charAt(i) == 'i' || 
	            name.charAt(i) == 'O' || name.charAt(i) == 'o' ||  
	            name.charAt(i) == 'U' || name.charAt(i) == 'u' ) 
	         {
	            count++; // �ӡ�ùѺ������� A E I O U 
	         }
	      }	
	      
	      JOptionPane.showMessageDialog(null,"Number of AEIOU = " + count,"Results",JOptionPane.PLAIN_MESSAGE); // �ʴ��ӹǹ��з��Ѻ��������㹵���� count
	   }
	}


