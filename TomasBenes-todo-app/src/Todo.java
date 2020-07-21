import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Todo {



    public static void main(String[] args) {
      Path path = Paths.get("tasks.txt");

      File file = new File("tasks.txt");


      if (args.length == 0) {
            printUsageInformation();
        }
        else if (args[0].equals("-l")){
            listTasks(path);
        }
        else if (args[0].equals("-l") && file.length() == 0)  {
          emptyList();
        }
        else if (args[0].equals("-a" + "Feed the monkey")) {
          addNewTask(path);
        }
        else if (args[0].equals("-a")) {
          addNewTaskErrorHandling();
        }
        else if (file.length() >= 2 && args[0].equals("-r 2")) {
            removeTask();
      }

    }
    public static void printUsageInformation () {
        System.out.println("$ todo");
        System.out.println();
        System.out.println("Command Line Todo application");
        System.out.println("=============================");
        System.out.println();
        System.out.println("Command line arguments:");
        System.out.println("    -l   Lists all the tasks");
        System.out.println("    -a   Adds a new task");
        System.out.println("    -r   Removes an task");
        System.out.println("    -c   Completes an task");
    }
    public static void listTasks (Path path){

        try {
            for (String line : Files.readAllLines(path)) {
             for (int i = 1; i < line.length(); i++) {
                    System.out.println(i);
                }
             System.out.println(line);
            }
        } catch (IOException e) {
                        System.out.println("Exception I/O was found");
        }

    }

    public static void emptyList () {
        System.out.println("No todos for today! :)");
    }

    public static void addNewTask (Path path) {
      try {
            List<String> newLines = new ArrayList<>();
            newLines.add("Feed the monkey");
            Files.write(path, newLines, StandardOpenOption.APPEND);
        } catch (IOException e) {
             System.out.println("Exception I/O was found");
        }
    }

    public static void addNewTaskErrorHandling () {
        System.out.println("Unable to add: no task provided");
    }

    public static void removeTask () {

    }
}
