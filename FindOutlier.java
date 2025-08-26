public class FindOutlier {
    static int find(int[] integers) {

        int cntOdd =0;
        int cntEven =0;
        for(int i=0;i<3;i++){
            if(integers[i]%2==0)
                cntEven++;
            else
                cntOdd++;
        }
        if(cntEven>cntOdd){
            for(var el : integers)
                if(Math.abs(el)%2==1) return el;
        }
        else{
            for (var el : integers)
                if(Math.abs(el)%2==0) return el;
        }

        return 0;
    }
}
