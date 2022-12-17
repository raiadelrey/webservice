package app;
import javax.xml.ws.Endpoint;
public class BancoServerPublisher {
    public static void main (String[] args)
    {
        System.out.println("Hello");
        Endpoint.publish("http://127.0.01:1:8080/app",
        new BancoServerImpl ())
    }
}