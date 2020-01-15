package University;

import javax.security.auth.Subject;

public class Setting {

    protected static String[] CyberSecSub = {"Math", "Physics", "Cryptography", "English"} ;
    protected static String[] TranslationSub = {"English", "Russian", "Armenian"} ;
    protected static String[] EngineeringSub = {"Math", "Physics", "Materials Science", "Russian"} ;

    protected static Faculty CyberSecurity = new Faculty("Cyber Security",CyberSecSub);
    protected static Faculty Translation = new Faculty("Translation",TranslationSub);
    protected static Faculty Engineering = new Faculty("Engineering",EngineeringSub);

    protected static Student FirstStudent = new Student.StudentBuilder("FirstStudent")
            .faculty(CyberSecurity)
            .group(1)
            .build();
    protected static Student SecondStudent = new Student.StudentBuilder("SecondStudent")
            .faculty(CyberSecurity)
            .group(1)
            .build();
    protected static Student ThirdStudent = new Student.StudentBuilder("ThirdStudent")
            .faculty(CyberSecurity)
            .group(1)
            .build();
    protected static Student FourthStudent = new Student.StudentBuilder("FourthStudent")
            .faculty(CyberSecurity)
            .group(2)
            .build();
    protected static Student FifthStudent = new Student.StudentBuilder("FifthStudent")
            .faculty(CyberSecurity)
            .group(2)
            .build();
    protected static Student SixthStudent = new Student.StudentBuilder("SixthStudent")
            .faculty(CyberSecurity)
            .group(2)
            .build();

    protected static Student SeventhStudent = new Student.StudentBuilder("SeventhStudent")
            .faculty(Translation)
            .group(3)
            .build();
    protected static Student EighthStudent = new Student.StudentBuilder("EighthStudent")
            .faculty(Translation)
            .group(3)
            .build();
    protected static Student NinthStudent = new Student.StudentBuilder("NinthStudent")
            .faculty(Translation)
            .group(3)
            .build();
    protected static Student TenthStudent = new Student.StudentBuilder("TenthStudent")
            .faculty(Translation)
            .group(4)
            .build();
    protected static Student EleventhStudent = new Student.StudentBuilder("EleventhStudent")
            .faculty(Translation)
            .group(4)
            .build();
    protected static Student TwelfthStudent = new Student.StudentBuilder("TwelfthStudent")
            .faculty(Translation)
            .group(4)
            .build();

    protected static Student ThirteenthStudent = new Student.StudentBuilder("ThirteenthStudent")
            .faculty(Engineering)
            .group(5)
            .build();
    protected static Student FourteenthStudent = new Student.StudentBuilder("FourteenthStudent")
            .faculty(Engineering)
            .group(5)
            .build();
    protected static Student FifteenthStudent = new Student.StudentBuilder("FifteenthStudent")
            .faculty(Engineering)
            .group(5)
            .build();
    protected static Student SixteenthStudent = new Student.StudentBuilder("SixteenthStudent")
            .faculty(Engineering)
            .group(6)
            .build();
    protected static Student SeventeenthStudent = new Student.StudentBuilder("SeventeenthStudent")
            .faculty(Engineering)
            .group(6)
            .build();
    protected static Student EighteenthStudent = new Student.StudentBuilder("EighteenthStudent")
            .faculty(Engineering)
            .group(6)
            .build();

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
