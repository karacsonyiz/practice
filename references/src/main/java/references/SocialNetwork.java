package references;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    private final List<Member> members = new ArrayList<>();

    public void addMember(String name){
        this.members.add(new Member(name));
    }

    public void connect(String name, String anotherName){
        Member firstMember = findByName(name);
        Member secondMember = findByName(anotherName);
        firstMember.connectMember(secondMember);
    }

    public Member findByName(String name){
        for(Member member : members){
            if(member.getName().equals(name)){
                return member;
            }
        }
        return null;
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<String> bidirectionalConnections() {
        List<String> result = new ArrayList<>();
        for (Member member : members) {
            for (Member connection : member.getConnections()) {
                if (connection.getConnections().contains(member)) {
                    result.add(member.getName()+ " - " + connection.getName());
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "SocialNetwork{" +
                "members=" + members +
                '}';
    }
}

