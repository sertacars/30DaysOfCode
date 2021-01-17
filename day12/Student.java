package day12;

import java.util.Arrays;

class Student extends Person {
    private int[] testScores;

    /*
     * Class Constructor
     * 
     * @param firstName - A string denoting the Person's first name.
     * 
     * @param lastName - A string denoting the Person's last name.
     * 
     * @param id - An integer denoting the Person's ID number.
     * 
     * @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here

    public Student (String firstName, String lastName, int id, int[] testScores){

        super(firstName, lastName, id);

        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = id;
        this.testScores = testScores;
    }

    /*
     * Method Name: calculate
     * 
     * @return A character denoting the grade.
     */
    // Write your method here

    public char calculate() {
        double score = Arrays.stream(testScores).average().orElse(Double.NaN);
        if (score >= 90 && score <= 100) {
            return 'O';
        } else if (score >= 80 && score < 90) {
            return 'E';
        } else if (score >= 70 && score < 80) {
            return 'A';
        } else if (score >= 55 && score < 70) {
            return 'P';
        } else if (score >= 40 && score < 55) {
            return 'D';
        } else if (score < 40) {
            return 'T';
        } else
            return 'X';
    }


}
