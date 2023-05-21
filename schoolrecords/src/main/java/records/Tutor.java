package records;

import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> taughtSubjects;

    public Tutor(String name, List<Subject> subjectList) {
        this.name = name;
        this.taughtSubjects = subjectList;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        for(Subject sub : taughtSubjects){
            if(sub.getSubjectName().equals(subject.getSubjectName())){
                return true;
            }
        }
        return false;
    }

}
