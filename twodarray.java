package fibonacciseries;

public class twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int twoD[][]=new int[3][4];
int i,j;
for(i=0;i<3;i++)
	for(j=0;j<4;j++)
		twoD[i][j]=i+j;
for(i=0;i<3;i++)
{
	for(j=0;j<4;j++)
		System.out.print(twoD[i][j]+"");
	System.out.println();
}
	}

}
