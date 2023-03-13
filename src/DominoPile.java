import java.util.ArrayList;

public class DominoPile {

    private ArrayList<Domino> pile = new ArrayList<Domino>();

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
                    System.out.println(pile);
                    for (Domino domino : pile)
                    {
                        int currTop = domino.getTop();
                        int currBottom = domino.getBottom();
                        System.out.println(currTop);
                        System.out.println(currBottom);
                        if (i == currTop && k == currBottom) {

                        } else if (k == currTop && i == currBottom) {

                        } else {
                            Domino newDom = new Domino(k, i);
//                            pile.add(newDom);
                        }
                    }
                }
            }
        }
        System.out.println(pile.size());
    }

    public void shuffle()
    {

    }

}
