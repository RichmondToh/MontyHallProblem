import java.util.ArrayList;
import java.util.Arrays;

public class MontyProblem {

	public static void main(String[] args) {


		ArrayList<Integer> doors = new ArrayList<Integer>();
		int count=0;
		for(int i=0;i<1000;i++) {
			doors.clear();
			int random = (int) (Math.random()*3);
			doors.add(0);
			doors.add(0);
			doors.add(0);
			doors.set(random, 1);

			int randompick = (int) (Math.random()*3);

			int doorremoved =0;
			if(doors.get(0)==0 && randompick!=0){
				doors.set(0, -1);
				doorremoved=0;
			}
			else if(doors.get(1)==0 && randompick!=1){
				doors.set(1, -1);
				doorremoved=1;
			}
			else if(doors.get(2)==0 && randompick!=2){
				doors.set(2, -1);
				doorremoved=2;
			}
			int newdoor =0;
			for(int j=0;j<3;j++) {
				if(j!=doorremoved && j!=randompick) {
					newdoor=j;
				}
			}

			if(doors.get(newdoor)==1)
			count++;

		}


		System.out.print(count);




	}
}
