package javabasicoops;


abstract class Words{
	abstract void letters();
	void m2() {
		System.out.println("Non abstarct method M2");
		}
	}

	public class Abstract extends Words {
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Abstract obj = new Abstract();
			obj.letters();
			obj.m2();

		}
		void letters() {
			System.out.println("Words can be formed using letters");
		}

	}
