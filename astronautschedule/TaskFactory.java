package astronautschedule;

class TaskFactory {
    public static Task createTask(String type, int id, String name, int duration, int priority) {
        switch (type.toLowerCase()) {
            case "exercise": return new ExerciseTask(id, name, duration, priority);
            case "research": return new ResearchTask(id, name, duration, priority);
            case "maintenance": return new MaintenanceTask(id, name, duration, priority);
            default: throw new IllegalArgumentException("Unknown task type: " + type);
        }
    }
}
