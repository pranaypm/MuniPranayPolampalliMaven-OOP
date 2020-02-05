package pranay;


class Sweet implements Comparable
{
int weight=1;
String name="";
String color="Blue";
float calories=125;

public int compareTo(Object o)
{
return 0;
}
}

class chocolate extends Sweet{}

class FiveStar extends chocolate
{
FiveStar ()
{
this.name="FiveStar chocolate ";
}
}

class DairyMilk extends chocolate
{
DairyMilk()
{
this.name="DairyMilk Choclate";
}
}




public class Maven
{
public static void main(String[] args) 
{
Sweet[]  all = new Sweet[4];
all [0]= new FiveStar();
all [1]= new FiveStar();
all [2]= new DairyMilk();
all [3]= new DairyMilk();
float total_weight =0;

for (int i = 0; i < all.length; i++)
{
Sweet s = all[i];
total_weight += s.weight;
}
System.out.println("Total_Weight = "+total_weight);
for (int i = 0; i < all.length; i++)
{
Sweet s = all[i];
System.out.println(s.name);
}
System.out.println("The task is Completed");
}
}