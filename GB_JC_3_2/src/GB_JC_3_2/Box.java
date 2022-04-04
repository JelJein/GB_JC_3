package GB_JC_3_2;

import java.util.ArrayList;

public class Box <Type extends Fruit> {

    private ArrayList<Type> listOfFruits = new ArrayList<>();

    public void add(Type fruit) {
        listOfFruits.add(fruit);
    }

    public int getWeight() {
        if (listOfFruits.size() == 0) {
            return 0;
        } else {
            return listOfFruits.size() * listOfFruits.get(0).getWeight();
        }
    }

    public boolean compare(Box<?> boxForCompare) {
        return this.getWeight() == boxForCompare.getWeight();
    }

    public void addAll(Box<Type> boxToMix) {
        boxToMix.listOfFruits.addAll(this.listOfFruits);
        this.listOfFruits.clear();
    }

    public ArrayList<Type> getListOfFruits() {
        return listOfFruits;
    }

    public void setListOfFruits(ArrayList<Type> listOfFruits) {
        this.listOfFruits = listOfFruits;
    }
}
