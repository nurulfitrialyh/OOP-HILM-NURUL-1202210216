public class Calculation implements Runnable {
    double radius;
    double side;
    double area;
    double phi = 3.14;

    public void setSquare(){
       area = (4*side);
       if (side<1){
        throw new IllegalArgumentException();
       } 
    }

    public double getSquare(){
        return area;
    }

    public void setCircle(){
        area = phi*radius;
        if(radius<1){
            throw new IllegalArgumentException();
        }

    }

    public double getCircle(){
        return area;
    }

    public void setTrapezoid(double a, double b, double t){
        area = 0.5 * (a+b) * t;
        if ((a<1) && (b<1) && (t<1)){
            throw new IllegalArgumentException();
        }
    }

    public double getTrapezoid(){
        return area;
    }

    public void run(){
        System.out.println("Program will start in");
        for (int i = 0; i < 3; i++ ){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
