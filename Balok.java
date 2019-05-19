package TugasGSLC2;

public class Balok extends PersegiPanjang {
        
	
		public double VolBalok (double p, double l, double t){
        double volbalok;
        volbalok = luasPersegiPanjang(p,l)*t;
        return volbalok;
    }
}
