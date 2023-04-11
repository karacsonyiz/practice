package intromethods;

import java.util.Arrays;

public class TodoListMain {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.addTodo("Making food");
        todoList.addTodo("Practice Programming");
        todoList.addTodo("Drinking water");
        todoList.addTodo("Exercising");
        todoList.finishTodos("Making food");
        todoList.finishAllTodos(Arrays.asList("Drinking water","Practice Programming"));
        System.out.println(todoList.todosToFinish());
        System.out.println(todoList.numberOfFinishedTodos());
        System.out.println(todoList);
    }
}
