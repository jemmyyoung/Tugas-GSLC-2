package TugasGSLC2;

public class Lingkaran {
    
    	protected double luasLing(double r){
        double luasling;
        luasling = 3.14 * r * r;
        return luasling;
    }
    	public double VolTabung(double r, double t){
        double voltabung ;
        voltabung = luasLing(r) * t;
        return voltabung;
    }
}
