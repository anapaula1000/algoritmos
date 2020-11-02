public class Area {
    public static void main(String[] args)
    {
        System.out.println("AreaCircle is " +  findAreaCircle(5));
        System.out.println("AreaRectangule is " +  findAreaRectangule(5, 10));
        System.out.println("AreaTriangle is " +  findAreaTriangle(5, 10));
        System.out.println("AreaTrapezio is " +  findAreaTrapezio(10, 5, 6));
        System.out.println("AreaCilindro is " +  findAreaCilindro(3, 6));
        System.out.println("AreaCube is " +  findAreaCube(3));
        System.out.println("AreaTetra is " +  findAreaTetra(3));
        System.out.println("VolumeTetra is " +  findVolumeTetra(3));
    }

    static final double PI = Math.PI;

    static double findAreaCircle(int r)
    {
        return PI * Math.pow(r, 2);
    }

    static double findAreaRectangule(int b, int h)
    {
        return b * h;
    }
    static double findAreaTriangle(int b, int h)
    {
        return (b * h)/2;
    }

    static double findAreaTrapezio(int B, int b, int h)
    {
        return ((B+b) * h)/2;
    }

    static double findAreaCilindro(int r, int h)
    {
        return 2*PI*r*(r+h);
    }

    static double findAreaCube(int a)
    {
        return 6*(a*a);
    }
    static double findAreaTetra(int side)
    {
        return (Math.sqrt(3) * (side * side));
    }
    static double findVolumeTetra(int s)
    {
        double vol = (double)Math.round((Math.pow(s, 3) / (6 * Math.sqrt(2))) * 100) / 100;
        return vol;
    }
}

