package main;

public class FactoryAddNew {

	Factory fa1;
	Factory2 fa2;
	public FactoryAddNew(Factory fa1, Factory2 fa2) {
		super();
		this.fa1 = fa1;
		this.fa2 = fa2;
	}
	public Factory getFa1() {
		return fa1;
	}
	public void setFa1(Factory fa1) {
		this.fa1 = fa1;
	}
	public Factory2 getFa2() {
		return fa2;
	}
	public void setFa2(Factory2 fa2) {
		this.fa2 = fa2;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fa1 == null) ? 0 : fa1.hashCode());
		result = prime * result + ((fa2 == null) ? 0 : fa2.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FactoryAddNew other = (FactoryAddNew) obj;
		if (fa1 == null) {
			if (other.fa1 != null)
				return false;
		} else if (!fa1.equals(other.fa1))
			return false;
		if (fa2 == null) {
			if (other.fa2 != null)
				return false;
		} else if (!fa2.equals(other.fa2))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FactoryAddNew [fa1=" + fa1 + ", fa2=" + fa2 + "]";
	} 
	
	
	
	
}
