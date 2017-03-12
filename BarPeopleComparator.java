//compare by gender, age and hot
import java.util.Comparator;
public class BarPeopleComparator implements Comparator<BarPeople>
      {
        public int compare(BarPeople o1, BarPeople o2)
           {
              int flag =  o1.getGender()-o2.getGender();
              if (flag == 0)
               flag = o1.getHot()-o2.getHot();
              if (flag == 0)
               flag = o1.compareTo(o2);
                  
               return flag;
           }
      }
      