import java.util.*;

public class _01_files_treeMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String[] fileArr = new String[N];
//        TreeMap은 자체적으로 Key를 오름차순으로 정렬합니다.
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

        // 향상된 for문을 활용해서 출력.
        for(String key : fileMap.keySet()){

            // 문자열을 연결한다.
            System.out.println(key + " " + fileMap.get(key));
        }


    }
}
