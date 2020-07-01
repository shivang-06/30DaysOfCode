

class Student extends Person{
	private int[] testScores; int a;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String fname, String lname, int id, int[] test){
        super(fname,lname,id);
        this.testScores = test;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        int sum = 0;
        for(int i=0;i<testScores.length;i++){
                a +=testScores[i];
        }
         a /= testScores.length;
        if(90<=a && a<=100){
            return 'O';
        }else if(80<=a && a<90){
            return 'E';
        }else if(70<=a && a<80){
            return 'A';
        }else if(55<=a && a<70){
            return 'P';
        }else if(40<=a && a<55){
            return 'D';
        }else if(0<=a && a<40){
            return 'T';
        }
        else
        return Character.MIN_VALUE;
    }
}

