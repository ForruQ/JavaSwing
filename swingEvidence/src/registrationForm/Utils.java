
package registrationForm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class Utils {
    public static void writeToFile(String fileName, List<Student> students) {
        File destFile = new File (fileName + ".txt");
        try {
            if(destFile.exists()== false) {
                System.out.println("We Have to create a file");
                destFile.createNewFile();
                
            }
           PrintWriter out = new PrintWriter(new FileWriter(fileName + ".txt"));
            for (Student s : students) {
                out.append(s.getSerial() + ", " + s.getName() + ", " + s.getEmail() + ", " + s.getGender() + ", " + s.getHobby() + ", " + s.getRound() + "\n");
           
            }
            out.close();
        } catch (Exception e) {
        }
    }
 public static void display(String fileName, DefaultTableModel model){
     String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName+".txt"));
            while((line = reader.readLine()) != null) {
                model.addRow(line.split(", "));
            }
            reader.close();
        } catch (Exception e) {
        }
     
 }
}
