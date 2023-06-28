package DS;

public class CalculateMarksOfStudents {

	
	
	public static void main(String[] args) {
		int[][] marks= {{75,76,65,87,87},{78,76,68,56,89},{67,87,78,77,65}};
		
		int[] totalMarks=getStudentsMarks(marks);
		for (int i = 0; i < totalMarks.length; i++) {	
			System.out.print(totalMarks[i]+ " ");
		}
	}

	private static int[] getStudentsMarks(int[][] marks) {

		int[] totalMarks=new int[marks.length];
		
		for (int i = 0; i < marks.length; i++) {
			int sum=0;
			for (int j = 0; j < marks[0].length; j++) {
				sum+=marks[i][j];
			}
			totalMarks[i]=sum;
		}
		System.out.println(" total Marks ");
		for (int i = 0; i < totalMarks.length; i++) {
			System.out.print(totalMarks[i] + " ");	
		}
		int minAvg=Integer.MAX_VALUE;
		int index=0;
		int k=0;
		for (int i = 0; i < marks[0].length; i++) {
			int sum=0;
			int avrage=0;
			for (int j = 0; j < marks.length; j++) {
				sum+=marks[j][i];
			}
			avrage=sum/marks[0].length;
			if(minAvg>avrage)
			{
				System.out.println("average "+ avrage);
				minAvg=avrage;
				index=i;
				System.out.println("index  "+ index);
			}
		}
		
		for (int i = 0; i < marks.length; i++) {
			
			for (int j = 0; j < marks[0].length; j++) {
				if(j==index)
				{
					totalMarks[i]=totalMarks[i]-marks[i][j];
				}
			}
		}
		
		return totalMarks;
	}

}
