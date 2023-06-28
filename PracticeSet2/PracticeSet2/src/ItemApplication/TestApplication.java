package ItemApplication;

import java.util.Scanner;

public class TestApplication {
	static Scanner sc = new Scanner(System.in);
	static Validations validations = new Validations();
	static int flag;
	static int cid = 200;
	static int id = 100;

//	create item id and item prices by using createItems
//	find item id
//	if item id present then display discount,customer id and etc
//	or else throw an error message i.e., item is not found
	public static void main(String[] args) {
//		create item id and item prices in object
		int op;
		Item item[] = createItems();
		do {
			System.out.println("\nChoose an option\n1.FindItem\n2.Display\n3.Exit\n");
			System.out.println("enter option:");
			op = sc.nextInt();
			switch (op) {
			case 1:
//				find item id
				System.out.println("enter item id");
				int itemId = sc.nextInt();
				int findItem = findItemId(item, itemId);
//				if item id present then display discount,customer id and etc
				if (flag == 0) {
					System.out.println("ITEM IS NOT FOUND");
				}
				break;
			case 2:
				// displaying items
				for (int i = 0; i < item.length; i++) {
					// System.out.println(item[i]);
					System.out.println(
							"Item [itemId=" + item[i].getItemId() + ", itemPrice=" + item[i].getItemPrice() + "]");
				}
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid option:");
			}

		} while (op != 3);
	}

//find item id
	private static int findItemId(Item[] item, int itemId) {
//	if item id present then display discount,customer id and etc
		flag = 0;
		for (int i = 0; i < item.length; i++) {
			if (itemId == item[i].getItemId()) {
				System.out.println("enter quantity:");
				int qunatity = sc.nextInt();
				int validQuantity = validations.validateId(qunatity);
				// calculate bill amount
				double billAmount = validQuantity * item[i].getItemPrice();
				System.out.println("Billamount:" + billAmount);
				// int billId = (int) (Math.random() * 30.0);
				int billId = getRandomId();
				// int customerId = (int) (Math.random() * 10.0);
				int customerId = getRandomCustomerId();
				double discount = 0.1 * billAmount;
				System.out.println("bill_id:" + billId + "\nc_id:" + customerId + "\npurchase_id:" + itemId
						+ "\ndiscount:" + discount);
				System.out.println("\nenter id that you want to update:");
				int updateId = sc.nextInt();
				int validUpdateId = validations.validateId(updateId);
				item[i].setItemId(validUpdateId);
				flag++;
			}
		}
		return flag;
	}

	// random customer id
	public static int getRandomCustomerId() {

		int random = (cid) / 2;
		cid = cid - 2;
		return random;
	}

	// random id
	public static int getRandomId() {

		int random = (id) / 2;
		id = id - 2;
		return random;
	}

//	create item id and item prices in object
	private static Item[] createItems() {

		System.out.println("enter number of items:");
		int number = sc.nextInt();
		int validNumber = validations.validateId(number);
		Item items[] = new Item[validNumber];
		for (int i = 0; i < validNumber; i++) {
			System.out.println("items:" + (i + 1));
			System.out.println("enter Item Id:");
			int itemId = sc.nextInt();
			int validId = validations.validateId(itemId);
			System.out.println("enter ItemPrices:");
			double itemPrice = sc.nextDouble();
			double validItemPrice = validations.validateDouble(itemPrice);
			Item item = new Item(validId, validItemPrice);
			items[i] = item;
		}
		return items;
	}

}
