import java.util.ArrayList;
import java.util.Collections;

public class DominoPile {

    private ArrayList<Domino> pile = new ArrayList<>();

    public DominoPile() {

        this.pile = pile;
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void setPile(ArrayList<Domino> pile) {
        this.pile = pile;
    }

    public void newStack6()
    {
        for(int i = 0; i < 7; i++)
        {
            for(int k=0; k < 7; k++)
            {
                if (pile.isEmpty())
                {
                    Domino newDom = new Domino(k, i);
                    pile.add(newDom);
                }
                else
                {
                    boolean add = true;
                    for (Domino domino : pile)
                    {
                        if ((i == domino.getTop() && k == domino.getBottom()) || (k == domino.getTop() && i == domino.getBottom())) {
                            add = false;
                            break;
                        }
                    }

                    if(add)
                    {
                        Domino newDom = new Domino(k, i);
                        pile.add(newDom);
//                        System.out.println(newDom.getTop() + ", " + newDom.getBottom() );
                    }
                }
            }
        }
//        System.out.println(pile.size());
    }

    public void shuffle()
    {
        Collections.shuffle(pile);
    }

}
