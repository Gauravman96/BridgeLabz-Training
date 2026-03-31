import java.util.*;
public class CinemaTimeManager {

     private List<String>movieTitles =new ArrayList<>();
    private List<String>showTimes=  new ArrayList<>();
    
       //Add Movie
    public void addMovies(String title,String time) throws InvalidTimeFormatException{
        if(! isValidTime(time)){
            throw new InvalidTimeFormatException("Invalid Time Formar"+time);
        }
        movieTitles.add(title);
        showTimes.add(time);
        System.out.println("Movie added successfully!");
    }   
     

    //Search Movie

    public void searchMovie(String keyword) {
        boolean found = false;
        try {
            for (int i = 0; i < movieTitles.size(); i++) {
                if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println(
                        String.format("Found: %s at %s", movieTitles.get(i), showTimes.get(i))
                    );
                    found = true;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index while searching.");
        }

        if (!found) {
            System.out.println("No movie found with keyword: " + keyword);
        }
    }

    //Display movie
    public void displayAllMovies(){
        if(movieTitles.isEmpty()){
            System.out.println("No movie available");
            return;
        }
        System.out.println("\n movie shedule");
        for(int i=0;i<movieTitles.size();i++){
            System.out.println(String.format("%d. %s - %s", i+1,movieTitles.get(i),showTimes.get(i)));
        }
    }

    //print report
     public void generatePrintableReport() {
        String[] titlesArray = movieTitles.toArray(new String[0]);
        String[] timesArray = showTimes.toArray(new String[0]);

        System.out.println("\n Printable Movie Report:");
        for (int i = 0; i < titlesArray.length; i++) {
            System.out.println(titlesArray[i] + " | " + timesArray[i]);
        }
    }


     private boolean isValidTime(String time) {
        try {
            String[] parts = time.split(":");
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);

            return hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        CinemaTimeManager manager= new CinemaTimeManager();

        try{
            manager.addMovies("Inception", "17:20");
            manager.addMovies("Bahubali", "18:30");
            manager.addMovies("Bhay","25:20");     // invalide time
        }
        catch(InvalidTimeFormatException e){
            System.out.println(e.getMessage());
        }

        manager.displayAllMovies();

        manager.searchMovie("Bahu");
        manager.searchMovie("Batman");

        manager.generatePrintableReport();
    }



}
