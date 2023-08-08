package coding;

interface menuItem {

}

class sandwich implements menuItem {
	String name;
	double price;

	sandwich(String name, double price) {
		this.name = name;
		this.price = price;
	}
}

class salad implements menuItem {
	String name;
	double price;

	salad(String name, double price) {
		this.name = name;
		this.price = price;
	}
}

class drink implements menuItem {
	String name;
	double price;

	drink(String name, double price) {
		this.name = name;
		this.price = price;
	}
}

public class trio1 implements menuItem {
	String name;
	double price;

	trio1(sandwich sand, salad sal, drink d) {
		this.name = sand.name + "/" + sal.name + "/" + d.name;
		if (sand.price > sal.price && sand.price > d.price) {
			this.price += sand.price;
			if (sal.price > d.price) {
				this.price += sal.price;
			} else {
				this.price += d.price;
			}
		} else if (sal.price > d.price) {
			this.price += sal.price;
			if (sand.price > d.price) {
				this.price += sand.price;
			} else {
				this.price += d.price;
			}
		} else {
			this.price += d.price;
			if (sal.price > sand.price) {
				this.price += sal.price;
			} else {
				this.price += sand.price;
			}
		}
	}

	public static void main(String args[]) {
		sandwich s1 = new sandwich("cheese", 10.0);
		salad sd1 = new salad("tomato", 7.0);
		drink d1 = new drink("choco", 2.0);
		trio1 t1 = new trio1(s1, sd1, d1);
		System.out.println(t1.name);
		System.out.println(t1.price);
	}

}
