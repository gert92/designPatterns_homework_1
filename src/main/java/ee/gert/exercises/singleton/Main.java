package ee.gert.exercises.singleton;

public class Main {
    public static void main(String[] args) {
//        Servers servers = Servers.getServersInstance();
        Servers servers = Servers.INSTANCE;
        System.out.println(servers.addServer("http:\\\\m3js"));
        System.out.println(servers.addServer("https:\\\\asd342342342"));
        System.out.println(servers.addServer("https:\\\\34343423423"));
        System.out.println(servers.addServer("htss:\\\\cxvgefgdsfsdf"));
        System.out.println(servers.addServer("ht34ps:\\\\3453sdfszsdsd"));
//        Servers bomba = Servers.getServersInstance();
        Servers bomba = Servers.INSTANCE;


        System.out.println("servers" + servers.getServersStartingWithHTTP());
        System.out.println("bomba" + bomba.getServersStartingWithHTTP());

        System.out.println("servers" + servers.getServersStartingWithHTTPSecure());
        System.out.println("bomba" + bomba.getServersStartingWithHTTPSecure());
    }
}
