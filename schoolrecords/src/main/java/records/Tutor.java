package records;

import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> subjectList;

    public Tutor(String name, List<Subject> subjectList) {
        this.name = name;
        this.subjectList = subjectList;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        for(Subject sub : subjectList){
            if(sub.getName().equals(subject.getName())){
                return true;
            }
        }
        return false;
    }

}
