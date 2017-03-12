import java.util.*;
public class priorityQ_BarPeople
{
   public static void main (String[] args)
      {
         PriorityQueue<BarPeople> waitingLine = new PriorityQueue<>();
         waitingLine.add(new BarPeople("Brian", 2, 24, 2));
         waitingLine.add(new BarPeople("Jess", 1, 23, 2));
         waitingLine.add(new BarPeople("Julia", 1, 26, 2));
         waitingLine.add(new BarPeople("Zach", 2, 26, 1));
         waitingLine.add(new BarPeople("Emily", 1, 23, 1));
         waitingLine.add(new BarPeople("Austin", 2, 22,2));
         waitingLine.add(new BarPeople("Justin", 2, 27,2));
         waitingLine.add(new BarPeople("Natalie", 1, 30,1));
     System.out.println ("First sorted by age using compareTo\n----------------------------");
         while (!waitingLine.isEmpty())
            {
               System.out.println (waitingLine.poll());
            }
            
   System.out.println("\n");
         Comparator<BarPeople> bComparator = new BarPeopleComparator();
         PriorityQueue<BarPeople> extraSortedLine = new PriorityQueue<>(10, bComparator);
         
         extraSortedLine.add(new BarPeople("Brian", 2, 24, 2));
         extraSortedLine.add(new BarPeople("Jess", 1, 23, 2));
         extraSortedLine.add(new BarPeople("Julia", 1, 26, 2));
         extraSortedLine.add(new BarPeople("Zach", 2, 26, 1));
         extraSortedLine.add(new BarPeople("Emily", 1, 23, 1));
         extraSortedLine.add(new BarPeople("Austin", 2, 22,2));
         extraSortedLine.add(new BarPeople("Justin", 2, 27,2));
         extraSortedLine.add(new BarPeople("Natalie", 1, 30,1));
         
         System.out.println("Now sorted by gender -> hot/not -> age using compare\n--------------------------");
       
          while (!extraSortedLine.isEmpty())
            {
               System.out.println (extraSortedLine.poll());
            }
            
         //need to figure out iterator to remove potatoes from the line
         
      }
}