import java.util.*;

public class Main {
	public static boolean nextPermutation(char[] num) {
		int len = num.length;
		int i, index = 0;
		char temp, value = '0';
        
		for (i = len - 1; i > 0; i--) {
			if (num[i - 1] < num[i]) {
				value = num[i - 1];
				index = i - 1;
				break;
			}
		}

		if (i == 0)
			return false;

		for (i = len - 1; i > index; i--) {
			if (num[i] > value) {
				temp = value;
				num[index] = num[i];
				num[i] = temp;
				break;
			}
		}
        
		Arrays.sort(num, index + 1, len); 
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			
			char a[] = s.toCharArray();
			Arrays.sort(a);
			System.out.println(a);
			
			while (nextPermutation(a)) {
				System.out.println(a);
			}
			System.out.println();
		}
	}
} 
