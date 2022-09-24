package Day31_CustomClass_Constructors.Day31_Task.restourant;

import java.util.Arrays;

public class RestourantMain {

    public static void main(String[] args) {


        Server server = new Server("Naz", 80, 23, true);
        Server server1 = new Server("Kamaz", 34, 26, false);

        Chef chef = new Chef("Antonio", 2, 27, true);
        Chef chef1 = new Chef("Zio", 1, 44, true);


        Restourant restik = new Restourant("Naz", "LA", 5);
        restik.getServers().addAll(Arrays.asList(server, server1));
        restik.getChefs().addAll(Arrays.asList(chef, chef1));

        restik.terminateServer(34);

        System.out.println(restik);

    }
}
