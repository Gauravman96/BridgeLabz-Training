public class CircularTour {

    public static int findStartingPoint(int[] petrol, int[] distance) {
        int start = 0;
        int surplus = 0;
        int deficit = 0;

        for (int i = 0; i < petrol.length; i++) {
            surplus += petrol[i] - distance[i];

            if (surplus < 0) {
                deficit += surplus;
                start = i + 1;
                surplus = 0;
            }
        }

        if (surplus + deficit >= 0)
            return start;
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] petrol = {2, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStartingPoint(petrol, distance);

        if (start != -1)
            System.out.println("Start at petrol pump index: " + start);
        else
            System.out.println("No possible tour");
    }
}
