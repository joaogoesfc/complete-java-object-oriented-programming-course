package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import entities.ProductOrder;
public class Program {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		List<ProductOrder> orders = new ArrayList<ProductOrder>();
		
		System.out.print("Enter the file path: ");
		String strPath = sc.next();
		
		File file = new File(strPath);
		
		String sourceFolderStr = file.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		System.out.println("Folder out " + success);
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
	
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			
			String line = br.readLine();
			while (line != null) {
				String [] p = line.split(",");
				System.out.println(Arrays.toString(p));
				String name = p[0];
				Double price = Double.parseDouble(p[1]);
				Integer quantity = Integer.parseInt(p[2]);
				
				orders.add(new ProductOrder(name, price, quantity));
				
				line = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				for(ProductOrder order : orders) {
					bw.write(order.getName() + ", " + String.format("%.2f", order.total()) );
					bw.newLine();
				}
			}
			catch (IOException e) {
				System.out.println("Error " + e.getMessage());
			}
 		}
		catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		finally {
			sc.close();
		}
		
		System.out.println(orders.get(0).getName());
	}

}
