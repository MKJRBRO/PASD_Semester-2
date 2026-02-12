import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] CODE = {'A','B','D','E','F','G','H','L','N','T'};

        char[][] KOTA = {
            {'B','A','N','T','E','N',' ',' ',' ',' ',' ',' '},
            {'J','A','K','A','R','T','A',' ',' ',' ',' ',' '},
            {'B','A','N','D','U','N','G',' ',' ',' ',' ',' '},
            {'C','I','R','E','B','O','N',' ',' ',' ',' ',' '},
            {'B','O','G','O','R',' ',' ',' ',' ',' ',' ',' '},
            {'P','E','K','A','L','O','N','G','A','N',' ',' '},
            {'S','E','M','A','R','A','N','G',' ',' ',' ',' '},
            {'S','U','R','A','B','A','Y','A',' ',' ',' ',' '},
            {'M','A','L','A','N','G',' ',' ',' ',' ',' ',' '},
            {'T','E','G','A','L',' ',' ',' ',' ',' ',' ',' '}
        };

        System.out.print("Enter license plate code: ");
        char inputCode = input.next().toUpperCase().charAt(0);

        boolean found = false;

        for (int i = 0; i < CODE.length; i++) {
            if (inputCode == CODE[i]) {
                System.out.print("City: ");
                for (int j = 0; j < KOTA[i].length; j++) {
                    System.out.print(KOTA[i][j]);
                }
                System.out.println();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Code not found");
        }

        input.close();
    }
}
