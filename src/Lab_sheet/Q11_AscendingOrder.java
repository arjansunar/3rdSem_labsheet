package Lab_sheet;

public class Q11_AscendingOrder {
    public static void main(String[] args) {
        int x =15, y= 2, z=8;
        System.out.println("Ascending order for 15 2 8 is: "+
                ((x>y )?
                        (x>z)?
                            (y>z)? (z+" "+y+" "+x) :(y+" "+z+" "+x)
                            :(y+" "+x+" "+z)
                        :(y>z)? (x>z)? (z+" "+x+" "+y) :(x+" "+z+" "+y)
                                : (x+" "+y+" "+z) ));
    }
}
