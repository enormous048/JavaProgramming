package Day31_CustomClass_Constructors.Day31_Task.restourant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restourant {

    private String owner, location;
    private int numberOfStars;

    private ArrayList<Server> servers = new ArrayList<>();
    private ArrayList<Chef> chefs = new ArrayList<>();


    public Restourant(String owner, String location, int numberOfStars) {
        setOwner(owner);
        setLocation(location);
        setNumberOfStars(numberOfStars);
    }

    public String getOwner() {
        return owner;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public ArrayList<Server> getServers() {
        return servers;
    }

    public ArrayList<Chef> getChefs() {
        return chefs;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public void setServers(ArrayList<Server> servers) {
        this.servers = servers;
    }

    public void setChefs(ArrayList<Chef> chefs) {
        this.chefs = chefs;
    }

    public void addServer(Server server){
        servers.add(server);
    }
    public void addServers(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));
    }

    public void addchef(Chef chef){
        chefs.add(chef);
    }
    public void addchefs(Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateServer(int id){
        servers.removeIf(p-> p.getEmployeeID() == id);
    }
    public void terminateChef(int id){
        chefs.removeIf(p ->p.getEmployeeID() == id);
    }

    public String toString() {
        return "Restourant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';
    }
}
