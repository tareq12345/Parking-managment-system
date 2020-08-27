/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Customer implements Serializable {
            String UserName;
            String Pass;
	    public int ParkingMoney;
	    public int Cid,Cplate,CSpot;
	    Date Exit;
	    Ticket CustomerTicket;
            Report NewReport = new Report();
	    
	    // ARRAY LIST TO STORE CUTOMERS
	    ArrayList<Customer> Customers = new ArrayList<>();
            private final String CustomersFile = "Customers.bin";
	    // FILE PATH TO WRITE TO.
	    
	    FileBinaryManager FManger = new FileBinaryManager();
            public  Customer(){
                
            }
	    // CONSTROCTOR OF THE CLASS
	    public  Customer(int id,int plate){
	    	Cid = id;
	    	Cplate = plate;
                CSpot = EntryStation.AdiviceCustomer();
	    }

	    // ADD(MAKE) A NEW TICKET AND PRINT THE TICKET TO THE SCREEN
	    public void Print(int id,int plate){
                 NewReport.NoOfCustomers++;
                 Customer new_cusromer = new Customer(id,plate);
                 //Admin a = new Admin();
                 NewReport.AddReport() ;
                 new_cusromer.AddCustomer();
                 CustomerTicket = new Ticket(id, plate, EntryStation.AdiviceCustomer());
                 CustomerTicket.AddTicket(); 
                //System.out.println("ID: " + CustomerTicket.Tid +"Plate" + CustomerTicket.Tplate);
	    }

	    // ASK THE USER FOR PAYMENT AND DELETE THE TICKET FROM THE FILE
	    public boolean Pay(int id){
	        ParkingMoney = CalculateMoneyPerHour(id);
                NewReport.Payment = NewReport.Payment + ParkingMoney;
                //NewReport.AddReport();
	        if (CustomerTicket.DeleteTicket(id));
	            return true;
	    }

	    // CALCULATE THE HOURS SPENT IN THE PARKING
	    // 	BY ENTERING THE ID
	    public int CalculateMoneyPerHour(int id){
	        Exit = new Date();
            //  int hours =Integer.parseInt(hour);
	        int HourOfEnter = CustomerTicket.getTicketHoursById(id);
	        int MinuteOfEnter = CustomerTicket.getTicketMinutesById(id);
                SimpleDateFormat Hours = new SimpleDateFormat("hh");
                SimpleDateFormat Minutes = new SimpleDateFormat("mm");
                int hour = Integer.parseInt(Hours.format(Exit));
                int minute = Integer.parseInt(Minutes.format(Exit));
	        return (hour - HourOfEnter) + (minute - MinuteOfEnter);
	    }
	    
	   
	        // READ ARRAY LIST FROM FILE
	    public void loadFromFile(){
	    	Customers = (ArrayList<Customer>) FManger.read(CustomersFile);
	    }
	    
	    // WRITE ARRAY LIST TO FILE
	    public boolean commitToFile(){
	        return FManger.write(CustomersFile, Customers);
	    }
    // ADD CUSTOMER TO ARRAY LSIT AND SAVE IT TO FILE
	    public boolean AddCustomer(){
	    	loadFromFile();
	    	Customers.add(this);
	        return commitToFile();

	    }
	    
	    // DELETE CUSTOMER FROM ARRAYLIST AND FROM FILE
	    public boolean DelteCustomer(int id){
	    	loadFromFile();
	        int index = getCustomerIndex(id);
	        if (index != - 1)
	            {
	        		Customers.remove(index);
	                return commitToFile();
	            }
	        return false;
	        }
	    
	    // GET CUSTOMER INDEX IN ARRAY LSIT BY ID
	    public int getCustomerIndex(int id){
  
	    	for (int i = 0; i < Customers.size();i++){
	            if (Customers.get(i).Cid == id)
	                   return i;
	           }
	           return - 1;
	    }

	    
	    // SEARCH CUSTOMER IN ARRAY LSIST BY ID
	    public String SerachCustomer(int id){
	    	loadFromFile();
	    	int index = getCustomerIndex(id);
	    	
	    	if (index != - 1)
	    		return "\nFound : " + Customers.get(index).toString();
	    	else 
	    		return "\n not found";

	    }
            // CONVERT CUSTOMER DATA TO A STRING
            public boolean login(String userName, String Pass){
                loadFromFile();
                for (Customer x:Customers){
                    if (userName.equals(x.Cid) && Pass.equals(x.Cplate)){
                        return true;
                    }
                }
                return false;
            }
            
            public boolean SignUp(String userName, String Pass,int Plate){
                loadFromFile();
                return true;
            }
            public void getCustomerSpot(int id){
                loadFromFile();
                int index = getCustomerIndex(id);
                EntryStation.Spots[Customers.get(index).CSpot] = 0;
            }
            @Override
	    public String toString() {
	    	return "\nCid : " + Cid + "\t" + "Cplate:" + Cplate + "\n";
	    	
	    }
            
}
