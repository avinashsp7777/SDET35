package javaproject1;

public class ArrayInDecendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	a[]= {10,20,30,40,50};
	for(int i=0; i<a.length;i++) {
		for(int j=i+1; j<a.length;j++) {
			if(a[i]<a[j])
			{
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
	for(int i=0; i<a.length;i++) {
System.out.println(a[i]+" ");
	}
	}
}