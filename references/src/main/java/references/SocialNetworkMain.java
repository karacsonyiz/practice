package references;

public class SocialNetworkMain {

    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();

        socialNetwork.addMember("Joe");
        socialNetwork.addMember("John");
        socialNetwork.addMember("Jane");
        socialNetwork.addMember("Richard");

        socialNetwork.connect("Joe", "John");
        socialNetwork.connect("Joe", "Jane");
        socialNetwork.connect("John", "Joe");

        System.out.println(socialNetwork.getMembers());
        System.out.println(socialNetwork.bidirectionalConnections());
        System.out.println(socialNetwork);
    }


}
