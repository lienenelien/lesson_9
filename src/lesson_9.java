public class lesson_9 {
    public static void main(String[] args) {

     //my fist array
        int [] fisrtArray = new int [3];
        fisrtArray[0] = 33;
        fisrtArray[1] = 44;
        fisrtArray[2] = 55;

        System.out.println("This is the first element: " + fisrtArray[0]);
        System.out.println("I want to get the other number. Like 55. here it is : " + fisrtArray[2]);


        //Shorthand array initialization
        int [] secondArray = {12, 13, 14, 15, 16, 17, };

        System.out.println("this is the fourth element: " + secondArray[3]);
        System.out.println("In the second array we have " + secondArray.length + " elements");
        System.out.println("last element in the array is: " + secondArray[secondArray.length -1]);

        int[] weatherForecast = new int[7];
        weatherForecast[0] = 29;
        weatherForecast[1] = 31;
        weatherForecast[2] = 30;
        weatherForecast[3] = 29;
        weatherForecast[4] = 28;
        weatherForecast[5] = 32;
        weatherForecast[6] = 25;

        double averageTemp = (weatherForecast[0]+weatherForecast[1]+weatherForecast[2]+weatherForecast[3]+weatherForecast[4]+weatherForecast[5]+weatherForecast[6]) /7d;
        System.out.println("Average temperature for the week is " + averageTemp + " degrees");

        //LOOPS

//        for (int i = 0; i < 10; i++){
//            System.out.println("Hello, you are in and iteration " + i);
//        }

        //AN INFINITE LOOP (for ;;)
//        for (int i = 0; i <10; i--) {
//            System.out.println("new iteration: " +i);
//
//        }

//        for (int i = 85; i <95; i++) {
//            System.out.println("Loop iteration " +i);
//            for (int j = 53; j > -47; j--) {
//                System.out.println("the loop is " +j);
//            }
//        }
//        int counter = 0;
//        for (int i = 59; i <10005; i++) {
//            System.out.println("this is interation #" + counter);
//            counter++;
//        }

        //ARRAYS +LOOPS

        int[] grades = {7, 8, 7, 9, 6, 9, 10, 6, 8, 8, 9 ,5, 10, 7, 7, 9};

        int gradeSum =0;

//        double average = grades[0] + grades[1] + grades[2].... / grades.length

        for (int i = 0; i <grades.length; i++) {
            //grades.length instead of number of elements in array

            gradeSum += grades[i];
            //(+= grades[i]) == gradeSum = gradeSum + grades[i]
        }
        System.out.println("Sum of all the grades is " +gradeSum);

        double averageGrade = gradeSum / (double)grades.length;
        System.out.println("The average grade is: " +averageGrade);







    }

}
