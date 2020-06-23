    import java.util.*;
    public class test {
            public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Deque<Integer> deque          = new ArrayDeque<>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();        
        int max = map.size();
        
        for (int i = 0; i < n; i++) {
            /* Remove old value (if necessary) */
            if (i >= m) {
                int old = deque.remove();
                if (map.get(old) == 1) {
                    map.remove(old);
                } else {
                    map.put(old, map.get(old) - 1);
                }
            }
            /* Add new value */
            int num = scan.nextInt();
            deque.add(num);
            map.merge(num, 1, Integer::sum);
            
            max = Math.max(max, map.size());
                        
            /* If all integers are unique, break out of loop */
            if (max == m) {
                break;
            }
        }
        
        scan.close();
        System.out.println(max);
    }
}



