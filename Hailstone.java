public class Hailstone {
    public static void main(String args[]) {
        int startingNumber = 1;
        int numberOfCycles = 0;
        while (startingNumber <= 200) {
            int endingNumber = startingNumber;
            do {
                if (endingNumber % 2 == 0) {
                    endingNumber /= 2;
                } else {
                    endingNumber = (endingNumber * 3) + 1;
                }
                numberOfCycles++;
            } while (endingNumber != 1);
            System.out.println("in " + numberOfCycles + " cycles");
            startingNumber++;
        }
    }
}
// a) they all reach the cycle
// b) 200 yields the highest amount of cycles