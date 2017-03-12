import java.util.Comparator;
public class BarPeopleComparatorByGenderHottnessAndAge implements Comparator<BarPeople>
      {
        public int compare(BarPeople o1, BarPeople o2)
           {
              int flag = o1.compareTo(o2);
              if (flag == 0)
               flag = o1.getHot()-o2.getHot();
              if (flag == 0)
               flag = o1.getAge()-o2.getAge();
                  
               return flag;
           }
      }