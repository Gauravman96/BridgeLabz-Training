
import java.util.Stack;

public class StockSpan {

    public static int[] calculateSpan(int []price){
        int n = price.length;
        int []span = new int[n];

        Stack<Integer>stack = new Stack<>();

        span[0]= 1;
        stack.push(0);
        for(int i=1;i<n;i++){

            // Pop prices smaller or equal to current
            while(! stack.isEmpty() && price[stack.peek()]<= price[i]){
                stack.pop();
            }
        
              span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
               stack.push(i);
        }
        return span;
    }
    
    public static void main(String[] args) {
        int []price = {100,67,89,40,50,36,80};
        int span[]= calculateSpan(price);

        for(int s : span){
            System.out.println(s +" ");
        }


    }
}
