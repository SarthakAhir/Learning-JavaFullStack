import java.util.Arrays;
class Array4{

public static void main(String[] args){

int[] marks ={87,90,56,78,100};

Arrays.sort(marks);

 for (int i = marks.length - 1, j = 0; i >= 0 && j < marks.length; i--, j++) {
            System.out.println((j + 1) + " Rank marks is " + marks[i]);
        }
}
}