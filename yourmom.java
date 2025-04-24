import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;

public class yourmom {
    static ArrayList<String> all_courses = new ArrayList<>();
        public static void main(String[] args) {
            Random rand = new Random();
            ArrayList<Integer> offers = offering();
            ArrayList<String> data = getFileData("src/text");
            ArrayList<String> rooms = room();
            ArrayList<Integer> randoms = new ArrayList<>();
            Schedule();
            while (randoms.size() != 94) {
                int num = rand.nextInt(1, 7201);
                if (!randoms.contains(num)) {
                    randoms.add(num);
                }
            }

            for (int o = 0; o < randoms.size(); o++) {
                String adder = rooms.get(randoms.get(o));
                data.set(o, data.get(o) + " " + adder);
            }

            for (int i = 0; i < 94; i++) {
                for (int j = 0; j < offers.get(i); j++) {
                    all_courses.add(data.get(i));
                }
            }
            //System.out.println(all_courses);
        }

        public static ArrayList<Integer> offering() {
            ArrayList<Integer> offering = new ArrayList<>();
            Random rand = new Random();
            for (int i = 0; i < 94; i++) {
                offering.add(rand.nextInt(1,5));
            }
            return offering;
        }

        public static void Schedule(){
            ArrayList<String> sloth = Students();
            ArrayList<String> news = new ArrayList<>();
            ArrayList<String> stuff = new ArrayList<>();
            Random rand = new Random();
            for (int i = 0; i < sloth.size(); i++) {
                while (stuff.size() < 10) {
                    int random = rand.nextInt(all_courses.size());
                    String course = all_courses.get(random);
                    if (!sloth.get(i).contains(course) && course.contains("AP")) {
                        stuff.add(all_courses.get(random));
                        stuff.add(all_courses.get(random));
                        for (int p = 0; p < 2; p++) {
                            for (int i = 0; i < all_courses.size(); i++) {

                            }
                        }
                    }
                    for (int o = 0; o < )
                    if (all_courses.get(random).contains("AP")) {
                    }
                }
            }
        }

        public static ArrayList<String> Students() {
            ArrayList<String> students = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                students.add("Student " + i);
            }
            return students;
        }
        public static ArrayList<String> getFileData(String fileName) {
            ArrayList<String> list1 = new ArrayList<String>();
            try {
                File f = new File(fileName);
                Scanner s = new Scanner(f);
                while (s.hasNextLine()) {
                    String line = s.nextLine();
                    if (!line.equals(""))
                        list1.add(line);
                }
                return list1;
            } catch (FileNotFoundException e) {
                list1.add("not found");
                return list1;
            }
        }

        public static ArrayList<String> room(){
            ArrayList<String> room = new ArrayList<>();
            String[] floors = {"B", "1", "2", "3", "4", "5", "6", "7", "8"};
            String[] wing = {"N", "S", "E", "W"};
            //rooms
            for (int k = 0; k < 9; k++) {
                for (int w = 0; w < 4; w++) {
                    for (int i = 1; i <= 20; i++) {
                        for (int j = 1; j < 11; j++) {
                            room.add(floors[k] + wing[w] + i);
                        }
                    }
                }
            }
            return room;
        }
}