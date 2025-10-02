package astronautschedule;

import java.util.List;

interface ExecutionStrategy {
    void executeTasks(List<Task> tasks);
}
