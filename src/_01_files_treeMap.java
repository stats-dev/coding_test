import java.util.*;

public class _01_files_treeMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String[] fileArr = new String[N];
        Map<String, Integer> fileMap = new TreeMap<>();

        for(int i = 0; i < fileArr.length; i++){
            fileArr[i] = sc.nextLine();
            String mapKey = fileArr[i].split("[.]")[1];
            if(fileMap.containsKey(mapKey)){
                fileMap.put(mapKey, fileMap.get(mapKey) + 1);
            } else {
                fileMap.put(mapKey, 1);
            }
        }

//        System.out.println(fileMap);


        for(String key : fileMap.keySet()){

            System.out.println(key + " " + fileMap.get(key));
        }


    }
}
