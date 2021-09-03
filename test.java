Import java.io.*;
Public class userInput {
	Public static void main (String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Try {
			System.out.println(“Enter your name :”);
			String name = br.readLine();
			Sytem.out.println(“Name you entered is “ + name);
		} 
catch (Exception e) {
			System.out.println(“Error found…”);
		}
	}
}
