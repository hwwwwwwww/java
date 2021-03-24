
public class ClientFullStack {

	public static void main(String[] args) throws FullStackException, EmptyStackException {
        try {
            PileBornee p = new PileBornee(3);
            p.push(11);
            System.out.println(p.top());
            p.push(22);
            System.out.println(p.top());
            p.push(33);
            System.out.println(p.top());
            p.push(44);
        } catch (FullStackException e) {
            System.out.println(e);
        }
    }
}
