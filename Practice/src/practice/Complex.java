package practice;

class Complex {

	private double re, im;

	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}

	

	public Complex(Complex c1) {
		// TODO Auto-generated constructor stub
		re=c1.re;
		im=c1.im;
	}
void display() {
	System.out.println(re);
	System.out.println(im);
}

	public static void main(String[] args) {
		Complex c1 = new Complex(10, 15);
		Complex c2 = new Complex(c1);// compiler error here
		c2.im=122;
		c2.re=21;
		c1.display();
		c2.display();
	}

}