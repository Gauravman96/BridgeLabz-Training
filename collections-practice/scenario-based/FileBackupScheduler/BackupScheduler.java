import java.util.PriorityQueue;

public class BackupScheduler {

    private PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    
    public void addTask(String path, int priority)
            throws InvalidBackupPathException {

        if (path == null || path.isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path!");
        }

        queue.add(new BackupTask(path, priority));
        System.out.println("Task added: " + path);
    }

    
    public void executeBackups() {

        System.out.println("\nExecuting Backup Tasks:");

        while (!queue.isEmpty()) {
            BackupTask task = queue.poll(); // highest priority first
            System.out.println("Backing up: " + task);
        }
    }
}
