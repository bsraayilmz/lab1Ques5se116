import java.util.Scanner;

public class array1 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int[] temperatureDay = new int[30];
    int hotDaysCount = 0;
    int temperature;
    int highestTemp=0;

    for(int i = 0 ; i< temperatureDay.length; i++){
        System.out.println("please enter temperature");
        temperature = scan.nextInt();
        temperatureDay[i]= temperature;
        temperatureDay[i] = highestTemp;
        if(temperature > 33){
            hotDaysCount++;
            if(temperature>highestTemp){
               highestTemp = temperature;
            }

        }
    }
        System.out.println("Total number of hot days: " + hotDaysCount);
        System.out.println("highest temperature:" + highestTemp);



    }
}
