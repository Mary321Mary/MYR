package task6;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class rykzak{
	public static void main(String[] args) {
		new rykzak().run();
	}
	private List<Item> items;
    private Backpack bag;
 
    public rykzak() {
        items=new ArrayList<>();
        bag=new Backpack();        
    }
 
    public void run(){
    	int n;
		double newSet=0, newSet1=0;
    	String s;
		Scanner sc=new Scanner(System.in);
		System.out.print("¬ведите количество видов вещей: ");
		n=sc.nextInt();
		for (int i=0; i<n; i++){
			System.out.print("¬ведите название вещи: ");
			s=sc.next();
			System.out.print("¬ведите вес: ");
			newSet=sc.nextDouble();
			System.out.print("¬ведите стоимость: ");
			newSet1=sc.nextDouble();
	        items.add(new Item(s, newSet, newSet1));
		}
		System.out.print("¬ведите максимальный вес: ");
		bag.setMaxW(sc.nextDouble());
		System.out.print("¬ведите максимальную стоимость: ");
		bag.setMaxC(sc.nextDouble());
        sortirovka(items.size());
        for(int i=0; i<combi(items.size()); i++){
            System.out.println(items.get(i).getName());        	
        }
    }
    
    private void sortirovka(int n){
    	String s;
    	Double r;
    	for (int i=0; i<n-1; i++)
    		for (int j=0; j<n-i-1; j++)
    			if (items.get(j).getWeight()>items.get(j+1).getWeight()){
    				r=items.get(j).getWeight();
    				items.get(j).setWeight(items.get(j+1).getWeight());
    				items.get(j+1).setWeight(r);
    				
    				r=items.get(j).getValue();
    				items.get(j).setValue(items.get(j+1).getValue());
    				items.get(j+1).setValue(r);
    				
    				s=items.get(j).getName();
    				items.get(j).setName(items.get(j+1).getName());
    				items.get(j+1).setName(s);
    			}
    }
    
    private int combi(int l){
		double newSet=0, newSet1=0;
		int q=0;
    	if (l>0){
        	for(int j=0; j<l; j++){
        		newSet+=items.get(j).getWeight();
        		newSet1+=items.get(j).getValue();
        	}
            q=CheckSet(newSet, newSet1);
    	}   	
        if(l-1>0 && q==0){
        	return combi(l-1);
        }else{
        	return l;
        }
    }
    
    private int CheckSet(double items, double items1){
        if (items<=bag.getMaxW() && items1<=bag.getMaxC()){
        	return 1;
        }else{
        	return 0;
        }
    }
}
