package EliminateCodeDSA.TheCollectionsFrameWork.Arrays;

public class LearningArrays {
    public static void main(String[] args){
        int [] values = new int[100];
        String [] characters = new String[] {"null", "null"};

        values[0] = 1000;
        values[99] = 93432;
        characters[0] = "The first code is: "+values[0];
        characters[1] = "The last code is: "+values[values.length-1];

        System.out.println(values[0]);
        System.out.println(values[99]);
        System.out.println(characters[0]);
        System.out.println(characters[1]);
    }
}
