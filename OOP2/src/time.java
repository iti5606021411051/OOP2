
	import java.io.*;
	import javax.swing.JOptionPane;
	import java.util.*;
	public class time 
	{
		int S,M,H,D;
		public void getData()
		{
			S = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Time","Input",JOptionPane.QUESTION_MESSAGE));
		}
		public void Calc()
		{
			M = S / 60;
			S = S % 60;
			
			H = M / 60;
			M = M % 60;
			
			D = H/24;
			H = H % 24;
		}
		public void Print()
		{
			
			JOptionPane.showMessageDialog(null,"Time \nDay\nHour\nMin\nSec\n "+D+":"+H+":"+M+":"+S,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		public static void main(String[] args) 
		{
			time t1 = new time();
			t1.getData();
			t1.Calc();
			t1.Print();
		}

	}
