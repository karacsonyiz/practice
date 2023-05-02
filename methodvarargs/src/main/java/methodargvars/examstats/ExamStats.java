package methodargvars.examstats;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        checkIfZeroResults(results);
        int numberOfGrades = 0;
        for(int grade : results){
            if(grade > limitInPercent){
                numberOfGrades += 1;
            }
        }
        return numberOfGrades;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        checkIfZeroResults(results);
        for(int grade : results){
            if(grade < limitInPercent){
                return true;
            }
        }
        return false;
    }

    private void checkIfZeroResults(int... results){
        if(results == null || results.length == 0){
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
    }
}
