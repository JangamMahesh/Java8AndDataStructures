package product;

import java.util.Scanner;

public class TestApplication {
	static Scanner sc = new Scanner(System.in);
	static Customer customers[] = {};
	static int customerCount = 0;
	static Product products[] = new Product[2];
	/* static Product parent = new Product(1, 20, "None", 10); */
	static Icecream icecream[] = { new Icecream(2, 30, "Icecream", 10, "vanila"),
			new Icecream(3, 40, "Icecream", 10, "strawBerry"), new Icecream(4, 40, "Icecream", 12, "raspberry"),
			new Icecream(5, 25, "Icecream", 11, "butterScotch"), new Icecream(6, 55, "Icecream", 16, "chachobar") };
	static Book book[] = { new Book(101, 40, "Harry porter", 20, "Rowling", "01-01-1978"),
			new Book(102, 41, "ramayanam", 20, "valmiki", "01-01-1890"),
			new Book(103, 123, "Rage", 20, "Ricahard", "01-01-1912"),
			new Book(104, 40, "Malgudi", 20, "narayan", "01-01-1910") };

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int op = 0;
		do {
			System.out.println("1.buy products\n2. exit");
			System.out.println("choose option");
			op = sc.nextInt();
			switch (op) {
			case 1:
				createCustomers(customers);
				break;
			case 2:
				break;
			default:
				System.out.println("invalid option");
				break;
			}
		} while (op != 2);

	}

	private static void createCustomers(Customer[] customers) {
		// TODO Auto-generated method stub
		boolean onceAgain = true;
		float bill = 0;
		int id = 0;
		if (customers != null) {
			Customer temp[] = new Customer[customerCount + 1];
			for (int l = 0; l < customerCount; l++) {
				temp[l] = customers[l];
			}
			customers = temp;
			temp = null;
		} else {
			customers = new Customer[1];
		}

		while (onceAgain) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Icecream [type=" + icecream[i].getType() + ", getProducId()="
						+ icecream[i].getProducId() + ", getPrice()=" + icecream[i].getPrice() + ", getProdcutName()="
						+ icecream[i].getProdcutName() + ", getCount()=" + icecream[i].getCount() + "]");
			}
			System.out.println();
			for (int j = 0; j < 4; j++) {
				System.out.println("Book [" + " getPublishedDate()=" + book[j].getPublishedDate() + ", getAuthorName()="
						+ book[j].getAuthorName() + ", getProducId()=" + book[j].getProducId() + ", getPrice()="
						+ book[j].getPrice() + ", getProdcutName()=" + book[j].getProdcutName() + ", getCount()="
						+ book[j].getCount() + "]");
			}
			System.out.println();
			System.out.println("enter productname book or icecream");
			String str = sc.next();
			if ("book".equalsIgnoreCase(str)) {
				System.out.println("enter prodcut id");
				id = sc.nextInt();
				for (int i = 0; i < 4; i++) {
					if (book[i].getProducId() == id) {
						System.out.println("enter quantity u want to buy");
						int quantity = sc.nextInt();
						int validQuant = validadteQuantity(quantity, i);
						customers[customerCount] = new Customer(id, validQuant);
						customers[customerCount].setBill(getBill(validQuant, book[i]));
						System.out.println("total bill " + customers[customerCount].getBill());
						/* products[customerCount] = book[i]; */
						book[i].setCount(book[i].getCount() - validQuant);
						System.out.println("do u want to buy another product (yes or no)");
						if ("no".equalsIgnoreCase(sc.next())) {
							onceAgain = false;
						}
					}
				}
			} 
			else if ("icecream".equalsIgnoreCase(str)) {
				System.out.println("enter prodcut id");
				id =validateId(sc.nextInt(),icecream);
				for (int j = 0; j < 5; j++) {
					if (icecream[j].getProducId() == id) {
						System.out.println("enter quantity u want to buy");
						int quantity = sc.nextInt();
						int validQuant = getVaildQunat(quantity, j);
						customers[customerCount] = new Customer(id, validQuant);
						customers[customerCount].setBill(getBill(validQuant, icecream[j]));
						System.out.println("total bill "  + customers[customerCount].getBill());
						products[customerCount] = icecream[j];
						icecream[j].setCount(icecream[j].getCount() - validQuant);
						System.out.println("do u want to buy another product (yes or no)");
						if ("no".equalsIgnoreCase(sc.next())) {
							onceAgain = false;
						}
					}
				}
			} else {
				System.out.println("prodcut id not found ");
			}

		}
		customerCount++;
	}

	private static int validateId(int nextInt, Icecream[] icecream2) {
		// TODO Auto-generated method stub
		boolean flag=false;
		boolean isValid=true;
		while(isValid) {
		for(int i=0;i<icecream2.length;i++) {
			if(icecream[i].getProducId()==nextInt) {
				flag=true;
			}
		}
		if(flag) {
			isValid=false;;
		}
		else {
			System.out.println("product id is not existed enter once again" );
			nextInt=sc.nextInt();
		}
		
	}
		return nextInt;
	}

	private static float getBill(int validQuant, Icecream icecream2) {
		// TODO Auto-generated method stub
		return icecream2.getPrice() * validQuant;

	}

	private static float getBill(int validQuant, Book book2) {
		// TODO Auto-generated method stub
		return book2.getPrice() * validQuant;
	}

	private static int getVaildQunat(int nextInt, int id) {
		// TODO Auto-generated method stub
		boolean isValid = true;
		while (isValid) {
			if (icecream[id].getCount() < nextInt) {
				System.out.println("enter lesser number");
				nextInt = sc.nextInt();
			} else {
				isValid = false;
			}

		}

		return nextInt;
	}
	private static int validadteQuantity(int nextInt, int id) {
		// TODO Auto-generated method stub
		boolean isValid = true;
		while (isValid) {
			if (book[id].getCount() < nextInt) {
				System.out.println("enter lesser than previous number");
				nextInt = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return nextInt;
	}

}
