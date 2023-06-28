package furniture;
import java.util.Scanner;
import bikeShowRoom.Bike;
import validations.Validations;
public class TestApplication {
	static int furnitureCount = 0;
	static Scanner sc = new Scanner(System.in);
	static Validations vs = new Validations();

	public static void main(String[] args) {
		int op;
		Furniture furnitures[] = {};
		do {
			System.out.println("choose an option\n1.Add Furniture details\n2.Based on Category\n3.Sorted price\n"
					+ "4.apply discount during sale times\n5.Exit\n");
			System.out.println("enter option\n");
			op = sc.nextInt();
			switch (op) {
			case 1:
				furnitures = addFurnitureDetails(furnitures);
				break;
			case 2:
				if (furnitureCount == 0) {
					System.out.println("No furnitures are available");
				} else {
					System.out.println("enter category:");
					String category = sc.next();
					boolean result = getSearchBasedOnCategory(furnitures, category);
					if (result == false) {
						System.out.println("not found:");
					}
				}
				break;
			case 3:
				if (furnitureCount == 0) {
					System.out.println("No furnitures are available");
				} else {
					Furniture sortedprice[] = getSortedBasedOnPrice(furnitures);
					displayDetails(sortedprice);
				}
				break;
			case 4:
				if (furnitureCount == 0) {
					System.err.println("No furnitures are available");
				} else {
					System.out.println("Apply discount during sales times");
					System.out.println("apply discounts or not:enter (true,false)");
					boolean b = sc.nextBoolean();
					if (b == true) {
						System.out.println("enter discount");
						double discount = getValidDiscount(sc.nextInt());
						double discountArray[] = new double[furnitureCount];
						for (int i = 0; i < furnitureCount; i++) {
							double discountPercentage = furnitures[i].getPrice() * (discount / 100);
							discountArray[i] = furnitures[i].getPrice() - (discountPercentage);
							System.out.println("Furniture [furniture name=" + furnitures[i].getItemName() + ","
									+ " category=" + furnitures[i].getCategory() + ", price=" + furnitures[i].getPrice()
									+ "price after discount :" + discountArray[i] + "]");

						}
					} else {
						displayDetails(furnitures);
					}
				}
				break;
			case 5:
				break;
			}

		} while (op != 5);
	}

	// get search based on category
	private static boolean getSearchBasedOnCategory(Furniture[] furnitures, String category) {
		int flag = 0;
		for (int i = 0; i < furnitureCount; i++) {
			if (furnitures[i].getCategory().equalsIgnoreCase(category)) {
				flag = 1;
				System.out.println("Furniture [furniture name=" + furnitures[i].getItemName() + ", category="
						+ furnitures[i].getCategory() + ", price=" + furnitures[i].getPrice() + "]");
			}
		}
		if (flag == 1) {
			return true;
		}
		return false;
	}

	// display details
	private static void displayDetails(Furniture[] sortedprice) {
		for (int i = 0; i < furnitureCount; i++) {
			System.out.println("Furniture [furniture name=" + sortedprice[i].getItemName() + ", category="
					+ sortedprice[i].getCategory() + ", price=" + sortedprice[i].getPrice() + "]");
		}
	}
	// sorted price
	private static Furniture[] getSortedBasedOnPrice(Furniture[] furnitures) {
		for (int i = 0; i < furnitureCount; i++) {
			for (int j = 0; j < furnitureCount - i - 1; j++) {
				if (furnitures[j].getPrice() > furnitures[j + 1].getPrice()) {
					Furniture temp = furnitures[j];
					furnitures[j] = furnitures[j + 1];
					furnitures[j + 1] = temp;
				}
			}
		}
		return furnitures;
	}
//add furnitures
	private static Furniture[] addFurnitureDetails(Furniture[] furnitures) {
		if (furnitures != null) {
			Furniture temp[] = new Furniture[furnitureCount + 1];
			for (int p = 0; p < furnitureCount; p++) {
				temp[p] = furnitures[p];
			}
			furnitures = temp;
			temp = null;
		} else {
			furnitures = new Furniture[1];
		}
		String uniqueItem = null;
		System.out.println("furniture details");
		System.out.println("enter item name:");
		String itemName = vs.validateString(sc.next());
		/*
		 * if (furnitureCount > 0) { uniqueItem= getUniqueCategory(category,
		 * furnitures); } else { uniqueItem = category; }
		 */
		System.out.println("enter price of the furnitures");
		double price = getValidPrice(sc.nextDouble());
		System.out.println("enter category name:");
		String category = vs.validateString(sc.next());
		furnitures[furnitureCount++] = new Furniture(itemName, category, price);
		return furnitures;
}
private static double getValidPrice(double price) {
		boolean isValid = true;
		while (isValid) {
			if (price < 50) {
				System.out.println("invalid input\nplz once again enter(price must be greater than 50)");
				price = sc.nextDouble();
			} else {
				isValid = false;
			}
		}
		return price;
	}
private static double getValidDiscount(double discount) {
		boolean isValid = true;
		while (isValid) {
			if (discount <= 0 || discount > 30) {
				System.out.println("invalid input\nplz once again enter(discount should not between 1 to 30)");
				discount = sc.nextDouble();
			} else {
				isValid = false;
			}
		}
		return discount;
	}
private static String getUniqueCategory(String category, Furniture[] furnitures) {
		boolean isValid = true;
		while (isValid) {
			int flag = 0;
			for (int j = 0; j < furnitureCount; j++) {
				if (furnitures[j].getCategory().equalsIgnoreCase(category)) {
					flag = 1;
				}
			}
			if (flag == 1) {
				System.out.println("furniture name is already exist:once again enter:");
				category = sc.next();
			} else {
				isValid = false;
			}

		}
		return null;
	}

}
