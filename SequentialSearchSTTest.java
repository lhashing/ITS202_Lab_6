public class SequentialSearchSTTest{
	public static void main(String[] args) {
		SequentialSearchST<String, Integer> obj = new SequentialSearchST<String, Integer>();
		obj.put("L",11);
		obj.put("P",10);
		obj.put("M",9);
		obj.put("X",7);
		obj.delete("M");

		assert(obj.size() == 3);

		System.out.println(obj.keys());
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());

        System.out.println("All Test Cases Passed");

	}
}