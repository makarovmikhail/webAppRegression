import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mikhail on 29.11.2017.
 */
public class Main{

    public static List<Double> list = new ArrayList<Double>();

    public static double value = 0;

    public static void add(double d){
        list.add(d);
    }

    public static double get(){
        double sum = 0;
        for(int i = list.size()-1; i>(0.7*(list.size()));i--){
            sum+=list.get(i);
        }
        return list.size()==0 ? 0 : sum/(0.3*list.size());
    }
}
