package XML1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by Anastasia on 25.01.2017.
 */
@XmlRootElement(name  = " train")
public class Train {

    private int id;
    private String from;
    private String to;
    private String date;
    private String departure;

    public Train(String from, String to, String date, String departure) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.departure = departure;
    }

    public Train(){}

   // @XmlAttribute(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public Calendar getDepatureDate() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy HH:mm");


        Calendar calendar = new GregorianCalendar() ;
        calendar.setTime(sdf.parse(date + " " + departure));
        return calendar;


    }

    public  static Train createTrain(){
        Scanner sc =new Scanner(System.in);

        Train train = new Train();

        System.out.println("From");
        train.setFrom(sc.nextLine());

        System.out.println("To");
        train.setTo(sc.nextLine());

        System.out.println("Date");
        train.setDate(sc.nextLine());

        System.out.println("Departure");
        train.setDeparture(sc.nextLine());

        return train;

    }
}


