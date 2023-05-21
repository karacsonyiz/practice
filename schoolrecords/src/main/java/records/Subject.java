package records;

import java.util.Objects;

public class Subject {

    private String subjectName;

    public Subject(String name) {
        this.subjectName = name;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(subjectName, subject.subjectName);
    }

}
