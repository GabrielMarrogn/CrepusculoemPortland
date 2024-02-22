import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[][] arr = new int[a + 1][a + 1];
        List<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                arr[i][k] = sc.nextInt();
            }
        }

        for (int k = 0; k < a; k++) {
            for (int i = 0; i < a; i++) {
                int b = arr[k][i];
                int c = arr[k][i + 1];
                int d = arr[k+1][i];
                int e = arr[k+1][i + 1];

                if (b + c + d + e > 1) {
                    list.add("S");
                } else {
                    list.add("U");
                }
            }
        }

        for(int i = 0; i < list.size(); i++){
            int cont = i+1;
            if(cont%a == 0){
                System.out.println(list.get(i));
            }else{
                System.out.print(list.get(i));
            }
            
        }

        sc.close();
    }
}
