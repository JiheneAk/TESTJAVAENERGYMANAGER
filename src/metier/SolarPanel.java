package metier;

public class SolarPanel extends Component{
   private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public String a = Integer.toString(this.getPower());
    @Override
    //Return solar panel details
    String getDetails(String a) {
        return super.getDetails(a);
    }

    //Simulate power generation
    public int generatePower() {
        return power;
    }
}
