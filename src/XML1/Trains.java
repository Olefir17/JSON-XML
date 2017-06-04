package XML1;

import javax.xml.bind.annotation.XmlRootElement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Date;

/**
 * Created by Anastasia on 25.01.2017.
 */
@XmlRootElement(name = "trains")
public class Trains {


    private List<Train> trains = new ArrayList<Train>();

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    public void add(Train train) {
        trains.add(train);
    }

    public static Trains getTrainsByTimeDate(Calendar from, Calendar to, Trains trains) throws ParseException {
        List<Train> listTrain = new ArrayList<>();

        for (Train train:trains.getTrains()
             ) {
            if(train.getDepatureDate().after(from) && train.getDepatureDate().before(to)){
                listTrain.add(train);
            }
        }
        Trains newTrains = new Trains();
        newTrains.setTrains(listTrain);
        return newTrains;

    }

    private int getFreeIdTrain (List <Train> trains){
        boolean trainIdFound = true;
        int result = 0;
        for(int i = 1 ; trainIdFound;i++){
            trainIdFound = false;
            for(Train train : trains){
                if (train.getId() == i){trainIdFound = true;}

            }
            result = i;
        }
        return result;
    }

    synchronized public void  addTrain(Train train){
        if (train == null){return;}
        int freeIdTrain = getFreeIdTrain(trains);
        // System.out.println("next free number is " + freeIdTrain);
        train.setId(freeIdTrain);
        trains.add(train);




    }
}
