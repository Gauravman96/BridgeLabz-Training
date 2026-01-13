public class EventManager {
    public static void main(String[] args) {
        Ticket[] tickets= {
             new Ticket("Concert", 3500),
            new Ticket("Standup", 1200),
            new Ticket("Sports", 4500),
            new Ticket("Theatre", 900),
            new Ticket("Festival", 2500),
            new Ticket("Conference", 8000)
        };

         QuickSortUtil.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("Cheapest Tickets:");
        printTopCheapest(tickets, 3);

        System.out.println("\n Most Expensive Tickets:");
        printTopExpensive(tickets, 3);
    }
    

     static void printTopCheapest(Ticket[] tickets,int k){
        for(int i =0;i<k && i<tickets.length;i++){
            System.out.println(tickets[i].eventName + " Rs." + tickets[i].price);
        }
     }

     static void printTopExpensive(Ticket[] tickets, int k) {
        for (int i = tickets.length - 1; i >= tickets.length - k; i--) {
            System.out.println(tickets[i].eventName + " - ₹" + tickets[i].price);
        }
    }
}
