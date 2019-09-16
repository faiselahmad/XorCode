import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Deque;
	import java.util.LinkedList;
	import java.util.StringTokenizer;
public class XorCode {
		private static FastReader fastReader = new FastReader();
		public static void main(String[] args) {
			Task solver = new Task();
			solver.solve();
		}

		static class Task{
			public void solve() {
				int tc = fastReader.nextInt();
				while(tc-->0){
					long L = fastReader.nextLong();
					long R = fastReader.nextLong();
					long l1 = L%2==0?(L/2):(L/2+1);
					long r1 = R%2==0?(R/2):(R/2+1);
					long ans = L%2==0?(r1-l1):(r1-l1 + 1);
					String result = ans%2==0?"Even":"Odd";
					System.out.println(result);
				}
			}
		}

		static class FastReader {
			public BufferedReader reader;
			public StringTokenizer tokenizer;

			public FastReader() {
				reader = new BufferedReader(new InputStreamReader(System.in));
				tokenizer = null;
			}

			public String next() {
				while (tokenizer == null || !tokenizer.hasMoreTokens()) {
					try {
						tokenizer = new StringTokenizer(reader.readLine());
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}
				return tokenizer.nextToken();
			}

			public int nextInt() {
				return Integer.parseInt(next());
			}

			public long nextLong() {
				return Long.parseLong(next());
			}
			
			public String readLine() {
				try {
					return reader.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return null;
			}
		}
	}

