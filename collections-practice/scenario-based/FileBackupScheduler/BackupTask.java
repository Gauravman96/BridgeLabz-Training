public class BackupTask implements Comparable<BackupTask> {

    private String folderPath;
    private int priority;   // higher number = higher priority

    public BackupTask(String folderPath, int priority) {
        this.folderPath = folderPath;
        this.priority = priority;
    }

    public String getFolderPath() {
        return folderPath;
    }

    public int getPriority() {
        return priority;
    }

    // Priority based sorting (high → low)
    @Override
    public int compareTo(BackupTask other) {
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return "BackupTask [Path=" + folderPath + ", Priority=" + priority + "]";
    }
}
