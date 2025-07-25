public class Pen {
    public static void main(String[] args) {
        int totalpen=14;
        int student=3;
        int penPerStudent=totalpen/student;
        int remainingPen=totalpen%student;
        System.out.println("pen per student is "+penPerStudent+" and remaining pen not distributed is "+ remainingPen);
    }
}
