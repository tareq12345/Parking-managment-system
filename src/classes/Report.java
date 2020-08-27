
package classes;


import java.io.Serializable;
import java.util.ArrayList;


import java.util.ArrayList;

public class Report implements Serializable {
    
    int NoOfCustomers;
    int Payment;
    
    private final String ReportsFile = "Reports.bin";
    
    ArrayList<Report> Reports = new ArrayList<>();
    
    FileBinaryManager FManger = new FileBinaryManager();
    
    
    public void View(){
        
    }
    public void loadFromFile(){
    	Reports = (ArrayList<Report>) FManger.read(ReportsFile);
    }
    
    public boolean commitToFile(){
        return FManger.write(ReportsFile, Reports);
    }
    
    public boolean AddReport(){
        //loadFromFile();
	Reports.add(this);
	return commitToFile();
    }
    
}

