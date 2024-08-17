import java.util.ArrayList;

public class arrayList2d {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> food=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> candy=new ArrayList<Integer>();
        candy.add(2);
        candy.add(3);
        candy.add(4);

        ArrayList<Integer> choco=new ArrayList<Integer>();
        choco.add(1);
        choco.add(5);
        choco.add(8);

        ArrayList<Integer> biscuit=new ArrayList<Integer>();
        biscuit.add(2);
        biscuit.add(3);
        biscuit.add(5);

        food.add(candy);
        food.add(choco);
        food.add(biscuit);

        for(int i=0;i<food.size();i++){
            for(int j=0;j<food.get(i).size();j++){
                int c=food.get(i).get(j);
               System.out.println(c);
            }
        }

    }
}
