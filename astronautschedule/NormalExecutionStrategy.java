package astronautschedule;

import java.util.List;

class NormalExecutionStrategy implements ExecutionStrategy {
    public void executeTasks(List<Task> tasks) {
        for (Task t : tasks) {
            t.execute();
        }
    }
}

