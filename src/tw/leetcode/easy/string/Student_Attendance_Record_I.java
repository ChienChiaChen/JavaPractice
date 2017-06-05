package tw.leetcode.easy.string;

/**
 * Created by chiachen on 2017/6/5.
 */
public class Student_Attendance_Record_I {
    public static void main(String[] args) {
        String text1 = "PPALLP";
        System.out.println(checkAttendance(text1));
        String text2 = "PPALLL";
        System.out.println(checkAttendance(text2));
        String text3 = "";//for test
        System.out.println(checkAttendance(text3));

    }

    static boolean checkAttendance(String string){
        if (string == null || string.length() == 0) {
            return false;
        }
        int countA = 0, countL = 0;
        for (int i=0;i<string.length();i++) {
            if (string.charAt(i)=='A')
                countA++;
            else if (string.charAt(i)=='L')
                countL++;
            else if (countL != 3) {
                countL = 0;
            }
        }
        return !(countA == 2 || countL == 3);
    }

}
