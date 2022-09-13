
class ForestRunner{
public static void main(String[]animlas)
{
String name1=Forest.name;
float area=Forest.area;
String region=Forest.region;


System.out.println("forest name is : "+name1);
System.out.println("forest area in feet is : "+area);
System.out.println("forest region is : "+region);

System.out.println("forest name is : "+name1);

for(int tree=0; tree<Forest.primaryAnimals.length; tree++)
{
	System.out.println("few animals in forest : "+Forest.primaryAnimals[tree]);	
}

}
}