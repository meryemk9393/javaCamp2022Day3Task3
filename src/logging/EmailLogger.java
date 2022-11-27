package logging;

public class EmailLogger implements  BaseLogger{
    @Override
    public void log(String data) {
        System.out.println("Emaile loglandı: "+data);
    }
}
