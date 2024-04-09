public class PalindromeTriangle {
    public static void palindrome(){
        int k=0;
        for(int i=1;i<=5;i++){
            k=i;
            for(int j=1;j<=7;j++){
                if(j>=5-i && j<=3+i){
                    System.out.print(k);
                   k=(j<4)?k-1 :k+1;
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        palindrome();

    }
}
