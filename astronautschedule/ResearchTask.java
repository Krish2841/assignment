package astronautschedule;

class ResearchTask extends Task {
    public ResearchTask(int id, String name, int duration, int priority) {
        super(id, name, duration, priority);
    }
    public void execute() { System.out.println("🔬 Conducting research: " + name); }
}
