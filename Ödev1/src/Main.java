
public class Main {

	public static void main(String[] args) {
		Camp camp1 = new Camp(1, "C#+ANGULAR" , "Engin Demiroð",62);
		Camp camp2 = new Camp(2,"Java + React","Engin Demiroð",40);
		
		Camp[] camps = {
			camp1,
			camp2
		};
		for(Camp camp: camps) {
			System.out.println(camp.id);
			System.out.println(camp.name);
			System.out.println(camp.teacher);
			System.out.println(camp.precent);
		}
		
		CampManager campManager = new CampManager();
		campManager.addCamp(camp2);
		
		
		
	}

}
