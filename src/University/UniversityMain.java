package University;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class UniversityMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to calculate ?");
        System.out.println("1. Average rating for student");
        System.out.println("2. Average rating of subject for group");
        System.out.println("3. Average rating of subject for faculty");
        System.out.println("4. Average rating of subject for university");
        int Selection = sc.nextInt();

        switch (Selection) {
            case 1:
                System.out.println("In which group does your student learn");
                System.out.println("1. CyberSecurity 1");
                System.out.println("2. CyberSecurity 2");
                System.out.println("3. Translation 3");
                System.out.println("4. Translation 4");
                System.out.println("5. Engineering 5");
                System.out.println("6. Engineering 6");
                int Group = 0;

                try {
                    Group = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Enter only numbers");
                }

                switch (Group) {
                    case 1:
                        System.out.println("Select student");
                        System.out.println("1. FirstStudent");
                        System.out.println("2. SecondStudent");
                        System.out.println("3. ThirdStudent");
                        System.out.println("4. FreeStudent");
                        int Student = 0;
                        try {
                            Student = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only numbers");
                        }

                        switch (Student) {
                            case 1:
                                String[] Subjects1 = Setting.FirstStudent.Subjects;
                                int[] marks1 = new int[Subjects1.length];
                                for (int i = 0; i < Subjects1.length; i++) {
                                    System.out.println("Set mark for " + Subjects1[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks1[i] = mark;
                                }
                                System.out.println("Average mark of FirstStudent is " + Setting.AverageCounter(marks1));
                                break;

                            case 2:
                                String[] Subjects2 = Setting.SecondStudent.Subjects;
                                int[] marks2 = new int[Subjects2.length];
                                for (int i = 0; i < Subjects2.length; i++) {
                                    System.out.println("Set mark for " + Subjects2[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks2[i] = mark;
                                }
                                System.out.println("Average mark of SecondStudent is " + Setting.AverageCounter(marks2));
                                break;

                            case 3:
                                String[] Subjects3 = Setting.ThirdStudent.Subjects;
                                int[] marks3 = new int[Subjects3.length];
                                for (int i = 0; i < Subjects3.length; i++) {
                                    System.out.println("Set mark for " + Subjects3[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks3[i] = mark;
                                }
                                System.out.println("Average mark of ThirdStudent is " + Setting.AverageCounter(marks3));
                                break;

                            case 4:
                                throw new NoSubjectException();
                        }
                        break;

                    case 2:
                        System.out.println("Select student");
                        System.out.println("1. FourthStudent");
                        System.out.println("2. FifthStudent");
                        System.out.println("3. SixthStudent");
                        System.out.println("4. FreeStudent");

                        int Student2 = 0;
                        try {
                            Student2 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only numbers");
                        }
                        switch (Student2) {
                            case 1:
                                String[] Subjects1 = Setting.FourthStudent.Subjects;
                                int[] marks1 = new int[Subjects1.length];
                                for (int i = 0; i < Subjects1.length; i++) {
                                    System.out.println("Set mark for " + Subjects1[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks1[i] = mark;
                                }
                                System.out.println("Average mark of FourthStudent is " + Setting.AverageCounter(marks1));
                                break;

                            case 2:
                                String[] Subjects2 = Setting.FifthStudent.Subjects;
                                int[] marks2 = new int[Subjects2.length];
                                for (int i = 0; i < Subjects2.length; i++) {
                                    System.out.println("Set mark for " + Subjects2[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks2[i] = mark;
                                }
                                System.out.println("Average mark of FifthStudent is " + Setting.AverageCounter(marks2));
                                break;

                            case 3:
                                String[] Subjects3 = Setting.SixthStudent.Subjects;
                                int[] marks3 = new int[Subjects3.length];
                                for (int i = 0; i < Subjects3.length; i++) {
                                    System.out.println("Set mark for " + Subjects3[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks3[i] = mark;
                                }
                                System.out.println("Average mark of SixthStudent is " + Setting.AverageCounter(marks3));
                                break;

                            case 4:
                                throw new NoSubjectException();
                        }
                        break;

                    case 3:
                        System.out.println("Select student");
                        System.out.println("1. SeventhStudent");
                        System.out.println("2. EighthStudent");
                        System.out.println("3. NinthStudent");
                        System.out.println("4. FreeStudent");

                        int Student3 = 0;
                        try {
                            Student3 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only numbers");
                        }
                        switch (Student3) {
                            case 1:
                                String[] Subjects1 = Setting.SeventhStudent.Subjects;
                                int[] marks1 = new int[Subjects1.length];
                                for (int i = 0; i < Subjects1.length; i++) {
                                    System.out.println("Set mark for " + Subjects1[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks1[i] = mark;
                                }
                                System.out.println("Average mark of SeventhStudent is " + Setting.AverageCounter(marks1));
                                break;

                            case 2:
                                String[] Subjects2 = Setting.EighthStudent.Subjects;
                                int[] marks2 = new int[Subjects2.length];
                                for (int i = 0; i < Subjects2.length; i++) {
                                    System.out.println("Set mark for " + Subjects2[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks2[i] = mark;
                                }
                                System.out.println("Average mark of EighthStudent is " + Setting.AverageCounter(marks2));
                                break;

                            case 3:
                                String[] Subjects3 = Setting.NinthStudent.Subjects;
                                int[] marks3 = new int[Subjects3.length];
                                for (int i = 0; i < Subjects3.length; i++) {
                                    System.out.println("Set mark for " + Subjects3[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks3[i] = mark;
                                }
                                System.out.println("Average mark of NinthStudent is " + Setting.AverageCounter(marks3));
                                break;

                            case 4:
                                throw new NoSubjectException();
                        }
                        break;

                    case 4:
                        System.out.println("Select student");
                        System.out.println("1. TenthStudent");
                        System.out.println("2. EleventhStudent");
                        System.out.println("3. TwelfthStudent");
                        System.out.println("4. FreeStudent");

                        int Student4 = 0;
                        try {
                            Student4 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only numbers");
                        }
                        switch (Student4) {
                            case 1:
                                String[] Subjects1 = Setting.TenthStudent.Subjects;
                                int[] marks1 = new int[Subjects1.length];
                                for (int i = 0; i < Subjects1.length; i++) {
                                    System.out.println("Set mark for " + Subjects1[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks1[i] = mark;
                                }
                                System.out.println("Average mark of TenthStudent is " + Setting.AverageCounter(marks1));
                                break;

                            case 2:
                                String[] Subjects2 = Setting.EleventhStudent.Subjects;
                                int[] marks2 = new int[Subjects2.length];
                                for (int i = 0; i < Subjects2.length; i++) {
                                    System.out.println("Set mark for " + Subjects2[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks2[i] = mark;
                                }
                                System.out.println("Average mark of EleventhStudent is " + Setting.AverageCounter(marks2));
                                break;

                            case 3:
                                String[] Subjects3 = Setting.TwelfthStudent.Subjects;
                                int[] marks3 = new int[Subjects3.length];
                                for (int i = 0; i < Subjects3.length; i++) {
                                    System.out.println("Set mark for " + Subjects3[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks3[i] = mark;
                                }
                                System.out.println("Average mark of TwelfthStudent is " + Setting.AverageCounter(marks3));
                                break;

                            case 4:
                                throw new NoSubjectException();
                        }
                        break;

                    case 5:
                        System.out.println("Select student");
                        System.out.println("1. ThirteenthStudent");
                        System.out.println("2. FourteenthStudent");
                        System.out.println("3. FifteenthStudent");
                        System.out.println("4. FreeStudent");

                        int Student5 = 0;
                        try {
                            Student5 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only numbers");
                        }
                        switch (Student5) {
                            case 1:
                                String[] Subjects1 = Setting.ThirteenthStudent.Subjects;
                                int[] marks1 = new int[Subjects1.length];
                                for (int i = 0; i < Subjects1.length; i++) {
                                    System.out.println("Set mark for " + Subjects1[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks1[i] = mark;
                                }
                                System.out.println("Average mark of ThirteenthStudent is " + Setting.AverageCounter(marks1));
                                break;

                            case 2:
                                String[] Subjects2 = Setting.FourteenthStudent.Subjects;
                                int[] marks2 = new int[Subjects2.length];
                                for (int i = 0; i < Subjects2.length; i++) {
                                    System.out.println("Set mark for " + Subjects2[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks2[i] = mark;
                                }
                                System.out.println("Average mark of FourteenthStudent is " + Setting.AverageCounter(marks2));
                                break;

                            case 3:
                                String[] Subjects3 = Setting.FifteenthStudent.Subjects;
                                int[] marks3 = new int[Subjects3.length];
                                for (int i = 0; i < Subjects3.length; i++) {
                                    System.out.println("Set mark for " + Subjects3[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks3[i] = mark;
                                }
                                System.out.println("Average mark of FifteenthStudent is " + Setting.AverageCounter(marks3));
                                break;

                            case 4:
                                throw new NoSubjectException();
                        }
                        break;

                    case 6:
                        System.out.println("Select student");
                        System.out.println("1. SixteenthStudent");
                        System.out.println("2. SeventeenthStudent");
                        System.out.println("3. EighteenthStudent");
                        System.out.println("4. FreeStudent");

                        int Student6 = 0;
                        try {
                            Student6 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only numbers");
                        }
                        switch (Student6) {
                            case 1:
                                String[] Subjects1 = Setting.SixteenthStudent.Subjects;
                                int[] marks1 = new int[Subjects1.length];
                                for (int i = 0; i < Subjects1.length; i++) {
                                    System.out.println("Set mark for " + Subjects1[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks1[i] = mark;
                                }
                                System.out.println("Average mark of SixteenthStudent is " + Setting.AverageCounter(marks1));
                                break;

                            case 2:
                                String[] Subjects2 = Setting.SeventeenthStudent.Subjects;
                                int[] marks2 = new int[Subjects2.length];
                                for (int i = 0; i < Subjects2.length; i++) {
                                    System.out.println("Set mark for " + Subjects2[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks2[i] = mark;
                                }
                                System.out.println("Average mark of SeventeenthStudent is " + Setting.AverageCounter(marks2));
                                break;

                            case 3:
                                String[] Subjects3 = Setting.EighteenthStudent.Subjects;
                                int[] marks3 = new int[Subjects3.length];
                                for (int i = 0; i < Subjects3.length; i++) {
                                    System.out.println("Set mark for " + Subjects3[i]);
                                    int mark = sc.nextInt();
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks3[i] = mark;
                                }
                                System.out.println("Average mark of EighteenthStudent is " + Setting.AverageCounter(marks3));
                                break;

                            case 4:
                                throw new NoSubjectException();
                        }
                }
                break;

            case 2:
                System.out.println("Select the group");
                System.out.println("1. CyberSecurity 1");
                System.out.println("2. CyberSecurity 2");
                System.out.println("3. Translation 3");
                System.out.println("4. Translation 4");
                System.out.println("5. Engineering 5");
                System.out.println("6. Engineering 6");
                System.out.println("7. FreeGroup");

                int group = 0;
                try {
                    group = sc.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Enter only numbers");
                }

               /* System.out.println("Please select the subject");
                System.out.println("1. Math");
                System.out.println("2. Physics");
                System.out.println("3. Cryptography");
                System.out.println("4. English");
                System.out.println("5. Russian");
                System.out.println("6. Armenian");
                System.out.println("7. Materials Science");

                int subject = 0;
                try {
                    subject = sc.nextInt();
                }catch (InputMismatchException){
                    System.out.println("Enter only numbers");
                }*/

                switch (group){
                    case 1:
                        System.out.println("Please select the subject");
                        System.out.println("1. Math");
                        System.out.println("2. Physics");
                        System.out.println("3. Cryptography");
                        System.out.println("4. English");

                        int subject = 0;
                        String sub = "";
                        try {
                            subject = sc.nextInt();
                        }catch (InputMismatchException e){
                            System.out.println("Enter only numbers");
                        }

                        switch (subject){
                            case 1:
                                sub = "Math";
                                break;
                            case 2:
                                sub = "Physics";
                                break;
                            case 3:
                                sub = "Cryptography";
                                break;
                            case 4:
                                sub = "English";
                                break;
                        }

                        int[] marks = new int[3];
                        String[] students = {"FirstStudent", "SecondStudent", "ThirdStudent"};

                        for (int i = 0; i < 3; i++) {
                            System.out.println("Set " + sub + " mark for " + students[i]);
                            int mark = 0;
                            try {
                                mark = sc.nextInt();
                            }catch (InputMismatchException e){
                                System.out.println("Enter only numbers");
                            }
                            if (mark < 0 || mark > 10) {
                                throw new MarkException();
                            }
                            marks[i] = mark;
                        }
                        System.out.println("Average mark of " + sub + " for group 'CyberSecurity 1' is " + Setting.AverageCounter(marks));


                }
        }
    }
}



