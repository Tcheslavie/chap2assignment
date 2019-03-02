package ac.za.cput;

public class myIntImpl implements myInterface {
    @Override
    public String sayHello(String name) {
        return "Hello "+name;
    }
}
