import java.awt.BorderLayout;
import javax.swing.*;


public class ExpenseTracker {
        int boardWidth = 360;    //Dimensions of the window
        int boardHeight = 540;


        JFrame frame = new JFrame("Expense Tracker App"); //Adds the title


        //Constuctor
        public ExpenseTracker(){
        frame.setVisible(true); //Makes the window visible
        frame.setSize(boardWidth, boardHeight); //Sets the size of the window
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Allows the user to exit the window
        frame.setLayout(new BorderLayout()); //Can place components north, south, east, or west within the window
        
        }

}
