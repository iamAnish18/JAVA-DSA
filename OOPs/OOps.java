public class OOps{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColour("red");
        System.out.println(p1.color);
    }
}

class Pen{
    String color;
    int tip;
    void setColour(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}
