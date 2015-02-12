import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
    
public class StatistiekenView extends JPanel implements ActionListener
{
	private JTextArea statistiekenVeld = new JTextArea(); 
	private final static String newline = "\n";
	int[] statistieken; 
	DobbelsteenModel d;
	int worpen;
    
	public StatistiekenView()
	{
	    this.setLayout(new FlowLayout());
	    this.add(statistiekenVeld);
	    statistieken = new int[6];
	    for(int i=0; i<6; i++){
	    	statistieken[i]=0;
	    	System.out.println(statistieken[i]);
	    }
	}
	
	public void actionPerformed( ActionEvent e )
	{
	    d = (DobbelsteenModel) e.getSource();
	    int waarde = d.getWaarde();
	    worpen++;
	    statistieken[waarde-1] += 1;
	    
	    statistiekenVeld.setText("");
	    statistiekenVeld.append(getWorpen() + " Worpen" + newline); 
	    for (int i = 0; i<6; i++){
	    	statistiekenVeld.append(i+1 + ": " + statistieken[i] + " keer" + newline);
	    }
	}
	
	public Dimension getPreferredSize()
	{
	    return new Dimension(70,50);
	} 
	
	/* @return int totaal aantal worpen
	 */
	public int getWorpen(){
		return worpen;
	}
}
