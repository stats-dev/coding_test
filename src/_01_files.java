import java.util.*;

public class _01_files {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String[] fileArr = new String[N];
        Map<String, Integer> fileMap = new HashMap<String, Integer>();

        for(int i = 0; i < fileArr.length; i++){
            fileArr[i] = sc.nextLine();
            fileMap.put(fileArr[i].split("[.]")[1],
                    fileMap.getOrDefault(fileArr[i].split("[.]")[1], 0) + 1);
        }

        System.out.println(fileMap);

//        키로 정렬시킨다.
        List<String> keySet = new ArrayList<>(fileMap.keySet());

        // 키 값으로 오름차순 정렬
        Collections.sort(keySet);

        for(String key : keySet){

            System.out.println(key + " " + fileMap.get(key));
        }


    }
}
