package MyPackage;

import MyPackage.Kompis;
import java.util.ArrayList;
import java.util.List;



public class DAO  {
    Kompis k1 = new Kompis("Felix", "Hinsaringen 39", 0703364416);
    Kompis k2 = new Kompis("Zid", "Hinsaringen 39", 0723232323);
    Kompis k3 = new Kompis("Gonzo", "Hinsaringen 39", 0723232323);
    Kompis k4 = new Kompis("Kompis", "Hinsaringen 39", 0723232323);
    Kompis k5 = new Kompis("Lillo", "Hinsaringen 39", 07434343434);
            List<Kompis> myList = new ArrayList<>();
    DAO(){


        myList.add(k1);
        myList.add(k2);
        myList.add(k3);
        myList.add(k4);
        myList.add(k5);

    }


    public String getKompis(String name)        
    {
        String unna = "unna";
        
        for (Kompis k : myList)
        {
            if (k.getName().equalsIgnoreCase(name))
            {
                String kompis = k.name + " "+ k.adress+" "+ k.phoneNumber+".";
                //String kompis = k.getName() + " "+ k.getAdress()+" "+ k.getPhoneNumber()+".";
                System.out.println("Hi from DAO");
                return kompis;
                
            }
            

        }
        return null;
    }
    
    public List <Kompis> list(){
//        int i = 0;
//        while(i < myList.size()){
//            
//            return (List<Kompis>) myList.get(i);
//            i++;
//        }
        for(Kompis k : myList){
            if(k.getName().equalsIgnoreCase(null)){
                return myList;
            }
        }
        
        return myList;
    }
}
