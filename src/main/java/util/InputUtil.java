package util;

import service.TodoListService;

import java.util.Scanner;

public class InputUtil {

    private TodoListService todoListService;

    public InputUtil(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    private static Scanner scanner = new Scanner(System.in);
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
}
