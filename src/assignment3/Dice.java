import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author ZDH
 * @version 1.0
 * @date 2020/11/3 16:42
 */
public class Dice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//骰子的个数
        int round = sc.nextInt();//投掷多少次
        int[] record = new int[num*6+1];//记录结果
        Arrays.fill(record,0);

        Random rd = new Random();

        for(int i = 1;i<=round;i++){
            int sum = 0;
            int nowrecord[] = new int[num];//记录每一次的投掷情况

            for(int j =0;j<num;j++){//第i轮投掷的结果
                int dice = rd.nextInt(5)+1;
                nowrecord[j] = dice;
                sum += dice;
            }
            record[sum] ++;
            System.out.print("Throw "+i+":");
            for(int x= 0;x<num;x++){
                System.out.print(nowrecord[x]+" ");
            }
            System.out.println("="+sum);
        }

        System.out.println("records："+Arrays.toString(record));

        for(int i =1;i<record.length;i++){
            if(record[i]!=0){
                int num1 = record[i];
                int num2 = round;

                // 创建一个数值格式化对象
                NumberFormat numberFormat = NumberFormat.getInstance();

                // 设置精确到小数点后2位
                numberFormat.setMaximumFractionDigits(1);

                String result = numberFormat.format((float) num1 / (float) num2 * 100);

                System.out.println("the sum"+i+"appeared" +record[i]+"times,"+"which is"+ result + "%"+"of all throws");

            }
        }

    }
}
