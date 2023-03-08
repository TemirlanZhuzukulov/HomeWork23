import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        ArrayList<Integer> evenNumbers= new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i <= 50; i++) {
            int numbers= random.nextInt(1,100);
            if(numbers%2==1){
                evenNumbers.add(numbers);
            } else {
                oddNumbers.add(numbers);
            }
        }
        list.add(evenNumbers);
        list.add(oddNumbers);

        System.out.println("Even numbers:"+evenNumbers);
        System.out.println("Odd numbers"+oddNumbers);
        System.out.println("All in one arrray"+list);

    }
}