package intromethods;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todoList = new ArrayList<>();

    public void addTodo(String caption){
        todoList.add(new Todo(caption));
    }

    public void finishTodos(String caption){
        for(Todo todo : todoList){
            if (todo.getCaption().equals(caption)){
                todo.finish();
            }
        }
    }

    public void finishAllTodos(List<String> todosToFinish){
        for(Todo todo : todoList){
            if(todosToFinish.contains(todo.getCaption())){
                todo.finish();
            }
        }
    }

    public List<String> todosToFinish(){
        List<String> result = new ArrayList<>();
        for(Todo todo : todoList){
            if(!todo.isFinished()){
                result.add(todo.getCaption());
            }
        }
        return result;
    }

    public int numberOfFinishedTodos(){
        int result = 0;
        for(Todo todo: todoList){
            if(!todo.isFinished()){
                result += 1;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "todoList=" + todoList;
    }
}
