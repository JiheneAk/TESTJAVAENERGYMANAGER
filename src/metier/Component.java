package metier;

//Abstract method to return details about the component
public  abstract class Component {
    String  getDetails(String detail) {
        return "the details are = "+ detail;
    }
}
