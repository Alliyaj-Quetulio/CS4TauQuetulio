package lecture;

import java.util.ArrayList;

/**
 *
 * @author TAU
 */
public class Lecture {

    public static void main(String[] args) {
        Student mark = new Student("Mark", 14); //instance
        Student josh = new Student("Josh", 16);
       
        Item pen = new Item("Pen", 40);
        String[] days = {"Sunday", "Monday", "Tuesday"};
        System.out.println(days.length);
        
        String[] months = new String[12];
        System.out.println(months[0]);
        
        months[0] = "Jan";
        
        ArrayList<Item> itemList = new ArrayList();
        itemList.add(pen);
        
        System.out.println(Student.getStudent("Mark").getGrade());
        System.out.println(Student.getStudent("Nathan").getGrade());
    }
    
}
