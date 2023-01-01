import java.util.Scanner;
public class P8task9_184 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int san = sc.nextInt();
        int pop = sc.nextInt();
        int san1 = 0;
        for (int i = 0; i<pop; i++){
        	san1 = san%10;
        	if(san1 == 0) san = san/10;
        	else san = san - 1;
        }
        System.out.println(san);
    }
}