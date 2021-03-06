import java.lang.Math;
import java.lang.Integer;

public class Intervalle {
	private int borneInf;
	private int borneSup;
	
	public Intervalle(int borneInf, int borneSup)throws IllegalArgumentException {
		if(borneInf > borneSup) {
			throw new IllegalArgumentException("borne inf invalide");
		}
		this.borneInf=borneInf;
		this.borneSup=borneSup;
	}
	public static final Intervalle INFINI_ZERO = new Intervalle(Integer.MIN_VALUE,0);
	public static final Intervalle ZERO_INFINI = new Intervalle(0,Integer.MAX_VALUE);
	public int getBorneInf() {
		return this.borneInf;
	}
	public int getBorneSup() {
		return this.borneSup;
	}
	public boolean comprend(int c) {
		if (this.borneInf <= c && c <= this.borneSup) {
			return true;
		}else {
			return false;
		}
	}
	public boolean disjoint(Intervalle i) {
		if(i.borneSup < this.borneInf || i.borneInf > this.borneSup) {
			return true;
		}else {
			return false;
		}
		
	}
	public Intervalle union(Intervalle i) throws IllegalArgumentException {
		if (this.disjoint(i)){
			throw new IllegalArgumentException("Les deux intervalles sont disjoints");
		}
		Intervalle i3 = new Intervalle(Math.min(this.borneInf, i.borneInf)
				,Math.max(this.borneSup,i.borneSup));
		return i3;
	}
	public Intervalle inter(Intervalle i) throws IllegalArgumentException {
		if (this.disjoint(i)){
			throw new IllegalArgumentException("Les deux intervalles sont disjoints");
		}
		Intervalle i3 = new Intervalle(Math.max(this.borneInf, i.borneInf)
				,Math.min(this.borneSup,i.borneSup));
		return i3;
	}
	@Override
	public String toString() {
		return "["+this.borneInf+" ; "+this.borneSup+"]";
	}
	
}
