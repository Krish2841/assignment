package astronautschedule;

abstract class Task {
    protected int id;
    protected String name;
    protected int duration; 
    protected int priority; // 1 = High, 2 = Medium, 3 = Low

    public Task(int id, String name, int duration, int priority) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.priority = priority;
    }

    public int getPriority() { return priority; }

    public abstract void execute();

    @Override
    public String toString() {
        return "Task [id=" + id + ", name=" + name + ", duration=" + duration + "min, priority=" + priority + "]";
    }
}
