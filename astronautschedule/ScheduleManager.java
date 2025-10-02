package astronautschedule;

import java.util.*;

class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks = new ArrayList<>();

    private ScheduleManager() {}

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) { tasks.add(task); }

    public void removeTask(int id) {
        tasks.removeIf(t -> t.id == id);
    }

    public void viewSchedule() {
        if (tasks.isEmpty()) {
            System.out.println("📭 No tasks scheduled.");
        } else {
            System.out.println("=== Astronaut Daily Schedule ===");
            for (Task t : tasks) {
                System.out.println(t);
            }
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
