/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Ticket implements Serializable {
	public int Tid,Tplate,tSpot;
	Date Enter;
	
	private final String TicketsFile = "Tickets.bin";
	
	FileBinaryManager FManger = new FileBinaryManager();
    
        ArrayList<Ticket> CustomersTickets = new ArrayList<>();

    public Ticket(int id,int plate,int spot){
        this.tSpot = spot;
        this.Tid = id;
        this.Tplate = plate;
        Enter = new Date();
    }
    
    
    public boolean AddTicket(){
        loadFromFile();
        CustomersTickets.add(this);
        return commitToFile();
    }

    public boolean  DeleteTicket(int id){
    loadFromFile();
    int index = getTicketIndex(id);
    if (index != - 1)
        {
    		CustomersTickets.remove(index);
            return commitToFile();
        }
    return false;
    }
    
    
    public int getTicketIndex(int id){
        for (int i = 0; i < CustomersTickets.size();i++){
         if (CustomersTickets.get(i).getId() == id)
                return i;
        }
        return - 1;
    }
    
    public int getTicketHoursById(int id){
        loadFromFile();
        int index = getTicketIndex(id);
        if (index != - 1){
            return CustomersTickets.get(index).getHours();
        }
        else
            return 0;
    }
    
    public int  getTicketMinutesById(int id){
        loadFromFile();
        int index = getTicketIndex(id);
        if (index != - 1){
            return CustomersTickets.get(index).getMinutes();
        }
        else
            return 0;
    }
    
    public void loadFromFile(){
    	CustomersTickets = (ArrayList<Ticket>) FManger.read(TicketsFile);
    }
    
    public boolean commitToFile(){
        return FManger.write(TicketsFile, CustomersTickets);
    }
    
    
        @Override
    public String toString() {
    return "TicketId : " + Tid + "\t" + "CustomerPlate : " + Tplate + "\t" + "Enter Date: " + Enter +"\n";
    }
    
    // STTERS AND GETTERS
    public void setId(int id){}

    public void setPlate(int plate){}

    public int getId(){return 1;}

    public int getPlate(){return 1;}

    public int getHours(){
    SimpleDateFormat Hours = new SimpleDateFormat("hh");
    int hour = Integer.parseInt(Hours.format(Enter));
    return hour;
    }

    public int getMinutes(){
    SimpleDateFormat Minutes = new SimpleDateFormat("mm");
    int minute = Integer.parseInt(Minutes.format(Enter));
    return minute;
    }

   

	
}
