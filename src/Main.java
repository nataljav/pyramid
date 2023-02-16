public class Main {
    public static void main(String[] args) {


        // (a)

        int num = 5;


        for (int i = 1; i <= num; i++){
            for (int a = 1; a <= i; a++){
                System.out.print("* ");
            }
            System.out.println();
        }





        // (b)


        int num2 = 5, b = 0;


        for (int i = 1; i <= num2; ++i, b = 0){
            for (int a = 1; a <= num2 - i; ++a){
                System.out.print(" ");
            }
            while (b != 2 * i - 1) {


                System.out.print("*");
                ++b;
            }
            System.out.println();


        }






        // (c)


        int num3 = 5;


        for(int i = num3; i >= 1; --i) {
            for(int d = 1; d <= num3 - i; ++d) {
                System.out.print(" ");
            }


            for(int s=i; s <= 2 * i - 1; ++s) {
                System.out.print("*");
            }


            for(int s = 0; s < i - 1; ++s) {
                System.out.print("*");
            }


            System.out.println();
        }







        // (d)




        int num4 = 5;
        for (int e = 0; e < num4; e++) {

            for (int w = 0; w < num4 - e - 1; w++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * e + 1; k++) {
                System.out.print(k+1);
            }
            System.out.println();
        }





        // (e)


        int num5 = 5;


        for (int r = 1; r <= num5; r++) {


            for (int j = num5; j > r; j--) {
                System.out.print(" ");
            }


            for (int t = 0; t < r * 2 - 1; t++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int r = 1; r <= num5 - 1; r++) {

            for (int j = 0; j < r; j++) {
                System.out.print(" ");
            }


            for (int t = (num5 - r) * 2 - 1; t > 0; t--) {
                System.out.print("*");
            }
            System.out.println();
        }









    }
}
