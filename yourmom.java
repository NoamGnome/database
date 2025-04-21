import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;

public class yourmom {
        public static void main(String[] args) {
            Random rand = new Random();
            ArrayList<String> all_courses = new ArrayList<>();
            ArrayList<Integer> offers = offering();
            ArrayList<String> data = getFileData("src/text");
            ArrayList<String> rooms = room();
            ArrayList<Integer> randoms = new ArrayList<>();
            Schedule(all_courses);
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

        public static void Schedule(ArrayList<String> x){
            Random rand = new Random();
            for (int i = 1; i <= 10; i++) {
                ArrayList<String> temp = new ArrayList<>();
                while (temp.size() < 10) {
                    System.out.println("Student " + i);
                    int random = rand.nextInt(x.size());
                    String course = x.get(random);
                    int occurrences = Collections.frequency(temp, course);
                    if (occurrences < 4) {
                        temp.add(course);
                    }
                }
                System.out.println(temp);
                System.out.println();
            }
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