
import java.util.Date;
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vssst
 */
    public class Task {
        String name;
        float duration;
        Date startdate;
        Date enddate;
        Date duedate;
        int completion;
        
        public Task(String name,float duration,Date startdate,Date enddate, Date duedate){
            this.name= name;
            this.duration= duration;
            this.startdate= startdate;
            this.enddate = enddate;
            this.duedate= duedate;
            this.completion = 0;
        }
        
        public String debugString() {
            return "name: " + name + " ;" + "duration: " + duration + " ;" 
                + "startdate: " + startdate + " ;" + "enddate: " + enddate + " ;" + "duedate: " + duedate+ " ;";
        }
        
    }

//public static ArrayList<tasks> taskstlist = new ArrayList<tasks>();