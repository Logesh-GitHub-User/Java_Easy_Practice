import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String num=scanner.nextLine();
        int sum = 0;
        for(char c : num.toCharArray()){
            sum += Integer.parseInt(String.valueOf(c));
        }
        System.out.println("Sum: "+sum);
        scanner.close();
    }
}
