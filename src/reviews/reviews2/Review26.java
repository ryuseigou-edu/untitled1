package reviews.reviews2;

public class Review26 {
    public static void main(String[] args){
        int[] numArray = new int[]{11,12,13,14,15};
        int target = 13;
        int count = 0;
        for(int i = 0; i < numArray.length; i++){
            if(numArray[i] == target){
                count++;
            }
        }
        System.out.println("探索した値: " + target);
        System.out.println("一致した値: " + count);
    }
}
