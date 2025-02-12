package lv.rvt;

public class electronics extends Product{


    public electronics (int a, double x, String name){
        super(a, x, name);
    }


    @Override
    public double getAveragePrice() {
        return super.totallprice / super.weight;
    }

}
