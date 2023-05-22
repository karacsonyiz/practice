package records;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public boolean addStudent(Student student) {
        if(!students.contains(student)){
            return students.add(student);
        }
        return false;
    }

    public String getClassName() {
        return className;
    }

    public boolean removeStudent(Student student) {
        return students.remove(student);
    }

    public double calculateClassAverage() {
        if(students.size() == 0) {
            throw new ArithmeticException("No student in the class");
        }
        double sum = 0;
        for(Student student : students) {

            sum += student.calculateAverage();
        }
        if(sum == 0) {
            throw new ArithmeticException("No marks present");
        }
        return sum/students.size();
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double sum = 0;
        int markCounter = 0;
        for(Student student : students) {
            double currentSum = sum;
            sum += student.calculateSubjectAverage(subject);
            if(sum > currentSum){
                markCounter += 1;
            }
        }
        return sum/markCounter;
    }

    public Student findStudentByName(String name) {
        if(name.isEmpty()){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if(students.size() == 0) {
            throw new IllegalStateException("No students to search!");
        }
        for(Student student : students) {
            if(student.getName().equals(name)) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found!");
    }

    public Student repetition() {
        if(students.size() == 0) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(rnd.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> studyResults = new ArrayList<>();
        for(Student student : students) {
            studyResults.add(new StudyResultByName(student.getName(),student.calculateAverage()));
        }
        return studyResults;
    }

    public String listStudentNames() {
        StringBuilder sb = new StringBuilder();
        for(Student student : students) {
            sb.append(student.getName()).append(", ");
        }
        return sb.toString().replaceFirst("..$","");
    }
}
