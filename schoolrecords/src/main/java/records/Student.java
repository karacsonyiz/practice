package records;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        if(isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public void grading(Mark mark) {
        if(mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage() {
        if(marks.size() == 0) {
            return 0.0;
        }
        double sum = 0;
        for(Mark mark : marks) {
            sum += mark.getMarkType().getValue();
        }
        double avg = sum/marks.size();
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(avg).replace(",","."));
    }

    public double calculateSubjectAverage(Subject subject) {
        if(marks.size() == 0) {
            return 0.0;
        }
        double sum = 0;
        int numberOfMarks = 0;
        for(Mark mark : marks) {
            if(mark.getSubject().equals(subject)){
                sum += mark.getMarkType().getValue();
                numberOfMarks += 1;
            }
        }
        if(numberOfMarks == 0) {
            return 0.0;
        }
        return sum/numberOfMarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + " marks: ");
        for(Mark mark : marks) {
            sb.append(mark.getSubject().getSubjectName()).append(": ")
                    .append(mark.getMarkType().getDescription()).append("(")
                    .append(mark.getMarkType().getValue()).append(")");
        }
        return sb.toString();
    }

    private boolean isEmpty(String str) {
        return str.isEmpty();
    }

    public String getName() {
        return name;
    }
}
