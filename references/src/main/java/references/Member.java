package references;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String name;
    private final List<Member> connections = new ArrayList<>();

    public Member() {
    }

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Member> getConnections() {
        return connections;
    }

    public void connectMember(Member member){
        this.connections.add(member);
    }

    public List<String> connectedNames(){
        List<String> names = new ArrayList<>();
        for(Member member : connections){
            names.add(member.getName());
        }
        return names;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", connections=" + connectedNames() +
                '}';
    }
}
