import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CHEFSEG {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new CHEFSEG().go();
	}
	
	public void go() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			String[] input = br.readLine().split(" ");
			long x = Long.parseLong(input[0]);
			long k = Long.parseLong(input[1]);
			if((k & (k-1)) == 0) {
				System.out.println((double)x/(2*k));
			}
			else {
				double y = powerOfTwo(k);
				double z = k - y;
				System.out.println((2*z+1) * (double)x/(2*y));
			}
			
		}
	}
	
	public double powerOfTwo(double x) {
		double i=1;
		while(i < x) {
			i *=2;
		}
		return i/2;
	}

}
