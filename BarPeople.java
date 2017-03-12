
public class BarPeople implements Comparable<BarPeople>
  {
      private String name;
      private int gender; //male=2 female= 1
      private int age;
      private int hot;
      private String Hot;
      private String Gender;
      
      public BarPeople()
         {
            gender=0;
            age=0;
            name = "";
            hot = 0;
         }
      public BarPeople(String name, int gender, int age,int hot)
         {
            this.gender= gender;
            this.age=age;
            this.hot = hot;
            this.name=name;
            
         }
      //set
      
      public void setGender(int gender)
         {this.gender=gender;}
      public void setAge(int age)
         {this.age=age;}
      public void setHot()
         {this.hot=hot;}
      public void setName(String name)
         {this.name=name;}
         
      //get
      public int getGender()
         {return gender;}
      public int getAge()
         {return age;}
      public int getHot()
         {return hot;}
      public String getName()
         {return name;}
          
       public String toString()
            {
               if (hot == 1)
                  Hot="hottie";
               else 
                  Hot = "potato";
               if (gender == 2)
                  Gender = "guy";
               else if (gender == 1)
                  Gender = "girl";
               else
                  Gender = "person";
              String str = "This "+Gender+" " +name+" is "+age+" and is a "+Hot;
                return str;
            }
         
      
         
    public int compareTo(BarPeople other)
      {
         if (this.age > other.age)
            {return 1;}
         else if (this.age<other.age)
            {return -1;}
         else
            {return 0;}
           
      }

   
 }