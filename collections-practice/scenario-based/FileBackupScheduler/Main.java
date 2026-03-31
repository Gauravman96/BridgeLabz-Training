public class Main {
    public static void main(String[] args) {

        BackupScheduler scheduler = new BackupScheduler();

        try {
            scheduler.addTask("/documents", 2);
            scheduler.addTask("/system", 5);      // critical
            scheduler.addTask("/photos", 3);

            // Invalid path
            scheduler.addTask("", 1);

        } catch (InvalidBackupPathException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scheduler.executeBackups();
    }
}
