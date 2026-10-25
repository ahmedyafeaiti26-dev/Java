import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        // level 1 : 
        int[] scores0 = {80, 75, 90, 65, 85};
        System.out.println("All Student Scores:");
        for (int i = 0; i < scores0.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + scores0[i]);
        }
        System.out.println("Score at index 2: " + scores0[2]);
        System.out.println("Array index starts at 0,");
        System.out.println("while student's position starts at 1.");






        int[] stock = {12, 8, 15, 6};
        System.out.println("First product stock: " + stock[0]);
        System.out.println("Last product stock: " + stock[stock.length - 1]);
        stock[1] = 10;
        System.out.println("Updated stock values:");
        for (int i = 0; i < stock.length; i++) {
            System.out.println("Product " + (i + 1) + ": " + stock[i]);
        }
        System.out.println("The array has " + stock.length + " elements.");
        System.out.println("Valid indexes are 0 to " + (stock.length - 1));
        System.out.println(stock[4]);








        // level 2 : 
        int[] scores = {75, 80, 65, 90, 55, 85, 70, 95};
        int sum = 0;
        int passCount = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = (double) sum / scores.length;
        System.out.println("Average score: " + average);
        System.out.println("Scores greater than average:");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > average) {
                System.out.println(scores[i]);
            }
        }
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 70) {
                passCount++;
            }
        }
        System.out.println("Number of students who pass: " + passCount);
        double percentage = (double) passCount / scores.length * 100;
        System.out.println("Pass percentage: " + percentage + "%");






        int[] productCodes = {101, 105, 110, 115, 120, 125};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter product code to search: ");
        int searchCode = input.nextInt();
        int index = -1;
        int checked = 0;
        for (int i = 0; i < productCodes.length; i++) {
            checked++;
            if (productCodes[i] == searchCode) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Product found!");
            System.out.println("Index: " + index);
        } else {
            System.out.println("Product is unavailable.");
        }
        System.out.println("Elements checked: " + checked);
        input.close();





        // level 3 :
        int[] ids = {101, 102, 101, 103, 102, 104, 105, 103};
        int n = ids.length;
        System.out.println("Duplicated participant IDs:");
        for (int i = 0; i < n; i++) {
            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (ids[k] == ids[i]) {
                    alreadyChecked = true;
                    break;
                }
            }
            if (alreadyChecked) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (ids[i] == ids[j]) {
                    System.out.println(ids[i]);
                    break;
                }
            }
        }
        int[] uniqueIds = new int[n];
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (ids[i] == uniqueIds[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueIds[uniqueCount] = ids[i];
                uniqueCount++;
            }
        }
        System.out.println("\nUnique participant IDs:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueIds[i] + " ");
        }
        System.out.println("\nNumber of unique participants: "
                           + uniqueCount);
        int newLength = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < newLength; j++) {
                if (ids[i] == ids[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                ids[newLength] = ids[i];
                newLength++;
            }
        }
        System.out.println("\nArray after in-place removal:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(ids[i] + " ");
        }
        System.out.println("\nNumber of unique IDs: " + newLength);
 

        int[] sco = {78, 90, 65, 90, 85, 72, 95, 85};
        for(int i = 0; i < sco.length; i++){
            for (int j = 0; j < sco.length; j++){
                if (sco[i] < sco[j]){
                    int temp = sco[i];
                    sco[i] = sco[j];
                    sco[j] = temp;
                }
            }
        }
        System.out.println("sorted scorse");

        for (int s : sco)
            System.out.println(s + " ");
        System.out.println("\nTop 3 distint scores:  ");

        int count = 0;
        for (int i = 0; i < sco.length; i++){
            if (i == 0 || sco[i] != sco[i - 1]){
                System.out.println(sco[i]);
                if (++count == 3)
                    break;
            }
        }
        System.out.println("Rankings:");
        for (int i = 0; i < sco.length; i++){
            int rank = i + 1;
            if (i > 0 && sco[i] == sco[i - 1])
                rank = i;
            System.out.println(sco[i] + "-Rank" + rank);
        }

        */



        // level 4 : 

        int[] data = {1, 2, 3, 4, 5};
        int[] original = data.clone();

        for (int i = 0; i < data.length; i++) {
            data[i] = original[i] + original[data.length - 1 - i];
        }

        System.out.println(java.util.Arrays.toString(data));


        int[] grade = {80, 70, 90, 60};
        int total = 0;
        for (int i = 0; i < grade.length; i++){
            total += grade[i];
        }
        double average = (double) total / grade.length;

        System.out.println(average);









    }
}


