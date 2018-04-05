/**
 * Created by IntelliJ IDEA.<br>
 * User: Alexey<br>
 * Date: 28.03.2018<br>
 * Time: 20:43<br>
 * todo javadoc
 */
    import java.util.Scanner;
    public class App {



    public static void main( String[] args ) {

        System.out.println("Выберите операцию. Введите число 1 или 2 ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        //scanner.close();
        switch (choice) {
            case 1:
                calculate();
                break;
            case 2:
                System.out.println(getBiggerWord(getWords()));
                break;
        }

       // System.out.println(getBiggerWord(getWords()));
        //calculate();
    }

    public static void calculate () {
        System.out.println("Запустился калькулятор. Введите число, знак операции, второе число ");
        Scanner scanner1 = new Scanner(System.in);
        String num1 = scanner1.next();
        char digit = scanner1.next().charAt(0);
        String num2 = scanner1.next();
        Float a = Float.parseFloat(num1);
        Float b = Float.parseFloat(num2);
        if (digit == '+'){
            System.out.printf("%.4f", a+b);
        } else if (digit == '-'){
            System.out.printf("%.4f", a-b);
        } else if (digit == '*'){
            System.out.printf("%.4f", a*b);
        } else if (digit == '/') {
            System.out.printf("%.4f", a/b);
        }
        scanner1.close();
            }

   public static String[] getWords(){
        System.out.println("Введите длину массива ");
        Scanner scanner2 = new Scanner(System.in);
        int l = scanner2.nextInt();
        String[] arr = new String[l];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите слово ");
            Scanner scanner3 = new Scanner(System.in);
            String word = scanner3.next();
            arr[i] = word;
            }
        scanner2.close();
       return arr;
   }

    public static String getBiggerWord(String[] arr) {
        String biggerWord = " ";
        int i = 0;
        while ( i<arr.length-1){
             biggerWord = arr[0];
             if (arr[i].length()<arr[i+1].length()){
                 biggerWord = arr[i+1];

             } else {
                 biggerWord = arr[i];
             }
             i++;


            }
        return biggerWord;



        }





    }


