package coding;

import java.util.*;

interface DigitalTree{
	int absorbSunlight(int hours);
	String getTreeDetails();
}
class BinaryTree implements DigitalTree{

	String name;
	int energy = 0;
	
	BinaryTree(String name){
		this.name = name;
	}
	
	@Override
	public int absorbSunlight(int hours) {
		this.energy = 2*hours;
		return this.energy;
	}

	@Override
	public String getTreeDetails() {
		// TODO Auto-generated method stub
		return "Binary "+this.name +"- "+"Energy: "+this.energy;
	}
	
}
class QuantumTree implements DigitalTree{
	
	
	String name;
	int energy = 0;
	
	QuantumTree(String name){
		this.name = name;
	}

	@Override
	public int absorbSunlight(int hours) {
		this.energy = (int) (3*Math.pow(hours,2));
		return this.energy;
	}

	@Override
	public String getTreeDetails() {
		
		return "Quantum "+this.name +"- "+"Energy: "+this.energy;
	}
	
}

class NeuralTree implements DigitalTree{

	String name;
	int energy = 0;
	
	NeuralTree(String name){
		this.name = name;
	}
	
	@Override
	public int absorbSunlight(int hours) {
		this.energy = (int)Math.pow(hours,3);
		return this.energy;
	}

	@Override
	public String getTreeDetails() {
		
		return "Neural "+this.name +"- "+"Energy: "+this.energy;

	}
	
}

public class ForestManager1 {
	
	List<DigitalTree> trees = new ArrayList<>();
	void add(DigitalTree d) {
		trees.add(d);
	}
	int produceEnergyForForest(int hours){
		int sum =0;
		for(DigitalTree t : trees) {
			sum+=t.absorbSunlight(hours);
		}
		return sum;		
	}
	String getForestReport() {
		String result = "";
		for(DigitalTree t : trees) {
			result+=t.getTreeDetails()+"\n";
		}
		return result;
	}
	
	public static void main(String args[]) {
		ForestManager1 f = new ForestManager1();
		f.add(new BinaryTree("oak"));
		f.add(new QuantumTree("pine"));
		f.add(new QuantumTree("Maple"));
		
		System.out.println(f.produceEnergyForForest(2));
		
		String result = f.getForestReport();
		System.out.println(result);
		
	}
	

}



