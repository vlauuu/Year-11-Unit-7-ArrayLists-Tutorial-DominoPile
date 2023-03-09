public class Domino {
    private int top;
    private int bottom;

    public Domino(int top, int bottom){

        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }


    public void flip()
    {
        int tempTop = top;
        top = bottom;
        bottom = tempTop;
    }

    public void settle()
    {
        if(bottom < top)
        {
            int tempTop = top;
            top = bottom;
            bottom = tempTop;
        }
    }

    public int compareTo(Domino otherD)
    {
        int smallestD1;
        int smallestD2;

        if(top > bottom)
        {
            smallestD1 = bottom;
        }
        else {
            smallestD1 = top;
        }

        if(otherD.getTop() > otherD.getBottom())
        {
            smallestD2 = otherD.getBottom();
        }
        else {
            smallestD2 = otherD.getTop();
        }

        System.out.println(smallestD1);
        System.out.println(smallestD2);

        if (smallestD1 < smallestD2)
        {
            return -1;

        } else if (smallestD1 > smallestD2)
        {
            return  1;
        }
        else{
            return 0;
        }
    }

    public int compareToWeight(Domino otherD){

        int thisTotal = top + bottom;
        int otherTotal = otherD.getBottom() +  otherD.getTop();
        int out = 0;

        if(thisTotal > otherTotal)
        {
            out = 1;
        } else if (thisTotal < otherTotal) {
            out = -1;
        }

        return out;

    }

    public boolean canConnect(Domino otherD){

        boolean out = false;
        int otherTop = otherD.getTop();
        int otherBottom = otherD.getBottom();


        if (top == otherTop || top == otherBottom || bottom == otherTop || bottom == otherBottom)
        {
            out = true;
        }

        return out;

    }



}
