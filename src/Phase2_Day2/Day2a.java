package Phase2_Day2;
//string buider

public class Day2a {
    public static void main(String[] args) {

                // append() -> Adds data at the end
                StringBuilder sb1 = new StringBuilder("Hello");
                sb1.append(" World");
                System.out.println("append(): " + sb1);

                // length() -> Returns current length
                System.out.println("length(): " + sb1.length());

                // charAt() -> Returns character at index
                System.out.println("charAt(1): " + sb1.charAt(1));

                // setCharAt() -> Replaces character at index
                StringBuilder sb2 = new StringBuilder("hello");
                sb2.setCharAt(0, 'H');
                System.out.println("setCharAt(): " + sb2);

                // deleteCharAt() -> Deletes one character
                StringBuilder sb3 = new StringBuilder("ABCDE");
                sb3.deleteCharAt(2);
                System.out.println("deleteCharAt(): " + sb3);

                // delete(start,end) -> Deletes range (end index exclusive)
                StringBuilder sb4 = new StringBuilder("ABCDEFGHI");
                sb4.delete(2, 6);
                System.out.println("delete(): " + sb4);

                // insert() -> Inserts at specified position
                StringBuilder sb5 = new StringBuilder("ABCD");
                sb5.insert(2, "XYZ");
                System.out.println("insert(): " + sb5);

                // replace() -> Replaces a range
                StringBuilder sb6 = new StringBuilder("ABCDEFGHI");
                sb6.replace(2, 5, "XYZ");
                System.out.println("replace(): " + sb6);

                // reverse() -> Reverses the StringBuilder
                StringBuilder sb7 = new StringBuilder("HELLO");
                sb7.reverse();
                System.out.println("reverse(): " + sb7);

                // substring(start,end) -> Extracts part and returns String
                StringBuilder sb8 = new StringBuilder("ABCDEFGHI");
                System.out.println("substring(2,6): " + sb8.substring(2, 6));

                // indexOf() -> Finds first occurrence
                StringBuilder sb9 = new StringBuilder("hellohello");
                System.out.println("indexOf(\"lo\"): " + sb9.indexOf("lo"));

                // lastIndexOf() -> Finds last occurrence
                System.out.println("lastIndexOf(\"lo\"): " + sb9.lastIndexOf("lo"));

                // capacity() -> Returns internal capacity
                StringBuilder sb10 = new StringBuilder();
                System.out.println("capacity(): " + sb10.capacity());

                // ensureCapacity() -> Ensures minimum capacity
                sb10.ensureCapacity(100);
                System.out.println("ensureCapacity(100): " + sb10.capacity());

                // setLength() -> Changes length
                StringBuilder sb11 = new StringBuilder("ABCDEFGHI");
                sb11.setLength(4);
                System.out.println("setLength(4): " + sb11);

                // toString() -> Converts StringBuilder to String
                StringBuilder sb12 = new StringBuilder("HELLO");
                String str = sb12.toString();
                System.out.println("toString(): " + str);

                // append() with different data types
                StringBuilder sb13 = new StringBuilder();
                sb13.append(100);
                sb13.append(" ");
                sb13.append(99.5);
                sb13.append(" ");
                sb13.append(true);
                System.out.println("append multiple types: " + sb13);

                // Convert StringBuilder to char[]
                StringBuilder sb14 = new StringBuilder("JAVA");
                char[] arr = sb14.toString().toCharArray();

                System.out.print("StringBuilder -> char[]: ");
                for (char c : arr) {
                    System.out.print(c + " ");
                }
                System.out.println();

                // Convert char[] to StringBuilder
                char[] arr2 = {'D', 'S', 'A'};
                StringBuilder sb15 = new StringBuilder(new String(arr2));
                System.out.println("char[] -> StringBuilder: " + sb15);

                // Traversing StringBuilder using charAt()
                StringBuilder sb16 = new StringBuilder("CODE");

                System.out.print("Traversal: ");
                for (int i = 0; i < sb16.length(); i++) {
                    System.out.print(sb16.charAt(i) + " ");
                }
                System.out.println();
    }
}
