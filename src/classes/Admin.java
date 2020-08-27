/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Ramy
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class Admin extends person{
    	    ArrayList<Customer> Customers = new ArrayList<>();
            private final String CustomersFile = "Customers.bin";
            FileBinaryManager FManger = new FileBinaryManager();
            String UserName;
            String AdminPass;


     // READ ARRAY LIST FROM FILE
	    public void loadFromFile(){
	    	Customers = (ArrayList<Customer>) FManger.read(CustomersFile);
	    }
	    
	    // WRITE ARRAY LIST TO FILE
	    public boolean commitToFile(){
	        return FManger.write(CustomersFile, Customers);
	    }
    // ADD CUSTOMER TO ARRAY LSIT AND SAVE IT TO FILE
	    public boolean AddCustomer(Customer c){
	    	loadFromFile();
	    	Customers.add(c);
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
            public boolean login(String userName,String Pass){
                if (userName.equals("Admin") && Pass.equals("Admin")){
                    return true;
                }
                return false;
            }
}
