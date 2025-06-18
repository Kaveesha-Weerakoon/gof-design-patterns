package Proxy;

import java.util.Arrays;
import java.util.List;

class ProxyInternet implements Internet {
    private RealInternet realInternet = new RealInternet();
    private static List<String> bannedSites = Arrays.asList("facebook.com", "instagram.com");

    public void connectTo(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied to " + serverHost);
        }

        realInternet.connectTo(serverHost);
    }
}
