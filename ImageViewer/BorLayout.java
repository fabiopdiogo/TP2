import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ImageViewer is the main class of the image viewer application. It builds
 * and displays the application GUI and initialises all other components.
 * 
 * To start the application, create an object of this class.
 * 
 * @author Michael Kolling and David J Barnes 
 * @version 0.1
 */
public class BorLayout
 implements ActionListener

{
    JFrame frame = new JFrame();
    JButton btn1 = new JButton("NORTH");
    JButton btn2 = new JButton("SOUTH");
    JButton btn3 = new JButton("CENTER");
    JButton btn4 = new JButton("WEST");
    JButton btn5 = new JButton("EAST");
    
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        
        if(command.equals("Open")){
           openFile();
        }
        else if(command.equals("Quit")){
           quit();
        }
        else if(command.equals("Save")){
           saveFile();
        }
        else if(command.equals("Quit")){
           quit();
        }
    }   
    
    /**
     * Create an ImageViewer show it on screen.
     */
    public BorLayout()
    {
        frame.setLayout(new BorderLayout());
        frame.add(btn1,BorderLayout.NORTH);
        frame.add(btn2,BorderLayout.SOUTH);
        frame.add(btn3,BorderLayout.CENTER);
        frame.add(btn4,BorderLayout.WEST);
        frame.add(btn5,BorderLayout.EAST);
               
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }   
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
        
            public void run(){
                new BorLayout();
            }           
            
        });
    }
        
    private void makeMenuBar(){
                
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){openFile();}
            
        });        
        
        btn1.addActionListener(this); 
        
    }
    
    /*
    private void makeMenuBar(){
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        JMenu fileMenu = new JMenu("File"); 
        menubar.add(fileMenu);        
        
        JMenu helpMenu = new JMenu("Help"); 
        menubar.add(helpMenu); 
        
        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){openFile();}
            
        });
        fileMenu.add(openItem);
            
        JMenuItem saveItem = new JMenuItem("Save");
        fileMenu.add(saveItem);
        
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){quit();}
             
        });
        fileMenu.add(quitItem);              
        
        JMenuItem aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);
        
        openItem.addActionListener(this); 
        saveItem.addActionListener(this); 
        quitItem.addActionListener(this);
    }
    */
   
    private void openFile(){
         System.out.println("Open event from openItem has been triggered");
    }
    
    private void saveFile(){
        System.out.println("Quit event from saveItem has been triggered");
    }
    
    private void quit(){
        System.out.println("Quit event from quitItem has been triggered");
    }
    
    private void help(){
        System.out.println("Quit event from aboutItem has been triggered");
    }

}
