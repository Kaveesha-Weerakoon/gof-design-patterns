package Proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("google.com");
            internet.connectTo("facebook.com");  // Should be blocked
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
