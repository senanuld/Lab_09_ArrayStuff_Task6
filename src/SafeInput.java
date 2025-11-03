public class SafeInput {
    public static void main(String[] args) {

        int[] dataPoints = new int[100];
        int userValue = 0;

        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
            }
            count++;
            System.out.println("The value " + userValue + " was found " + count + " times.");

            for (int j = 0; j < dataPoints.length; j++) {
            }
            if (dataPoints[i] == userValue) {
                break;


            }
            System.out.println("The value " + userValue + " was found " + count + " times.");
            System.out.println("The value " + userValue + " was not found " + count + " times.");











        }
    }
}