import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import javax.xml.bind.Marshaller.Listener;

import java.awt.event.*;


public class HelloWorld implements ActionListener {
	JTextArea tekst;
	JCheckBox box;
    
    public static void main(String[] args) {
        HelloWorld test = new HelloWorld();
        test.doRoboty();
		System.out.println("Tutaj powinien podswietlić GIT");
		System.out.println("Test Branch");
		
        
    }
    
    public void doRoboty(){
     JFrame ramka = new JFrame();
     JPanel panel = new JPanel();
     String lista[] = {"alfa", "beta", "deta", "cuda", "upa", "yeah", "beta", "deta", "cuda", "upa"};
     JList list = new JList(lista);
     list.addListSelectionListener(new list);
     ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     JButton przycisk = new JButton("Wcisnik mnie");
     przycisk.addActionListener(this);
     tekst = new JTextArea(10,20);
     box = new JCheckBox("Grasz dalej?");
     box.addActionListener(this);
     tekst.setLineWrap(true);
     
     
     JScrollPane przewijanie = new JScrollPane(list);
     
     przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
     przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
     
     panel.add(przewijanie);
     ramka.getContentPane().add(BorderLayout.WEST, box);
     ramka.getContentPane().add(BorderLayout.CENTER, panel);
     ramka.getContentPane().add(BorderLayout.SOUTH, przycisk);
     
    
     ramka.setSize(350, 300);
     ramka.setVisible(true);
    
    }

	@Override
	public void actionPerformed(ActionEvent e) {
	/*	tekst.append("Kuutas \n");
		
		String offOn = "Wylaczone";
		
		if (box.isSelected())
			offOn = "wlaczone";
		System.out.println(offOn);
	}		
*/
		
		if(!e.
		
		}
    }
    
