package astronautschedule;

import java.util.*;

class PriorityExecutionStrategy implements ExecutionStrategy {
    public void executeTasks(List<Task> tasks) {
        tasks.stream()
             .sorted(Comparator.comparingInt(Task::getPriority))
             .forEach(Task::execute);
    }
}

