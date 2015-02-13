import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
    
public class StatistiekenView extends JPanel implements ActionListener
{
	private GridLayout statistiekenVeld = new GridLayout(7, 1); 
	int[] statistieken; 
	DobbelsteenModel d;
	int worpen;
	JTextArea[] gegevens;
    
	public StatistiekenView()
	{
		this.setLayout(statistiekenVeld);
	    
	    statistieken = new int[6];
	    for(int i=0; i<6; i++){
	    	statistieken[i]=0;
	    }
	    
	    gegevens = new JTextArea[7];
	    for (int i = 0; i<7; i++){
	    	gegevens[i] = new JTextArea("");
	    	add(gegevens[i]);
	    }
	 
	}
	
	public void actionPerformed( ActionEvent e )
	{
	    d = (DobbelsteenModel) e.getSource();
	    int waarde = d.getWaarde();
	    worpen++;
	    statistieken[waarde-1] += 1;
	    
	    gegevens[0].setText(getWorpen() + " Worpen"); 
	    for (int i = 0; i<7; i++){
	    	if (i==0){
	    		gegevens[i].setText(getWorpen() + " Worpen");
	    	} else {
	    		gegevens[i].setText(i + ": " + statistieken[i-1] + " keer");
	    	}
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
