	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	/*
	 * PRPALN
	 * */
	
	public class Main {
		public static void main(String[] args) throws Exception {
			new Main().go();
		}
		
		public void go() throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			for(int i=0; i<T; i++) {
				String str = br.readLine();
				if(str.length() == 1) {
					System.out.println("NO");
					continue;
				}
				int end = str.length()-1;
				boolean flag = false;
				for(int j=0; j<=str.length()/2; j++, end--) {
					if(str.charAt(j) != str.charAt(end)) {
						flag = true;
						if(isPalindrome(str, j)) {
							System.out.println("YES");
							break;
						}
						else if(isPalindrome(str, end)) {
							System.out.println("YES");
							break;
						}
						else {
							System.out.println("NO");
							break;
						}
					}
				}
				if(!flag) System.out.println("YES");
			}
			
		}
		
		public boolean isPalindrome(String str, int index) {
			for(int i=0, j=str.length()-1; i<=str.length()/2; i++, j--) {
				if(i == index) i++;
				if(j == index) j--;
				if(str.charAt(i) != str.charAt(j)) return false;
			}
			return true;
		}
	}
