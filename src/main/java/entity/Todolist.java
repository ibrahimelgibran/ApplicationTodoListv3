package entity;

public class Todolist {

    private String todo;

    public Todolist() {
    }

    public Todolist(String todo) {
        this.todo = todo;
    }

    // mengambil data
    public String getTodo() {
        return todo;
    }

    // mengubah data
    public void setTodo(String todo) {
        this.todo = todo;
    }
}
