import java.util.ArrayList;
import java.util.List;

/**
 * Created by br0ce on 02.07.14.
 */
public class A
{
	private String mTxt;
	private List<String> mList;

	public A()
	{
		mTxt = new String();
		mList = new ArrayList<String>();
	}

	public A(String txt, List<String> list)
	{
		mTxt = new String(txt);
		mList = new ArrayList<String>(list);
	}

	public void setTxt(String txt) { mTxt = txt;}
	public String getTxt() { return mTxt; }
	public void addToList(String txt) { mList.add(txt); }
	public void changeListAt(String txt, int index) { mList.set(index, txt); }
	public String getTxtAtIndex(int index) { return mList.get(index); }

	@Override
	public boolean equals(Object o)
	{
		if(!(o instanceof A)) return false;
		if(!(this.mTxt.equals(((A) o).mTxt))) return false;
		if(!(this.mTxt.equals(((A) o).mTxt))) return false;
		return true;
	}

	@Override
	public A clone()
	{
		return new A(this.mTxt, this.mList); //welcher Gleichheitstest?!
	}

	public static void main(String args[])
	{
		A a1 = new A();

		a1.setTxt("Hallo Kitty! ");
		a1.addToList(a1.getTxt());
		a1.addToList(a1.getTxt());

		System.out.println("a1:\t" + a1.getTxtAtIndex(0) + a1.getTxtAtIndex(1));

		A a12 = a1.clone();

		if(a1.equals(a12))
			System.out.println("a12\t" + a12.getTxtAtIndex(0) + a12.getTxtAtIndex(1));

		a12.changeListAt("Hallo nochmal Kitty", 1);

		System.out.println("\na1:\t" + a1.getTxtAtIndex(0) + a1.getTxtAtIndex(1));
		System.out.println("a12:\t");
		System.out.print(a12.getTxtAtIndex(0) + a12.getTxtAtIndex(1));
	}
}

