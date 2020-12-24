package comparable;

import java.util.Comparator;
public class MarksComparator implements Comparator<Demo>{
    @Override
    public int compare(Demo obj1, Demo obj2) {
         return ((Float)obj2.getMarks()).compareTo((Float)obj1.getMarks());
    }
 
}