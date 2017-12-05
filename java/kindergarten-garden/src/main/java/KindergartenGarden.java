import java.util.*;

public class KindergartenGarden {
    String plants;
    String[] studentArray;
    String[] firstRow = {".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","."};
    String[] secondRow = {".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","."};
    List<String> first = new ArrayList<>();
    List<String> second = new ArrayList<>();
    List<String> studentList = new ArrayList<>();
    static final String[] ALPHABET = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    Map<String, Integer> studentMap = new HashMap<>();

    void fillCollectionsOfLetters() {
        Collections.addAll(first, plants.split("\n")[0].split(""));
        Collections.addAll(second, plants.split("\n")[1].split(""));
    }

    public KindergartenGarden(String plants) {
        this.plants = plants;

        fillCollectionsOfLetters();
        int n = 0;
        for (int i = 0; i < ALPHABET.length; i++) {
            studentMap.put(ALPHABET[i], n);
            n += 2;
        }
    }

    public KindergartenGarden(String plants, String[] studentArray) {
        this.plants = plants;
        this.studentArray = studentArray;

        fillCollectionsOfLetters();
        studentList = Arrays.asList(studentArray);
        Collections.sort(studentList);
        int n = 0;
        for (int i = 0; i < studentList.size(); i++) {
            studentMap.put(studentList.get(i), n);
            n += 2;
        }
    }

    void showGarden() {
        for (int i = 0; i < first.size(); i++)
            firstRow[i] = first.get(i);
        for (int i = 0; i < second.size(); i++)
            secondRow[i] = second.get(i);
        
        System.out.println("[window]            [window]            [window]");
        for (String aFirstRow : firstRow) System.out.print(aFirstRow + " ");
        System.out.println();
        for (String aSecondRow : secondRow) System.out.print(aSecondRow + " ");
        System.out.println("\n");
    }

    List<Plant> getPlantsOfStudent(String student) {
        List<Plant> plants = new ArrayList<>();
        String firstLetter = String.valueOf(student.charAt(0));
        showGarden();

        if (studentArray == null) {
            for (int i = studentMap.get(firstLetter); i < studentMap.get(firstLetter) + 2; i++)
                plants.add(Plant.getPlant(firstRow[i].toCharArray()[0]));
            for (int i = studentMap.get(firstLetter); i < studentMap.get(firstLetter) + 2; i++)
                plants.add(Plant.getPlant(secondRow[i].toCharArray()[0]));
        }
        else {
            for (int i = studentMap.get(student); i < studentMap.get(student) + 2; i++)
                plants.add(Plant.getPlant(firstRow[i].toCharArray()[0]));
            for (int i = studentMap.get(student); i < studentMap.get(student) + 2; i++)
                plants.add(Plant.getPlant(secondRow[i].toCharArray()[0]));
        }

        if (plants.contains(null))
            throw new NullPointerException("No cups for this kid");
        else
            return plants;
    }