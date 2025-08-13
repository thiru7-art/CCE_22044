public class ControlStatementsDemo {
    public static void main(String[] args) {
        int num = 5;

        // if-else
        if (num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        // switch
        switch (num) {
            case 1: System.out.println("One"); break;
            case 5: System.out.println("Five"); break;
            default: System.out.println("Other");
        }

        // for loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("For loop: " + i);
        }

        // while loop
        int i = 1;
        while (i <= 3) {
            System.out.println("While loop: " + i);
            i++;
        }

        // do-while loop
        int j = 1;
        do {
            System.out.println("Do-while: " + j);
            j++;
        } while (j <= 3);

        // continue and break
        for (int k = 1; k <= 5; k++) {
            if (k == 3) continue; // skip 3
            if (k == 5) break;    // stop loop
            System.out.println("k: " + k);
        }
    }
}
