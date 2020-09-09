import java.util.Random;
import java.util.Scanner;
public class Main {

    static int fact(int n){
        int resolt = 1;
        for (int i = 1; i <= n; i++)
        {
            resolt = resolt * i;
        }
        return resolt;
    }

    public static void main(String[] args) {
        float[] arr1 = {1, 2, 3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 };
        float [] arr2=new float[10];
        int [] arr3 = new int [10];
        float sum;

        System.out.println("задание 1");
        sum = 0;
        for (int i= 0;i<10;i++)
        {
            sum = sum + arr1[i];
        }
        System.out.println(sum);

        System.out.println('\n' + "задание 2");
        sum = 0;
        for (int i=0;i<10;i++)
        {
            arr2 [i] = 1/arr1[i];
            sum = sum + arr2 [i];
    //      System.out.println(arr2[i]);
        }
        System.out.println(sum);

        System.out.println('\n' +"задание 3");
        System.out.println("начальный массив:");
        for (int i=0;i<10;i++)
        {
            arr3[i] = (int)(Math.random()*100);
          System.out.print(arr3[i]+ " ");
        }
        for (int i = 0; i < 10; i++)
        {
            int min = arr3[i];
            int min_i = i;
            for (int j = i+1; j < 10; j++)
            {
                if (arr3[j] < min)
                {
                    min = arr3[j];
                    min_i = j;
                }
            }

            if (i != min_i)
            {

                int tmp = arr3[i];
                arr3[i] = arr3[min_i];
                arr3[min_i] = tmp;
            }
        }
        System.out.println('\n'+"отсортированный массив");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(arr3[i]+ " ");
        }
    /*  int min = 0;
        int max = 100;
        int diff = max - min;
        int [] arr = new int [10];
        Random random = new Random();
        for (int i = 0; i < 10; i++)
        {
            arr[i] = random.nextInt(diff + 1);
            i += min;
            System.out.println(arr[i]);
        } */
        System.out.println('\n' +"задание 4");

        System.out.println("Факториал какого числа искать = ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Факториал числа " + n + " = " + fact(n));
        }
    }



