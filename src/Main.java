public class Main {

    public static void main(String[] args) {

        boolean result = FlourPacker.canPack(2,2,11);
        System.out.println(result);
    }
}

//
// if (totalSum == goal) {
//         System.out.println(true);
//         } else if (totalSum > goal) {
//         if (totalSum % goal == 1) {
//         System.out.println(true);
//         } else if(smallCountKilos % goal == 1) {
//         System.out.print(true);
//         } else {
//         System.out.print(false);
//         }
//         }
