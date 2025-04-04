import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;
import java.util.Random;

public class yourmom {
        public static void main(String[] args) {
            ArrayList<String> all_courses = new ArrayList<>();
            ArrayList<Integer> offers = offering();
            ArrayList<String> data = getFileData("src/text");
            ArrayList<String> rooms = room();
            for (int i = 0; i < data.size() - 1; i++) {
                for (int j = 0; j < offers.get(i); j++) {
                    all_courses.add(data.get(i));
                }
            }
            System.out.println(all_courses);
            System.out.println(offers);
            System.out.println(all_courses.size());
            System.out.println(rooms.size());
        }

        public static ArrayList<Integer> offering() {
            ArrayList<Integer> offering = new ArrayList<>();
            Random rand = new Random();
            for (int i = 0; i < 93; i++) {
                offering.add(rand.nextInt(1,5));
            }
            return offering;
        }

        public static void schedule(ArrayList<Integer> x){
            ArrayList<String> fileData = getFileData("src/text");
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    int random = rand.nextInt(93);
                    System.out.println(fileData.get(random));
                }
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
                            room.add(floors[k] + wing[w] + i + " " + j);
                        }
                    }
                }
            }
            return room;
        }
}