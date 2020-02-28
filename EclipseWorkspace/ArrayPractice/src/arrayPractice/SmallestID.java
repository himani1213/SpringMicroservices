package arrayPractice;
import java.util.HashSet;
import java.util.Scanner;
public class SmallestID{
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
        String ip = ins.nextLine();
        
        String[] na = ip.split(" ");
        int noi = Integer.parseInt(na[0]);
        Long[] in = new Long[noi];
        for(int i =1; i<= noi;i++){
            in[i-1] = Long.parseLong(na[i]);
        }
        System.out.println(FN(in)); 
    }
    public static int FN(Long[] ins){
        
        boolean a = false;
        int n = 2;
        while(!a){
            HashSet<Long> um = new HashSet<>();
            int skip =0;
            for(int i=0;i<ins.length; i++){
                Long ni = ins[i]%n; 
                if(!um.add(ni)) {
                    if(ni==0) {
                        skip = skip*n;
                    }
                    n++;
                    if(n%skip==0)
                    n++;
                    i=0;
                    um.clear();
                }
            }
            
        }
        return n;
    }
}