package astronautschedule;

class ExerciseTask extends Task {
    public ExerciseTask(int id, String name, int duration, int priority) {
        super(id, name, duration, priority);
    }
    public void execute() { System.out.println("👨‍🚀 Doing exercise: " + name); }
}
