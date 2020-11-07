import support.cse131.ArgsProcessor;

import java.util.Random;

/**
 * @author ZDH
 * @version 1.0
 * @date 2020/11/7 21:22
 */
public class Dice1 {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int x = ap.nextInt();//几个骰子 3
        int round =  ap.nextInt();//几轮  5

        Random rd = new Random();
//        int x =  rd.nextInt(5)+1;
        int[][] array = new int[round][x];

        //12 行 2 列 存储
        for(int y=0;y<round;y++){
            //第一轮 x个骰子 array[0][dice]
            for(int i = 0;i<x;i++){
                int num =  rd.nextInt(5)+1;//随机生成数字
                array[y][i] = num;
            }
        }

        System.out.println("打印数组");
        for(int i=0;i<array.length;i++){
            for(int y = 0;y<array[i].length;y++){
                System.out.print(array[i][y]+" ");
            }
            System.out.println("-------");
        }

        int[] countarray = new int[round];

        for(int i=0;i<array.length;i++){//？？多少个轮

            int sum = 0;//!!!!!我要计算的是我这一轮的结果，所以应该放在哪里？？？

            for(int y = 0;y<array[i].length;y++){//多少个骰子
                 sum = sum + array[i][y];
            }
            countarray[i] = sum;
        }
        System.out.println("每一行的总和");
        for(int i = 0;i<countarray.length;i++){
            System.out.println(i+":"+countarray[i]);
        }

//        array.length == countarray.length
        for(int i = 0;i<countarray.length;i++){
//            int num = countarray[i];
            int count = 1;
            for(int j = 0;j<countarray.length;j++){
                if(i != j && countarray[i]==countarray[j]){
                    count++;
                }
            }
            double result = count*1.0/countarray.length;
            System.out.println(countarray[i]+"出现的次数"+count);
            System.out.println(countarray[i]+"出现的概率"+result);
        }




    }
}
