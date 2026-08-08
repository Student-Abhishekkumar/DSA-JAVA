package Recursion;

class name_print {
    public void printName(String name, int n, int cnt){
        if (cnt==n) {
            return;
        }
        System.out.println(name);
        printName(name, n, cnt + 1);
    }     
}

public class Printing_name{
    public static void main(String[] args) {
        name_print np = new name_print();

        String name = "Abhishek Kumar";
        int n = 5;
        np.printName(name, n, 0);
    }
}