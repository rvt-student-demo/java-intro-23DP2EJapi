package lv.rvt;

public class Food extends Product{
    private int productcount;
    public double totallprice;

    public Food (int a, double x, String name){
        super(a, x, name);
    }


    @Override
    public double getAveragePrice() {
        return super.weight / super.totallprice;
    }

}
