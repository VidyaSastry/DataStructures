import java.io.*;
import java.util.*;

class DynamicArray{

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();

		ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>(n);
        
        for(int j = 0; j < n; j++){
            seqList.add(new ArrayList<Integer>());
        }

		int lastAns = 0;
		int seqType = Integer.MIN_VALUE;

		for(int i = 0; i < q; i++){
			int type = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();

			if(type == 1){
				seqType = (x ^ lastAns) % n;
				seqList.get(seqType).add(y);
			}else if(type == 2){
				seqType = (x ^ lastAns) % n;
                int s = y % (seqList.get(seqType)).size();
                lastAns =(int)(seqList.get(seqType)).get(s);
				System.out.println(lastAns);
			}
		}

    }
}