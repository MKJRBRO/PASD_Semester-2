public class Practicum_4 {
    public static int calculateIncome(int aglonema, int yam, int alocasia, int rose) {
        int priceAglonema = 75000;
        int priceYam = 50000;
        int priceAlocasia = 60000;
        int priceRose = 10000;

        int totalIncome = (aglonema * priceAglonema)
                        + (yam * priceYam)
                        + (alocasia * priceAlocasia)
                        + (rose * priceRose);

        return totalIncome;
    }

    public static void showStatus(int income) {
        if (income > 1500000) {
            System.out.println("Status : Very Good");
        } else {
            System.out.println("Status : Need Evaluation");
        }
    }

    public static void main(String[] args) {

        
        int[][] stock = {
            {10, 5, 15, 7},   // RoyalGarden 1
            {6, 11, 9, 12},   // RoyalGarden 2
            {2, 10, 10, 5},   // RoyalGarden 3
            {5, 7, 12, 9}     // RoyalGarden 4
        };

        for (int i = 0; i < stock.length; i++) {

            int income = calculateIncome(
                    stock[i][0],
                    stock[i][1],
                    stock[i][2],
                    stock[i][3]
            );

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Total Income : IDR " + income);
            showStatus(income);
            System.out.println("------------------------");
        }
    }
}
