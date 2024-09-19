
public class Pattern2 {

	
		
		static void pattern(int n) {
			for(int i=1;i<=n;i++) {
				for(int j =1;j<=i;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num=5;
			pattern(num);
		}

	}