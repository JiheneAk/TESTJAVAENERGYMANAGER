import metier.Battery;
import metier.Component;

import java.util.ArrayList;
import java.util.List;

public class  EnergyManager {
  public List<Component> list = new ArrayList<>();

  //Add a component to the manager
  public  void addComponent(Component component){
      list.add(component);
  }
   //Remove a component to the manager
    public  void removeComponent(Component component){
        list.remove(component);
    }
    //Calculate the total capacity of all batteries managed
    public int calculateTotalCapacity(List list){
      int i =0;
        for ( Object value : list)
             {   if (value instanceof Battery) {
                 Battery battery = (Battery) value;
                 int capacity = battery.getCapacity();
                 i = i + capacity;
             }
             }
        return  i;
             }

    @Override
    public String toString() {
        return super.toString();
    }


// test unitaire
    public static void main(String[] args) {
        EnergyManager en =new EnergyManager();
        en.list.add(new Battery(199));
        en.list.add(new Battery(50));
        en.list.add(new Battery(34));


        System.out.println("the total capacity of all the batteries = "+en.calculateTotalCapacity(en.list));
    }
}