import java.util.*;

public class _01_files_hashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String[] fileArr = new String[N];
        Map<String, Integer> fileMap = new HashMap<>();

        for(int i = 0; i < fileArr.length; i++){
            fileArr[i] = sc.nextLine();
            String mapKey = fileArr[i].split("[.]")[1];
            if(fileMap.containsKey(mapKey)){
                fileMap.put(mapKey, fileMap.get(mapKey) + 1);
            } else {
                fileMap.put(mapKey, 1);
            }
        }

        Object[] keyArr = fileMap.keySet().toArray();
        Arrays.sort(keyArr);

//        이 경우 정렬된 것이 배열로 만들어 졌으니 그대로 이걸 사용해서 for문으로 출력함.
        for(int i = 0; i < keyArr.length; i++){
            System.out.println(keyArr[i] + " " + fileMap.get(keyArr[i]));
        }
//        keySet을 쓰면 도루묵이다. 쓰지 말자.
//        for(String key : fileMap.keySet()){
//
//            System.out.println(key + " " + fileMap.get(key));
//        }


    }
}
