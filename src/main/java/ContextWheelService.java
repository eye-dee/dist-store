public class ContextWheelService {

  private static final String UUID_REG =
      "[a-zA-Z]+:[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}";

  public static void main(String[] args) {
    final String query = "(Organization:5d69dfc2-9c01-11e8-8ba0-35ba5ca34446 OR "
        + "(Concept:623a7aad-9c01-11e8-8ba0-4f41efcb66ed AND Person:60e523da-9c01-11e8-8ba0-91d2424e66e8))";

    final String regex = UUID_REG + "[^(?!.*OR)$]*[ ]+AND[ ]+" + UUID_REG;
    System.out.println(regex);
    System.out.println(query);
    final String s = query.replaceAll(regex, "($0)");

    System.out.println(s);
  }

}
