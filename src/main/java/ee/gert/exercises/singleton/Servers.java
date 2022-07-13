package ee.gert.exercises.singleton;

import java.util.ArrayList;
import java.util.List;


public class Servers {
    // ---------------------THREAD SAFE AND LAZY------------------------------

//    private static Servers serverInstance;
//    private static final List<String> servers = new ArrayList<>();
//
//    private Servers() {
//    }
//
//    synchronized public static Servers getServersInstance(){
//        if (serverInstance == null){
//            return new Servers();
//        }
//        return serverInstance;
//    }

    // ---------------------EAGER------------------------------

//    private static final Servers instance = new Servers();
//    private static final List<String> servers = new ArrayList<>();
//
//    private Servers()
//    {
//        // private constructor
//    }
//    public static Servers getServersInstance(){
//        return instance;
//    }

    // ---------------------ENUM------------------------------

    public final static Servers INSTANCE = new Servers();
    private static final List<String> servers = new ArrayList<>();


    public boolean addServer(String server) {
        server = server.toLowerCase();
        if (server.startsWith("http") || server.startsWith("https")) {
            if (!servers.contains(server)) {
                servers.add(server);
                return true;
            }
        }
        return false;
    }

    public List<String> getServersStartingWithHTTP() {
        return servers.stream().filter(server -> server.startsWith("http:")).toList();
    }


    public List<String> getServersStartingWithHTTPSecure() {
        return servers.stream().filter(server -> server.startsWith("https:")).toList();
    }


}
