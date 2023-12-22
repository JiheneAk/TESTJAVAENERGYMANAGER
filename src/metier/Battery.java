package metier;

import static java.lang.Integer.parseInt;
import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.detail;

public class Battery extends Component{
   private  int capacity;

    public Battery(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "capacity=" + capacity +
                '}';
    }

    //Return the capacity of the battery
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public String a = Integer.toString(this.getCapacity());
    @Override
    //Return battery details
    String getDetails(String a) {
        return super.getDetails(a);
    }


}
