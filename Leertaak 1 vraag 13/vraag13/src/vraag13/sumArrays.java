package vraag13;

import java.util.Random;

public class sumArrays {
	
	int[] a;
	int[] b;
	int[] answer;
	
	public sumArrays(){}
	
	public void sum(int[] c, int[] d){
		a = new int[c.length];
		b = new int[d.length];
		
		for (int i=0; i<c.length; i++){
			this.a[i] = c[i];
		}
		for (int i=0; i<d.length; i++){
			this.b[i] = d[i];
		}
		
		try {
			if (a.length != b.length){
				throw new ArraySizeException();
			} 
			
			answer = new int[a.length];
			String text ="";
			text += "[";
			for (int i=0; i<a.length; i++){
				answer[i]=a[i]+b[i];
				if (i!=0){
					text += " ";
				}
				text += answer[i];
				if (i<(a.length-1)){
					text+= ",";
				}
			}
			text += "]";
			System.out.println(text);
			
		} catch (ArraySizeException e) {
			e.errorMessage("De arrays zijn niet aan elkaar gelijk. De eerste array bevat " + a.length + " getal(len) en de tweede array bevat " + b.length + " getal(len).");
		}
	}
	
	public static void main(String[] args){
		sumArrays calculator = new sumArrays();
		Random randomInt = new Random();
		
		int[] c = new int[randomInt.nextInt(3) + 1];
		int[] d = new int[randomInt.nextInt(3) + 1];
		for (int i = 0; i<c.length; i++){
			c[i]=randomInt.nextInt(10);
		}
		for (int i = 0; i<d.length; i++){
			d[i]=randomInt.nextInt(10);
		}
		calculator.sum(c, d);
	}
}
