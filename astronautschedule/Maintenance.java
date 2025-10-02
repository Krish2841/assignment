package astronautschedule;

class MaintenanceTask extends Task {
    public MaintenanceTask(int id, String name, int duration, int priority) {
        super(id, name, duration, priority);
    }
    public void execute() { System.out.println("🛠 Performing maintenance: " + name); }
}
