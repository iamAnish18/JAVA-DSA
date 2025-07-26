public class Bit{

    public static void OddEvenNumber(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("it is even number");
        }else{
            System.out.println("it is odd number");
        }
    }
    public static void main(String[] args) {
        System.out.println(5 & 6);//binary and
        System.out.println(5|6);//binary or
        System.out.println(5^6);//binary xor
        System.out.println(~5);//binary xor
        System.out.println(5<<2);//binary left side
        System.out.println(5>>2);//binary right side

        OddEvenNumber(15);
        OddEvenNumber(13);
        OddEvenNumber(14);
    }
}
