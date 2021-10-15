import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

abstract class Shohin{
	private int shohinid;     
	private String shohinmei;     
	private int tanka;     
	private String shohinsetsumei;
	
	
    public void konyutetsuduki(int chumonid){}     
    public void hanbaimeisaikoshin(int chumonid){}     
    public abstract void haisotetsuduki(int chumonid);
    
    public Shohin(int shohinid, String shohinmei, int tanka, String shohinsetsumei) {
    	this.shohinid = shohinid;
    	this.shohinmei = shohinmei;
    	this.tanka = tanka;
    	this.shohinsetsumei = shohinsetsumei;
    }
    
    public void desc() {
    	System.out.println(shohinmei); 
    }
    
    public String getShohinmei() {
    	return shohinmei;
    }
    
    public int getShohinid() {
    	return shohinid;
    }
    
	public String toString() {
		return "" + shohinid + " " + shohinmei + " " + tanka + " " + shohinsetsumei;
	}
}


class YoyakuShohin extends Shohin{

	public YoyakuShohin(int shohinid, String shohinmei, int tanka, String shohinsetsumei) {
		super(shohinid, shohinmei, tanka, shohinsetsumei);
	}

	@Override
	public void haisotetsuduki(int chumonid) {}	
}


class TujyoShohin extends Shohin{

	public TujyoShohin(int shohinid, String shohinmei, int tanka, String shohinsetsumei) {
		super(shohinid, shohinmei, tanka, shohinsetsumei);
	}

	@Override
	public void haisotetsuduki(int chumonid) {}
}

class ShohinComparator implements Comparator<Shohin>{

	@Override
	public int compare(Shohin s, Shohin t) {
		return s.getShohinid() - t.getShohinid();
	}
}

public class KADAI23 {

	public static void main(String[] args) {
		ArrayList<Shohin> ls = new ArrayList<Shohin>();
		
        ls.add(new YoyakuShohin(223, "DELL", 150, "KKK"));         
		ls.add(new YoyakuShohin(128, "Surface", 160, "GHJ"));         
		ls.add(new YoyakuShohin(234, "Lavie", 160, "DEF"));         
        ls.add(new TujyoShohin(101, "HP", 100, "ABC"));
        
        Collections.sort(ls, new ShohinComparator());
        
        for(Shohin sh : ls) {
        	System.out.println(sh);
        }
        System.out.println(ls);
	}
}
