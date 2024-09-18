import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
        public class Main {

            private List<String> task;
            private Scanner sc;

            public Main() {
                task = new ArrayList<>();
                sc = new Scanner(System.in);
            }

            private void run() {
                Boolean runn = true;
                while (runn) {
                    System.out.println("/n---------- To DO List ----------/n");
                    System.out.println("1.ADD Task");
                    System.out.println("2.Delete Task");
                    System.out.println("3.Show Task");
                    System.out.println("4.Quit");
                    int n = sc.nextInt();
                    sc.nextLine();
                    switch (n) {
                        case 1:
                            addTask();
                            break;
                        case 2:
                            deletetask();
                            break;
                        case 3:
                            showtask();
                            break;
                        case 4:
                            runn = false;
                            break;
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                }
            }

            private void addTask() {
                System.out.println("/n Enter Task");
                String tasks = sc.nextLine();
                task.add(tasks);
                System.out.println("Task Successfully Added");
            }

            private void deletetask() {
                System.out.println("/n Enter Task Number To Delete");
                int tasknum = sc.nextInt();
                sc.nextLine();
                if (tasknum > 0 && tasknum <= task.size()) {
                    task.remove(tasknum - 1);
                    System.out.println("Successfully Deleted");


                } else
                    System.out.println("Invaid task number");

            }

            private void showtask() {
                if (task.isEmpty()) {
                    System.out.println("NO Task TO Display");
                } else {
                    for (int i = 0; i < task.size(); i++) {
                        System.out.println((i + 1) + "." + task.get(i));
                    }
                }
            }

            public static void main(String[] args) {
                Main main = new Main();
                main.run();
            }
        }

