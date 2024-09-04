public class Max_Min {
    
        public static void main(String[] args) {
            int Max_Marks = 0;
            int Min_Marks = 100;
            int []Student_Marks = { 100 , 90 , 50};
            for (int i = 0 ; i < Student_Marks.length ; i++){
            if(Student_Marks[i] < Min_Marks){
                    Min_Marks = Student_Marks[i];
             } else if( Student_Marks[i] > Max_Marks){
                    Max_Marks = Student_Marks[i];}
            }
            System.out.println("Minimum marks : " + Min_Marks);
            System.out.println("Maximum marks : " + Max_Marks);
    }
}