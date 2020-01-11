package University;

import javax.security.auth.Subject;

public class Setting {

    protected static String[] CyberSecSub = {"Math", "Physics", "Cryptography", "English"} ;
    protected static String[] TranslationSub = {"English", "Russian", "Armenian"} ;
    protected static String[] EngineeringSub = {"Math", "Physics", "Materials Science", "Russian"} ;

    protected static Faculty CyberSecurity = new Faculty("Cyber Security",CyberSecSub);
    protected static Faculty Translation = new Faculty("Translation",TranslationSub);
    protected static Faculty Engineering = new Faculty("Engineering",EngineeringSub);

    protected static Student FirstStudent = new Student("FirstStudent",CyberSecurity,1);
    protected static Student SecondStudent = new Student("SecondStudent",CyberSecurity,1);
    protected static Student ThirdStudent = new Student("ThirdStudent",CyberSecurity,1);
    protected static Student FourthStudent = new Student("FourthStudent",CyberSecurity,2);
    protected static Student FifthStudent = new Student("FifthStudent",CyberSecurity,2);
    protected static Student SixthStudent = new Student("SixthStudent",CyberSecurity,2);

    protected static Student SeventhStudent = new Student("SeventhStudent",Translation,3);
    protected static Student EighthStudent = new Student("EighthStudent",Translation,3);
    protected static Student NinthStudent = new Student("NinthStudent",Translation,3);
    protected static Student TenthStudent = new Student("TenthStudent",Translation,4);
    protected static Student EleventhStudent = new Student("EleventhStudent",Translation,4);
    protected static Student TwelfthStudent = new Student("TwelfthStudent",Translation,4);

    protected static Student ThirteenthStudent = new Student("ThirteenthStudent",Engineering,5);
    protected static Student FourteenthStudent = new Student("FourteenthStudent",Engineering,5);
    protected static Student FifteenthStudent = new Student("FifteenthStudent",Engineering,5);
    protected static Student SixteenthStudent = new Student("SixteenthStudent",Engineering,6);
    protected static Student SeventeenthStudent = new Student("SeventeenthStudent",Engineering,6);
    protected static Student EighteenthStudent = new Student("EighteenthStudent",Engineering,6);

    protected static float AverageCounter(int[] marks){
        int sum = 0;
        float count = 0;
        for (int i = 0; i < marks.length ; i++) {
            sum += marks[i];
        }
        count = (float)sum / marks.length;
        return count;
    }
}
