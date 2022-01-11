package AssignmentPart1;

public class WaterTankCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tankCurrentFilledVol=0;
		int bucketCapacity=10;
		int tankCapacity=100;
		
		 for (int counter=1;counter<=bucketCapacity;counter++) {
			 tankCurrentFilledVol= bucketCapacity+tankCurrentFilledVol;
			  if(tankCurrentFilledVol==tankCapacity) 
			  {
				 System.out.println("Max Capacity of tank got filled");
				 break;
				 
	}
		 }
	}

}
