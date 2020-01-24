package University;

import University.Exceptions.NoFacultyException;
import University.Exceptions.NoGroupException;
import University.Exceptions.NoStudentException;
import University.Exceptions.NoSubjectException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {

    protected void StartCalculation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to calculate ?");
        System.out.println("");
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
                } catch (InputMismatchException e) {
                    System.out.println("Enter only numbers");
                }


                switch (group) {
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
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only numbers");
                        }

                        switch (subject) {
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
                            } catch (InputMismatchException e) {
                                System.out.println("Enter only numbers");
                            }
                            if (mark < 0 || mark > 10) {
                                throw new MarkException();
                            }
                            marks[i] = mark;
                        }
                        System.out.println("Average mark of " + sub + " for group 'CyberSecurity 1' is " + Setting.AverageCounter(marks));
                        break;

                    case 2:
                        System.out.println("Please select the subject");
                        System.out.println("1. Math");
                        System.out.println("2. Physics");
                        System.out.println("3. Cryptography");
                        System.out.println("4. English");

                        int subject2 = 0;
                        String sub2 = "";
                        try {
                            subject2 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only numbers");
                        }

                        switch (subject2) {
                            case 1:
                                sub2 = "Math";
                                break;
                            case 2:
                                sub2 = "Physics";
                                break;
                            case 3:
                                sub2 = "Cryptography";
                                break;
                            case 4:
                                sub2 = "English";
                                break;
                        }

                        int[] marks2 = new int[3];
                        String[] students2 = {"FourthStudent", "FifthStudent", "SixthStudent"};

                        for (int i = 0; i < 3; i++) {
                            System.out.println("Set " + sub2 + " mark for " + students2[i]);
                            int mark = 0;
                            try {
                                mark = sc.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Enter only numbers");
                            }
                            if (mark < 0 || mark > 10) {
                                throw new MarkException();
                            }
                            marks2[i] = mark;
                        }
                        System.out.println("Average mark of " + sub2 + " for group 'CyberSecurity 2' is " + Setting.AverageCounter(marks2));
                        break;

                    case 3:
                        System.out.println("Please select the subject");
                        System.out.println("1. English");
                        System.out.println("2. Russian");
                        System.out.println("3. Armenian");

                        int subject3 = 0;
                        String sub3 = "";
                        try {
                            subject3 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only numbers");
                        }

                        switch (subject3) {
                            case 1:
                                sub3 = "English";
                                break;
                            case 2:
                                sub3 = "Russian";
                                break;
                            case 3:
                                sub3 = "Armenian";
                                break;

                        }

                        int[] marks3 = new int[3];
                        String[] students3 = {"SeventhStudent", "EighthStudent", "NinthStudent"};

                        for (int i = 0; i < 3; i++) {
                            System.out.println("Set " + sub3 + " mark for " + students3[i]);
                            int mark = 0;
                            try {
                                mark = sc.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Enter only numbers");
                            }
                            if (mark < 0 || mark > 10) {
                                throw new MarkException();
                            }
                            marks3[i] = mark;
                        }
                        System.out.println("Average mark of " + sub3 + " for group 'Translation 3' is " + Setting.AverageCounter(marks3));
                        break;

                    case 4:
                        System.out.println("Please select the subject");
                        System.out.println("1. English");
                        System.out.println("2. Russian");
                        System.out.println("3. Armenian");

                        int subject4 = 0;
                        String sub4 = "";
                        try {
                            subject4 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only numbers");
                        }

                        switch (subject4) {
                            case 1:
                                sub4 = "English";
                                break;
                            case 2:
                                sub4 = "Russian";
                                break;
                            case 3:
                                sub4 = "Armenian";
                                break;

                        }

                        int[] marks4 = new int[3];
                        String[] students4 = {"TenthStudent", "EleventhStudent", "TwelfthStudent"};

                        for (int i = 0; i < 3; i++) {
                            System.out.println("Set " + sub4 + " mark for " + students4[i]);
                            int mark = 0;
                            try {
                                mark = sc.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Enter only numbers");
                            }
                            if (mark < 0 || mark > 10) {
                                throw new MarkException();
                            }
                            marks4[i] = mark;
                        }
                        System.out.println("Average mark of " + sub4 + " for group 'Translation 4' is " + Setting.AverageCounter(marks4));
                        break;

                    case 5:
                        System.out.println("Please select the subject");
                        System.out.println("1. Math");
                        System.out.println("2. Physics");
                        System.out.println("3. Materials Science");
                        System.out.println("4. Russian");

                        int subject5 = 0;
                        String sub5 = "";
                        try {
                            subject5 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only numbers");
                        }

                        switch (subject5) {
                            case 1:
                                sub5 = "Math";
                                break;
                            case 2:
                                sub5 = "Physics";
                                break;
                            case 3:
                                sub5 = "Materials Science";
                                break;
                            case 4:
                                sub5 = "Russian";
                                break;


                        }

                        int[] marks5 = new int[3];
                        String[] students5 = {"ThirteenthStudent", "FourteenthStudent", "FifteenthStudent"};

                        for (int i = 0; i < 3; i++) {
                            System.out.println("Set " + sub5 + " mark for " + students5[i]);
                            int mark = 0;
                            try {
                                mark = sc.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Enter only numbers");
                            }
                            if (mark < 0 || mark > 10) {
                                throw new MarkException();
                            }
                            marks5[i] = mark;
                        }
                        System.out.println("Average mark of " + sub5 + " for group 'Engineering 5' is " + Setting.AverageCounter(marks5));
                        break;

                    case 6:
                        System.out.println("Please select the subject");
                        System.out.println("1. Math");
                        System.out.println("2. Physics");
                        System.out.println("3. Materials Science");
                        System.out.println("4. Russian");

                        int subject6 = 0;
                        String sub6 = "";
                        try {
                            subject6 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only numbers");
                        }

                        switch (subject6) {
                            case 1:
                                sub6 = "Math";
                                break;
                            case 2:
                                sub6 = "Physics";
                                break;
                            case 3:
                                sub6 = "Materials Science";
                                break;
                            case 4:
                                sub6 = "Russian";
                                break;


                        }

                        int[] marks6 = new int[3];
                        String[] students6 = {"SixteenthStudent", "SeventeenthStudent", "EighteenthStudent"};

                        for (int i = 0; i < 3; i++) {
                            System.out.println("Set " + sub6 + " mark for " + students6[i]);
                            int mark = 0;
                            try {
                                mark = sc.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Enter only numbers");
                            }
                            if (mark < 0 || mark > 10) {
                                throw new MarkException();
                            }
                            marks6[i] = mark;
                        }
                        System.out.println("Average mark of " + sub6 + " for group 'Engineering 6' is " + Setting.AverageCounter(marks6));
                        break;

                    case 7:
                        throw new NoStudentException();

                }
                break;

            case 3:
                System.out.println("Select the faculty");
                System.out.println("1. CyberSecurity");
                System.out.println("2. Translation");
                System.out.println("3. Engineering");
                System.out.println("4. Free faculty");

                int faculty = 0;
                try {
                    faculty = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Enter only numbers");
                }

                switch (faculty) {
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
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only numbers");
                        }

                        switch (subject) {
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

                        int[] marks = new int[6];
                        String[] students = {"FirstStudent", "SecondStudent", "ThirdStudent", "FourthStudent",
                                "FifthStudent", "SixthStudent"};

                        for (int i = 0; i < 6; i++) {
                            System.out.println("Set " + sub + " mark for " + students[i]);
                            int mark = 0;
                            try {
                                mark = sc.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Enter only numbers");
                            }
                            if (mark < 0 || mark > 10) {
                                throw new MarkException();
                            }
                            marks[i] = mark;
                        }
                        System.out.println("Average mark of " + sub + " for faculty 'CyberSecurity' is " + Setting.AverageCounter(marks));
                        break;

                    case 2:
                        System.out.println("Please select the subject");
                        System.out.println("1. English");
                        System.out.println("2. Russian");
                        System.out.println("3. Armenian");

                        int subject2 = 0;
                        String sub2 = "";
                        try {
                            subject2 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only numbers");
                        }

                        switch (subject2) {
                            case 1:
                                sub2 = "English";
                                break;
                            case 2:
                                sub2 = "Russian";
                                break;
                            case 3:
                                sub2 = "Armenian";
                                break;
                        }

                        int[] marks2 = new int[6];
                        String[] students2 = {"SeventhStudent", "EighthStudent", "NinthStudent", "TenthStudent",
                                "EleventhStudent", "TwelfthStudent"};

                        for (int i = 0; i < 6; i++) {
                            System.out.println("Set " + sub2 + " mark for " + students2[i]);
                            int mark = 0;
                            try {
                                mark = sc.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Enter only numbers");
                            }
                            if (mark < 0 || mark > 10) {
                                throw new MarkException();
                            }
                            marks2[i] = mark;
                        }
                        System.out.println("Average mark of " + sub2 + " for faculty 'Translation' is " + Setting.AverageCounter(marks2));
                        break;

                    case 3:
                        System.out.println("Please select the subject");
                        System.out.println("1. Math");
                        System.out.println("2. Physics");
                        System.out.println("3. Materials Science");
                        System.out.println("4. Russian");

                        int subject3 = 0;
                        String sub3 = "";
                        try {
                            subject3 = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only numbers");
                        }

                        switch (subject3) {
                            case 1:
                                sub3 = "Math";
                                break;
                            case 2:
                                sub3 = "Physics";
                                break;
                            case 3:
                                sub3 = "Materials Science";
                                break;
                            case 4:
                                sub3 = "Russian";
                                break;
                        }

                        int[] marks3 = new int[6];
                        String[] students3 = {"ThirteenthStudent", "FourteenthStudent", "FifteenthStudent", "SixteenthStudent",
                                "SeventeenthStudent", "EighteenthStudent"};

                        for (int i = 0; i < 6; i++) {
                            System.out.println("Set " + sub3 + " mark for " + students3[i]);
                            int mark = 0;
                            try {
                                mark = sc.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Enter only numbers");
                            }
                            if (mark < 0 || mark > 10) {
                                throw new MarkException();
                            }
                            marks3[i] = mark;
                        }
                        System.out.println("Average mark of " + sub3 + " for faculty 'Engineering' is " + Setting.AverageCounter(marks3));
                        break;

                    case 4:
                        throw new NoGroupException();
                }
                break;

            case 4:
                System.out.println("Select the university");
                System.out.println("1. CollectionMain University");
                System.out.println("2. Free University");

                int university = 0;
                try {
                    university = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Enter only numbers");
                }

                switch (university) {
                    case 1:
                        System.out.println("Please select the subject");
                        System.out.println("1. Math");
                        System.out.println("2. Physics");
                        System.out.println("3. Cryptography");
                        System.out.println("4. English");
                        System.out.println("5. Russian");
                        System.out.println("6. Armenian");
                        System.out.println("7. Material Science");

                        int subject = 0;
                        try {
                            subject = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Enter only numbers");
                        }

                        switch (subject) {
                            case 1:
                                String[] students = {"FirstStudent", "SecondStudent", "ThirdStudent",
                                        "FourthStudent", "FifthStudent", "SixthStudent", "ThirteenthStudent",
                                        "FourteenthStudent", "FifteenthStudent", "SixteenthStudent", "SeventeenthStudent",
                                        "EighteenthStudent"};
                                int[] marks = new int[students.length];
                                for (int i = 0; i < students.length; i++) {
                                    System.out.println("Set Math mark for " + students[i]);
                                    int mark = 0;
                                    try {
                                        mark = sc.nextInt();
                                    } catch (InputMismatchException e) {
                                        System.out.println("Enter only numbers");
                                    }
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks[i] = mark;
                                }
                                System.out.println("Average mark of Math for 'MainUniversity' is " + Setting.AverageCounter(marks));
                                break;

                            case 2:
                                String[] students2 = {"FirstStudent", "SecondStudent", "ThirdStudent",
                                        "FourthStudent", "FifthStudent", "SixthStudent", "ThirteenthStudent",
                                        "FourteenthStudent", "FifteenthStudent", "SixteenthStudent", "SeventeenthStudent",
                                        "EighteenthStudent"};
                                int[] marks2 = new int[students2.length];
                                for (int i = 0; i < students2.length; i++) {
                                    System.out.println("Set Physics mark for " + students2[i]);
                                    int mark = 0;
                                    try {
                                        mark = sc.nextInt();
                                    } catch (InputMismatchException e) {
                                        System.out.println("Enter only numbers");
                                    }
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks2[i] = mark;
                                }
                                System.out.println("Average mark of Physics for 'MainUniversity' is " + Setting.AverageCounter(marks2));
                                break;

                            case 3:
                                String[] students3 = {"FirstStudent", "SecondStudent", "ThirdStudent",
                                        "FourthStudent", "FifthStudent", "SixthStudent"};
                                int[] marks3 = new int[students3.length];
                                for (int i = 0; i < students3.length; i++) {
                                    System.out.println("Set Cryptography mark for " + students3[i]);
                                    int mark = 0;
                                    try {
                                        mark = sc.nextInt();
                                    } catch (InputMismatchException e) {
                                        System.out.println("Enter only numbers");
                                    }
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks3[i] = mark;
                                }
                                System.out.println("Average mark of Cryptography for 'MainUniversity' is " + Setting.AverageCounter(marks3));
                                break;

                            case 4:
                                String[] students4 = {"FirstStudent", "SecondStudent", "ThirdStudent",
                                        "FourthStudent", "FifthStudent", "SixthStudent", "SeventhStudent", "EighthStudent",
                                        "NinthStudent", "TenthStudent", "EleventhStudent", "TwelfthStudent"};
                                int[] marks4 = new int[students4.length];
                                for (int i = 0; i < students4.length; i++) {
                                    System.out.println("Set English mark for " + students4[i]);
                                    int mark = 0;
                                    try {
                                        mark = sc.nextInt();
                                    } catch (InputMismatchException e) {
                                        System.out.println("Enter only numbers");
                                    }
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks4[i] = mark;
                                }
                                System.out.println("Average mark of English for 'MainUniversity' is " + Setting.AverageCounter(marks4));
                                break;

                            case 5:
                                String[] students5 = {"SeventhStudent", "EighthStudent", "NinthStudent", "TenthStudent",
                                        "EleventhStudent", "TwelfthStudent", "ThirteenthStudent",
                                        "FourteenthStudent", "FifteenthStudent", "SixteenthStudent", "SeventeenthStudent",
                                        "EighteenthStudent"};
                                int[] marks5 = new int[students5.length];
                                for (int i = 0; i < students5.length; i++) {
                                    System.out.println("Set Russian mark for " + students5[i]);
                                    int mark = 0;
                                    try {
                                        mark = sc.nextInt();
                                    } catch (InputMismatchException e) {
                                        System.out.println("Enter only numbers");
                                    }
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks5[i] = mark;
                                }
                                System.out.println("Average mark of Russian for 'MainUniversity' is " + Setting.AverageCounter(marks5));
                                break;

                            case 6:
                                String[] students6 = {"SeventhStudent", "EighthStudent", "NinthStudent", "TenthStudent",
                                        "EleventhStudent", "TwelfthStudent"};
                                int[] marks6 = new int[students6.length];
                                for (int i = 0; i < students6.length; i++) {
                                    System.out.println("Set Armenian mark for " + students6[i]);
                                    int mark = 0;
                                    try {
                                        mark = sc.nextInt();
                                    } catch (InputMismatchException e) {
                                        System.out.println("Enter only numbers");
                                    }
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks6[i] = mark;
                                }
                                System.out.println("Average mark of Armenian for 'MainUniversity' is " + Setting.AverageCounter(marks6));
                                break;

                            case 7:
                                String[] students7 = {"ThirteenthStudent", "FourteenthStudent", "FifteenthStudent",
                                        "SixteenthStudent", "SeventeenthStudent", "EighteenthStudent"};
                                int[] marks7 = new int[students7.length];
                                for (int i = 0; i < students7.length; i++) {
                                    System.out.println("Set Material Science mark for " + students7[i]);
                                    int mark = 0;
                                    try {
                                        mark = sc.nextInt();
                                    } catch (InputMismatchException e) {
                                        System.out.println("Enter only numbers");
                                    }
                                    if (mark < 0 || mark > 10) {
                                        throw new MarkException();
                                    }
                                    marks7[i] = mark;
                                }
                                System.out.println("Average mark of Material Science for 'MainUniversity' is " + Setting.AverageCounter(marks7));
                                break;
                        }
                        break;

                    case 2:
                        throw new NoFacultyException();
                }
                break;
        }
    }
}
