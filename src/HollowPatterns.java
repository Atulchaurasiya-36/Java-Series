public class HollowPatterns {


    //Hollow Rectangle Star Pattern.
    public static void hollowRec(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



    // Hollow Half Pyramid Star Pattern.
    public static void hollowHalf(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j==1 || j==i || i==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



    //Hollow Diamond Star Pattern.
    public static void hollowDia(){
        int k=1;
        for(int i=1;i<=4;i++){
            k=1;
            for(int j=1;j<=7;j++){
                if(j>=5-i && j<=3+i && k==1){
                    System.out.print("*");
                    k=0;
                }
                else{
                    System.out.print(" ");
                    if(j==(3+i)-1)k=1;
                }
            }
            System.out.println();
        }
        for(int i=1;i<=3;i++){
            k=1;
            for(int j=1;j<=7;j++){
                if(j>=i+1 && j<=7-i && k==1){
                    System.out.print("*");
                    k=0;
                }
                else{
                    System.out.print(" ");
                    if(j==(7-i)-1)k=1;
                }
            }
            System.out.println();
        }
    }







    public static void main(String[] args) {
//        hollowRec();
//        hollowHalf();
        hollowDia();

    }
}
