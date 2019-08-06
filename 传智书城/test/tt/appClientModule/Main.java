public class Main {
	public Main() {
		super();
	}
	private static int numJewelsInStones(String j, String s) {
		int flag=0;
		for(int i=0;i<j.length();i++){
			for(int m=0;m<s.length();m++){
				if(j.charAt(i)==s.charAt(m))
					flag++;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		String J="aA",S="aaAAAsSD";
		int c=numJewelsInStones(J,S);
		System.out.println("J在S中存在"+c+"个！");
	}
}