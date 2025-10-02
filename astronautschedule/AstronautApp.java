package astronautschedule;

import java.util.*;

public class AstronautApp {
    private static Scanner sc = new Scanner(System.in);
    private static int taskId = 1;

    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        boolean running = true;

        while (running) {
            System.out.println("\n=== Astronaut Daily Schedule Organizer ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Schedule");
            System.out.println("3. Execute Tasks (Normal Order)");
            System.out.println("4. Execute Tasks (By Priority)");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input. Try again.");
                continue;
            }

            switch (choice) {
                case 1: addTask(manager); break;
                case 2: manager.viewSchedule(); break;
                case 3: new NormalExecutionStrategy().executeTasks(manager.getTasks()); break;
                case 4: new PriorityExecutionStrategy().executeTasks(manager.getTasks()); break;
                case 5: running = false; break;
                default: System.out.println("❌ Invalid option.");
            }
        }

        System.out.println("👨‍🚀 Schedule closed. Good luck on the mission!");
    }

    private static void addTask(ScheduleManager manager) {
        System.out.print("Enter task type (exercise/research/maintenance): ");
        String type = sc.nextLine();
        System.out.print("Enter task name: ");
        String name = sc.nextLine();
        System.out.print("Enter task duration (minutes): ");
        int duration = Integer.parseInt(sc.nextLine());
        System.out.print("Enter task priority (1=High, 2=Medium, 3=Low): ");
        int priority = Integer.parseInt(sc.nextLine());

        try {
            Task t = TaskFactory.createTask(type, taskId++, name, duration, priority);
            manager.addTask(t);
            System.out.println("✅ Task added!");
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
