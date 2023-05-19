package interfaces.simplethread;

import java.util.List;

public class SimpleThread implements Runnable {

    private List<String> tasks;

    public SimpleThread(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while(!tasks.isEmpty()){
            nextStep();
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

    private boolean nextStep() {
        return tasks.remove(tasks.get(tasks.size()-1));
    }
}
