package ch8.ex6;

public class StringFormatTest {
	public static void main(String[] args) {
		String sValue = " �̼���";
		int nValue = 543;
		long lValue = 543L;
		float fValue = 6.5E5f;
		double dValue = 7.654321E10d;

		//%s�� ���ڿ� ��¿� ���Ǵ� ��ȣ�̴�.
		System.out.println(String.format("%s �Դϴ�.", sValue));

		//%d�� ������ ��¿� ���Ǵ� ��ȣ�̴�.
		//%������ ���ڰ� ���� �� ���ڸ�ŭ�� �ڸ����� Ȯ���ȴ�.
		//%0������ ���ڰ� ���� �� ������ 0���� ä������.
		System.out.println(String.format("%d", nValue));
		System.out.println(String.format("%5d", nValue));
		System.out.println(String.format("%05d", nValue));


		System.out.println(String.format("%d", lValue));
		System.out.println(String.format("%5d", lValue));
		System.out.println(String.format("%05d", lValue));

		//%f�� �Ǽ��� ��¿� ���Ǵ� ��ȣ�̴�.
		//%f���� ���Ǵ� '0'�� �Ҽ����ڸ����� ��Ÿ����. 
		//����° '%05.05f' ���� �Ҽ����ڸ������� ����ȴ�.
		System.out.println(String.format("%f", fValue));
		System.out.println(String.format("%5.5f", fValue));
		System.out.println(String.format("%05.05f", fValue));

		System.out.println(String.format("%f", dValue));
		System.out.println(String.format("%5.5f", dValue));
		System.out.println(String.format("%05.05f", dValue));

	}
}
