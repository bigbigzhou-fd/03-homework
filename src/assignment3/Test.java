/**
 * @author ZDH
 * @version 1.0
 * @date 2020/11/7 20:53
 */
public class Test {

    public static void main(String[] args) {
//        int[] a = new int[3];
//
//
//        int[] c = {4,5,6,7,8};
//        System.out.println(c[0]);
//        System.out.println("length:"+c.length);
//        for(int i = 0;i<c.length;i++){
//            System.out.println(i+":"+c[i]);
//        }

        int[][] d = new int[2][3];
        for(int row = 0;row<d.length;row++){
            System.out.println("第"+row+"行:"+d[row].length);
            for(int len = 0;len<d[row].length;len++){
                System.out.print(d[row][len]+"***");
            }
            System.out.println("-----------");
        }

//        int[][] e = {{1,2,3,11},{4,5,6,7},{9,10}};
//
//        System.out.println("0-2"+e[0][2]);
//        System.out.println("0-3"+e[0][3]);
//
//        for(int row = 0;row<e.length;row++){
//            System.out.println("row:"+row+" "+e[row].length);
//            for(int len =0;len<e[row].length;len++){
//                System.out.print(e[row][len]+" ");
//            }
//            System.out.println("---");
//        }


    }
}
