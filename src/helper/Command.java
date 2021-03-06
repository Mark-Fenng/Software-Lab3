package helper;

import graph.Graph;

import java.util.List;
import java.util.Scanner;

abstract class Command {
    protected Graph graph;

    Command(Graph g) {
        graph = g;
    }

    /**
     * 向图中添加输入的新对象
     *
     * @param args 用户输入的新对象的属性
     */
    abstract void add(List<String> args);

    /**
     * 从图中删除用户指定的对象
     *
     * @param args 用户输入的指定对象的属性
     */
    abstract void delete(List<String> args);

    /**
     * 更新图中指定对象的属性
     *
     * @param args 用户输入的指定对象的属性
     */
    abstract void update(List<String> args);

    /**
     * 展示图中指定对象的属性
     *
     * @param args 用户输入的指定对象属性
     */
    abstract void show(List<String> args);

    /**
     * 在删除指定对象时，向用户确认是否删除
     *
     * @return true: 用户确认删除 false:用户撤销了删除的操作
     */
    static boolean confirm() {
        System.err.println("Are you sure to delete them? (Yes/no)");
        Scanner scanner = new Scanner(System.in);
        String input = "";
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
        }
        return input.equals("y") || input.equals("Y") || input.equals("yes") || input.equals("Yes");
    }
}
